
#### 内容
##### MongoDB分片概括
* 分片是在多台服务器上分布数据的方法，Mongodb使用分片来支持具有非常大的数据集和高吞吐量的操作的部署
* 具有大数据集和高吞吐量应用程序的数据库系统，可以挑战单台服务器的容量

* 有两种方法来解决系统增长
  * 垂直缩放：增加单个服务器的容量，例如CPU、RAM等
  * 包括将系统数据和负载在多个服务器，增加额外的服务器，需要增加容量

* MongodDB支持水平扩展：分片
  > 分片将大的数据集分配到多台主机上，每个分片是一个独立的数据库，这些分片整体上构成了一个完整的逻辑数据库。分片减少了每台服务器上的数据操作量，随着集群的增长，每台分片处理越来越少的数据，结果增加了系统整体的服务性能。另外，分片还减少了每台服务器需要存储的数据量

##### MongoDB中的分片
* MongDB通过配置分片集群来支持分片，一个集群包括如下几个组件：分片，查询，路由，配置服务器
  * 分片：用来存储数据，为了提供系统可用性和数据一致性，一个生产环境的分片集群，通常每个分片是一个副本集
  * 查询路由：指客户端应用访问每个分片的路径
  * 配置服务器：存储集群的元数目，这些数据包含了集群数据集到各分片的映射关系



#### 参考
* [如何在单机部署MongoDB集群](https://www.jianshu.com/p/663103de8ed5)
* [mongodb单机版安装及集群安装](https://blog.csdn.net/qq_36305027/article/details/80561222)
* [mongodb 在单机上搭建分片集群 详细实战过程](https://blog.csdn.net/mchdba/article/details/51884319)
* [MongoDB在单机上搭建分片副本集群(windows)，版本二](http://www.cnblogs.com/a-horse-mosaic/p/9284297.html)
* [mongodb分布式集群搭建手记](https://www.cnblogs.com/littleatp/p/8563273.html)
* [Mongodb分片集群部署](https://www.jianshu.com/p/cb55bb333e2d)
* [MongoDB 分片集群技术](https://www.cnblogs.com/clsn/p/8214345.html)
* [MongoDB4.0.2集群搭建](https://www.jianshu.com/p/e1855a1d38b7)
* [MongoDB4.0搭建分布式集群](https://blog.csdn.net/kevinmcy/article/details/82712074)