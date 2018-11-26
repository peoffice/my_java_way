#### docker 常用命令及遇到的问题

* 如果运行：```docker exec -it {image_id} /bin/bash```命令返回错误：OCI runtime exec failed: exec failed: container_linux.go:348: starting container process caused "exec: \"bash\": executable file not found in $PATH": unknown
  * 可以尝试:```docker exec -it image_id ash```
  * 也可以尝试:```docker exec -it image_id sh```

#### Dockfile
* Dokcer镜像Docker 镜像是一个特殊的文件系统，除了提供容器运行时所需的程序、库、资源、配置等文件外，还包含了一些为运行时准备的一些配置参数（如匿名卷、环境变量、用户等）。镜像不包含任何动态数据，其内容在构建之后也不会被改变。
* 镜像的定制实际上就是定制每一层所添加的配置、文件。如果我们可以把每一层修改、安装、构建、操作的命令都写入一个脚本，用这个脚本来构建、定制镜像，那么之前提及的无法重复的问题、镜像构建透明性的问题、体积的问题就都会解决。这个脚本就是 Dockerfile。
* Dockerfile 是一个文本文件，其内包含了一条条的指令(Instruction)，每一条指令构建一层，因此每一条指令的内容，就是描述该层应当如何构建。有了 Dockerfile，当我们需要定制自己额外的需求时，只需在 Dockerfile 上添加或者修改指令，重新生成 image 即可，省去了敲命令的麻烦。
* Dockerfile文件格式
```
# This dockerfile uses the ubuntu image
# VERSION 2 - EDITION 1
# Author: docker_user
# Command format: Instruction [arguments / command] ..
 
# 1、第一行必须指定 基础镜像信息
FROM ubuntu
 
# 2、维护者信息
MAINTAINER docker_user docker_user@email.com
 
# 3、镜像操作指令
RUN echo "deb http://archive.ubuntu.com/ubuntu/ raring main universe" >> /etc/apt/sources.list
RUN apt-get update && apt-get install -y nginx
RUN echo "\ndaemon off;" >> /etc/nginx/nginx.conf
 
# 4、容器启动执行指令
CMD /usr/sbin/nginx
```
* Dockerfile指令详解
  * FROM制定基础镜像
    * ```FROM <image>```
    * ```FROM <image>:<tag>```
    * ```FROM <image>:<digest>```
    * FROM 必须 是 Dockerfile 中第一条非注释命令
    * 在一个 Dockerfile 文件中创建多个镜像时，FROM 可以多次出现。只需在每个新命令 FROM 之前，记录提交上次的镜像 ID。
    * tag 或 digest 是可选的，如果不使用这两个值时，会使用 latest 版本的基础镜像
  * RUN执行命令
    * shell格式：```RUN<command>```
    * exec格式：```RUN["executable","param1","param2"]```
    * RUN 命令将在当前 image 中执行任意合法命令并提交执行结果。命令执行提交后，就会自动执行 Dockerfile 中的下一个指令。
    * 层级 RUN 指令和生成提交是符合 Docker 核心理念的做法。它允许像版本控制那样，在任意一个点，对 image 镜像进行定制化构建。
    * RUN 指令创建的中间镜像会被缓存，并会在下次构建中使用。如果不想使用这些缓存镜像，可以在构建时指定 ```--no-cache``` 参数，如：```docker build --no-cache```。

  * COPY复制文件
    * ```COPY <source>... <target>```
    * ```COPY ["<souce>",... "<target>"]```

  * ADD更高级的复制文件
    * ADD指令和COPY的格式和性质基本一致。但是在COPY基础上更加了一些功能

  * ENV设置环境变量
    * ```ENV <key> <value>```
    * ```ENV <key1>=<value1> <key2>=<value2>

  * EXPOSE
    * 为构建的镜像设置监听端口，使容器在运行时监听
    * ```EXPOSE <port> [<port>...]```
    * EXPOSE指令并不会让容器监听host的端口，如果需要，需要在docker run时使用-p参数来发布容器端口到host的某个端口上

  * VOLUME
    * VOLUME用于创建挂载点，即向基于所构建镜像创始的容器添加卷
    * 一个卷可以存在于一个或多个容器的指定目录，该目录可以绕过联合文件系统，并具有以下功能：
      * 卷可以容器间共享和重用
      * 容器并一定要和其他容器共享卷
      * 修改卷后会立即生效
      * 对卷的修改不会对镜像产生影响
      * 卷会一直存在，直到没有任何容器在使用它

  * WORKDIR指定工作目录
    * 用于在容器内设置一个工作目录
    * 通过WORKDIR设置工作目录后，Dockerfile中后面命令RUN、CMD、ENTRYPOINT、ADD、COPY等命令都会在该目录下执行

  * USER指定当前用户
    * ```USER user```

  * CMD
    * ```CMD ["executable","param1","param2"]```
    * ```CMD ["param1","param2"]```
    * ```CMD command param1 param2```

  * ENTRYPOINT
    * ENTRYPOINT用于给容器配置一个可执行程序。也就是说，每次使用镜像创建容器时，通过ENTRYPOINT指定的程序都会被设置为默认程序
    * ```ENTRYPOINT ["executable", "param1", "param2"]```
    * ```ENTRYPOINT command param1 param2```

  * LABEL
    * 用于为镜像添加元数据，元数以键值对的形式指定：
    * ```LABEL <key>=<value> <key>=<value> <key>=<value>```

  * ARG
    * 用于指定传递给构建运行时的变量
    * ```ARG <name>[=<default value>]```

  * ONBUILD
    * 用于设置镜像触发器，当所构建的镜像被用作其他镜像的基础镜像，该镜像中的触发器将会被触发
    * ```ONBUILD [INSTRUCION]```

  * STOPSIGNAL
    * 用于设置停止容器所要发送的系统调用信号
    * ```STOPSIGNAL singal```

  * SHELL
    * 用于设置执行命令所使用的默认shell类型
    * ```SHELL ["executable", "parameters"]```
  
  * 原则与建议
    * 容器轻量化。从镜像中产生的容器应该尽量轻量化，能在足够短的时间内停止、销毁、重新生成并替换原来的容器。
    * 使用 .gitignore。在大部分情况下，Dockerfile 会和构建所需的文件放在同一个目录中，为了提高构建的性能，应该使用 .gitignore 来过滤掉不需要的文件和目录。
    * 为了减少镜像的大小，减少依赖，仅安装需要的软件包。
    * 一个容器只做一件事。解耦复杂的应用，分成多个容器，而不是所有东西都放在一个容器内运行。如一个 Python Web 应用，可能需要 Server、DB、Cache、MQ、Log 等几个容器。一个更加极端的说法：One process per container。
    * 减少镜像的图层。不要多个 Label、ENV 等标签。
    * 对续行的参数按照字母表排序，特别是使用apt-get install -y安装包的时候。
    * 使用构建缓存。如果不想使用缓存，可以在构建的时候使用参数--no-cache=true来强制重新生成中间镜像

#### Docker Compose
* Docker Compose介绍
  * Docker-Compose是Docker的一种编排服务，是一个用于在Docker上定义并运行复杂应用的工具，可以让用户在集群中部署分布式应用
  * 通过Docker-Compose用于可以很容易地用一个配置文件定义一个多容器的用用，然后使用一条指令安装这个应用的所有依赖，完成构建
  * Docker-Compose解决了容器与容器之间如何管理编排的问题
  * Compose中两个重要的概念
    * 服务：一个应用的容器，实际上可以包括若干运行相同镜像的容器实例
    * 项目：由一组关联的应用容器组成的一个完整业务单元，在docker-compose.yml文件中定义
  * 一个项目可以由多个服务（容器）关联而成，Compose面向项目进行管理，通过子命令对项目中的一组容器进行便捷地生命周期管理
  * 在后台启动服务```docker-compose up -d```
  * 查看启动的服务```docker-compose ps```
  * 停止服务```docker-compose stop```
  * 其他常用命令
    * 查看帮助```docker-compose -h```
    * -f  指定使用的 Compose 模板文件，默认为 docker-compose.yml，可以多次指定。```docker-compose -f docker-compose.yml up -d``` 
    * 启动所有容器，-d 将会在后台启动并运行所有的容器```docker-compose up -d```
    * 停用移除所有容器以及网络相关```docker-compose down```
    * 查看服务容器的输出```docker-compose logs```
    * 列出项目中目前的所有容器```docker-compose ps```
    * 构建（重新构建）项目中的服务容器。服务容器一旦构建后，将会带上一个标记名，例如对于 web 项目中的一个 db 容器，可能是 web_db。可以随时在项目目录下运行 ```docker-compose build``` 来重新构建服务
    * 拉取服务依赖的镜像```docker-compose pull```
    * 重启项目中的服务```docker-compose restart```
    * 删除所有（停止状态的）服务容器。推荐先执行 ```docker-compose stop``` 命令来停止容器。
    * ```docker-compose rm``` 
    * 在指定服务上执行一个命令。```docker-compose run ubuntu ping docker.com```
    * 设置指定服务运行的容器个数。通过 service=num 的参数来设置数量```docker-compose scale web=3 db=2```
    * 启动已经存在的服务容器。```docker-compose start```
    * 停止已经处于运行状态的容器，但不删除它。通过 ```docker-compose start``` 可以再次启动这些容器。
    * ```docker-compose stop```
#### Docker Machine
* Docker Machine是Docker官方编排（Orchestration）项目之一，负责在多种平台上快速安装Docker环境）
* Docker Machine是一个工具，它允许你在虚拟宿主机上安装Docker Engine，并使用docker-machine命令管理这些宿主机。
* 使用docker-machine命令，你可以启动、审查、停止和重新启动托管的宿主机、升级Docker客户端和守护程序、并配置Docker客户端与你的宿主机通信
* Docker Engine和Docker Machine有什么区别？
  * Docker Engine是一个客户端服务器应用程序，由Docker守护进程、一个REST API指定与守护进程交互的接口、和一个命令行接口（CLI）与守护进程通信（通过封装REST API）。
  * Docker Machine是一个用于配置和管理你的宿主机（上面具有Docker Engine的主机）的工具。
* Docker Machine常用命令
  * 创建虚拟机```docker-machine create [OPTIONS] [arg...]```
  * 移除虚拟机```docker-machine rm [OPTIONS] [arg...]```
  * 登录虚拟机```docker-machine ssh [arg...]```
  * docker客户端配置环境变量```docker-machine env [OPTIONS] [arg...]```
  * 检查机子信息```docker-machine inspect```
  * 查看虚拟机列表```docker-machine ls [OPTIONS] [arg...]```
  * 查看虚拟机状态```docker-machine status [arg...]```//一个虚拟机名称
  * 启动虚拟机```docker-machine start [arg...]```//一个或多个虚拟机名称
  * 停止虚拟机```docker-machine stop [arg...]```//一个或多个虚拟机名称
  * 重启虚拟机```docker-machine restart [arg...]```//一个或多个虚拟机名称
  #### Docker Swarm
  * Docker Swarm是一个为IT运维团队提供集群和调度能力的编排工具。用户可以把集群中所有Docker Engine整合进一个“虚拟Engine”的资源池，通过执行命令与单一的主Swarm进行沟通而不必分别和每个Docker Engine沟通。在灵活的调度策略下，IT团队可以更好地管理可用的主机资源，保证应用容器的高效运行。



#### 参考
##### 纯洁的微笑
* [Docker(一)：Docker入门教程](https://www.cnblogs.com/ityouknow/p/8520296.html)
* [Docker(二)：Dockerfile 使用介绍](https://www.cnblogs.com/ityouknow/p/8588725.html)
* [Docker(三)：Dockerfile 命令详解](https://www.cnblogs.com/ityouknow/p/8595384.html)
* [Spring Boot 2.0(四)：使用 Docker 部署 Spring Boot](https://www.cnblogs.com/ityouknow/p/8599093.html)
* [Docker(四)：Docker 三剑客之 Docker Compose](https://www.cnblogs.com/ityouknow/p/8648467.html)
* [Spring Boot 2.0(五)：Docker Compose + Spring Boot + Nginx + Mysql 实践](https://www.cnblogs.com/ityouknow/p/8661644.html)
* [Docker(五)：Docker 三剑客之 Docker Machine](https://www.cnblogs.com/ityouknow/p/8674247.html)
* [Spring Boot 2.0(六)：使用 Docker 部署 Spring Boot 开源软件云收藏](https://www.cnblogs.com/ityouknow/p/8689942.html)
* [Docker(六)：Docker 三剑客之 Docker Swarm](https://www.cnblogs.com/ityouknow/p/8903975.html)

#### Tips
* SIT：集成测试
* UAT：验收测试

