<head> 
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/all.js"></script> 
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/v4-shims.js"></script> 
</head> 
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css">

### 书籍
* The Linux Command Line
* http://billie66.github.io/TLCL/book/index.html

### Introduction
* Linux和GNU系统
  > 每天都有许多计算机用户使用一个被改动过的GNU系统，但是他们并没有意识到。经过一系列的事件，现在被广泛使用的GNU版本则经常被称作“Linux”，而且许多用户并不了解它基本上就是GNU系统，是由GNU工程开发的。

  > Linux确实存在，许多人都在使用它，但它仅仅是所用系统的一部分。Linux是内核：它是为你运行的其他程序分配计算机资源的程序。内核是操作系统的基本部分，但是它自己并无用处；它只能在完整的操作系统框架下才能发挥作用。Linux一般和GNU操作系统一起使用：整个系统基本上就是GNU加上Linux，或叫GNU/Linux。所有被叫做“Linux”的发行版实际上是GNU/Linux发行版。

  > 许多用户并不了解作为内核的Linux和也被称作“Linux”的整个系统的区别。而不加区别地使用该名称并不能帮助人们对此的理解。这些用户常常认为Linus Torvalds在1991年凭借一些帮助完成了整个操作系统的开发。

  > 程序员一般知道Linux是一个内核。但是他们一般也听到整个系统叫“Linux”，他们通常会设想的历史是整个系统要以内核命名。例如，许多人相信一旦Linus Torvalds完成了Linux内核，其用户就搜索一些自由软件来和内核一起工作，此时他们发现（没有特别的原因）构成一个类似Unix系统的大多数必要组件已经有了。

  > 他们的发现不是巧合—它正是还没有全部完成的GNU系统。这些已经完成的自由软件加在一起就构成了完整的系统，因为GNU工程从1984年起就在做这件事。在GNU宣言中，我们已经阐明了开发一个自由的类似Unix的系统的目标，它叫做GNU。GNU工程的初始声明也勾画了GNU系统的一些原始计划。在Linux开始时，GNU几乎已经完成。

  > 大多数自由软件项目以完成某项具体工作为目标。例如，Linus Torvalds编写一个类似Unix的内核（Linux）；Donald Knuth编写一个文本排版软件（TeX）；Bob Scheifler开发一个窗口系统（X Window系统）。测量该工程里各个程序的贡献是一件自然的事情。

  > 如果我们这样测量GNU工程的贡献，我们会得出什么结论？一个CD-ROM提供商发现在他们的“Linux发行版”中，GNU软件占单一最大的比重，大约是整个源代码的28%，其中包括一些关键性主要部件，没有它们，就没有整个系统。Linux自身占大约3%。（这个比例在2008年也差不多：在gNewSense的“主”库中，Linux占1.5%，而GNU包占15%。）所以如果你要根据谁的代码多来命名系统，最合适的单个选择是“GNU”。

  > 但是这不是考虑此问题的最深刻方法。GNU工程过去不是、现在也不是，一个开发专门软件包的项目。它不是一个开发C编译器的工程，不过我们做了。它也不是一个开发文本编辑器的工程，我们也做了。GNU工程是要开发一个完全自由的类似Unix的系统：GNU。

  > 许多人已经为系统中的自由软件作出了重大贡献，他们都应该获得荣誉。但GNU是一个整合系统—而不是一些实用程序集合的原因是，GNU工程的最初目标就是做一个完整系统。我们曾经为完成一个完整的自由系统列了一个所需程序的清单，而且我们系统地寻找、编写、或者征询别人编写清单上的每一个程序。我们编写了关键的但是十分枯燥的(1)主要部件，因为这是系统所必需的。有些系统部件，比如编程工具，自己也变成程序员使用的流行工具，但是我们还编写了许多不是工具的部件(2)。我们甚至还开发了一个国际象棋游戏，叫GNU Chess，因为一个完整的系统也需要游戏。

  > 到了90年代初期，我们曾经把除了内核以外的东西放到一起组成了一个系统。我们也在开始开发一个内核，称为GNU Hurd，运行在Mach1之上。开发这个内核比我们预期的要难得多；GNU Hurd在2001年开始可以稳定工作，但是距离能够为人们正常使用还有很长的路要走。

  > 庆幸的是，我们不必再等Hurd了，因为有了Linux。当Linus Torvalds在1992年使Linux成了自由软件，它填补了GNU系统的一个重要空白。人们可以把Linux和GNU系统结合起来组成一个完整的自由系统—一个带有Linux的GNU系统。换句话说，就是GNU/Linux系统。

  > 把它们组合到一起并不是一个简单的工作。有些GNU部件(3)需要作大量的修改才能适应Linux。把系统集成到一个完整的发行版本中、使之“能够直接安装并工作”也是一项艰巨的工作。它需要考虑如何安装和启动系统—我们那时还未处理此问题，因为我们还没有走到那一步。因此，那些开发了不同的发行版的人们作出了许多重要的工作。但是这些工作的属性是，它们终究会被某些人做的。

  > GNU工程支持GNU/Linux系统，就象支持其GNU系统一样。FSF为重写与Linux相关的GNU C库提供资金，以至于它们现在可以很好地集成在一起，最新版本的GNU/Linux系统使用当前库而无需修改。FSF也为早期Debian GNU/Linux的开发提供资金。

  > 今天有很多不同的GNU/Linux系统（通常叫做“发行版”）。它们大多数包含了非自由软件—它们的开发者遵循的是和Linux相关的哲学，而不是GNU的哲学。然而，也有完全自由的GNU/Linux发行版。FSF支持和gNewSense发行版相关的电脑及其周边件。

  > 制作一个自由的GNU/Linux发行版不止是剔除非自由软件。现在，常规的Linux版本也带有非自由程序。这些程序会在系统启动时加载到I/O（输入输出）设备，它们以很长的数字形式包含在Linux的“源代码”中。所以，维护自由的GNU/Linux发行版现在承担着维护一个自由版Linux的责任。

  > 无论你是否使用GNU/Linux，请不要含糊不清地使用“Linux”这一名称来混淆大众。Linux是一个内核，是系统的主要基本部件之一。整个系统基本上是GNU系统，加上Linux。如果你说的是这个组合，请称之为“GNU/Linux”。

  > 如果你想为“GNU/Linux”提供参考链接，本页面和http://www.gnu.org/gnu/the-gnu-project.html是好的选择。如果你说的是作为内核的Linux，要为它提供参考链接，http://foldoc.org/linux是一个好的URL
* Further Reading
  * Here are some Wikipedia articles about the famous people mentioned above:
    * http://en.wikipedia.org/wiki/Linus_Torvalds
    * http://en.wikipedia.org/wiki/Richard_Stallman
  * The Free Software Foundation and the GNU Project:
    * http://en.wikipedia.org/wiki/Free_Software_Foundation
    * http://www.fsf.org
    * http://www.gnu.org
  * Richard Stallman has written extensively on the “GNU/Linux” naming issue:
    * http://www.gnu.org/gnu/why-gnu-linux.html
    * http://www.gnu.org/gnu/gnu-linux-faq.html#tools

### Part One - Learning The Shell

#### 1 - What Is The Shell?
* bash: 是Bourne Again SHell的首字母缩写，所指的是这样一个事实，bash是最初Unix上由Steve Bourne写成shell程序sh的增强版
* 不论是teminal，konsole，还是gnome-terminal，都完成相同的事情，让我们都能访问shell
* user@host $ 一般用户登陆   user@host # 超级用户（root）
* 许多Linux发行版默认保存最后输入的500个命令
* 常用命令：```date,cal,df,free,exit```
* 即使终端仿真器没有运行，在后台仍然有几个终端会话运行着，它们叫做虚拟终端或者虚拟控制台，在大多数Linux发行版中，这些终端会话都可以通过按下ctrl-alt-f1到ctrl-alt-f6访问
* Further reading
  * http://en.wikipedia.org/wiki/Steve_Bourne
  * http://en.wikipedia.org/wiki/Shell_(computing)

#### 2 - Navigation
* 文件系统树，管理整个系统的文件，不像windows，每个存储设备都有一个独立的文件系统，它只有一个单一的文件系统树
* 常用命令 ```pwd,cd,ls```
* 关于文件名的重要规则
  * 以"."字符开头的文件名是隐藏文件
  * 文件名和命令名是大小写敏感的
  * Linux没有“文件扩展名”的概念，不像其他一些系统
  * 虽然Linux支持长文件名，文件名可能包含空格，标点符号，但标点符号仅限使用.,-,_

#### 3 - Exploring The System
* 常用命令 ```ls,file,less```
* Linux系统中的目录
  > |目录|说明|
  > |---|---|
  > |/|根目录，万物起源|
  > |/bin|包含系统启动和运行所必须的二进制程序|
  > |/boot|包含 Linux 内核、初始 RAM 磁盘映像（用于启动时所需的驱动）和 启动加载程序。<br>有趣的文件：<li> /boot/grub/grub.conf or menu.lst， 被用来配置启动加载程序 <li> /boot/vmlinuz，Linux 内核。|
  > |/dev|这是一个包含设备结点的特殊目录。“一切都是文件”，也适用于设备。 在这个目录里，内核维护着所有设备的列表。|
  > |/etc|这个目录包含所有系统层面的配置文件。它也包含一系列的 shell 脚本， 在系统启动时，这些脚本会开启每个系统服务。这个目录中的任何文件应该是可读的文本文件。<br>有趣的文件：虽然/etc 目录中的任何文件都有趣，但这里只列出了一些我一直喜欢的文件：<li> /etc/crontab， 定义自动运行的任务。<li> /etc/fstab，包含存储设备的列表，以及与他们相关的挂载点。<li> /etc/passwd，包含用户帐号列表|
  > |/home|在通常的配置环境下，系统会在/home 下，给每个用户分配一个目录。普通用户只能 在自己的目录下写文件。这个限制保护系统免受错误的用户活动破坏|
  > |/lib|包含核心系统程序所使用的共享库文件。这些文件与 Windows 中的动态链接库相似|
  > |/lost+found|每个使用 Linux 文件系统的格式化分区或设备，例如 ext3文件系统， 都会有这个目录。当部分恢复一个损坏的文件系统时，会用到这个目录。这个目录应该是空的，除非文件系统 真正的损坏了|
  > |/media|在现在的 Linux 系统中，/media 目录会包含可移动介质的挂载点， 例如 USB 驱动器，CD-ROMs 等等。这些介质连接到计算机之后，会自动地挂载到这个目录结点下。|
  > |/mnt|在早些的 Linux 系统中，/mnt 目录包含可移动介质的挂载点|
  > |/opt|这个/opt 目录被用来安装“可选的”软件。这个主要用来存储可能 安装在系统中的商业软件产品|
  > |/proc|这个/proc 目录很特殊。从存储在硬盘上的文件的意义上说，它不是真正的文件系统。 相反，它是一个由 Linux 内核维护的虚拟文件系统。它所包含的文件是内核的窥视孔。这些文件是可读的， 它们会告诉你内核是怎样监管计算机的|
  > |/root|root 帐户的家目录|
  > |/sbin|这个目录包含“系统”二进制文件。它们是完成重大系统任务的程序，通常为超级用户保留|
  > |/tmp|这个/tmp 目录，是用来存储由各种程序创建的临时文件的地方。一些配置导致系统每次 重新启动时，都会清空这个目录|
  > |/usr|在 Linux 系统中，/usr 目录可能是最大的一个。它包含普通用户所需要的所有程序和文件|
  > |/usr/bin|/usr/bin 目录包含系统安装的可执行程序。通常，这个目录会包含许多程序|
  > |/usr/lib|包含由/usr/bin 目录中的程序所用的共享库|
  > |/usr/local|这个/usr/local 目录，是非系统发行版自带程序的安装目录。 通常，由源码编译的程序会安装在/usr/local/bin 目录下。新安装的 Linux 系统中会存在这个目录， 并且在管理员安装程序之前，这个目录是空的|
  > |/usr/sbin|包含许多系统管理程序|
  > |/usr/share|/usr/share 目录包含许多由/usr/bin 目录中的程序使用的共享数据。 其中包括像默认的配置文件、图标、桌面背景、音频文件等等|
  > |/usr/share/doc|大多数安装在系统中的软件包会包含一些文档。在/usr/share/doc 目录下， 我们可以找到按照软件包分类的文档。|
  > |/var|除了/tmp 和/home 目录之外，相对来说，目前我们看到的目录是静态的，这是说， 它们的内容不会改变。/var 目录存放的是动态文件。各种数据库，假脱机文件， 用户邮件等等，都位于在这里。|
  > |/var/log|这个/var/log 目录包含日志文件、各种系统活动的记录。这些文件非常重要，并且 应该时时监测它们。其中最重要的一个文件是/var/log/messages。注意，为了系统安全，在一些系统中， 你必须是超级用户才能查看这些日志文件|
* 符号链接（软链接）
* Further reading
  * 完整的 Linux 文件系统层次体系标准可通过以下链接找到：<br> http://www.pathname.com/fhs/
  
#### 4 - Manipulating Files And Directories
* 常用命令
  * ```cp```，复制文件和目录
  * ```mv```，移动/重命名文件和目录
  * ```mkdir```，创建目录
  * ```rm```，删除文件和目录
  * ```ln```，创建硬链接和符号链接
* 通配符
  * 常用通配符
    > |通配符|意义|
    > |---|---|
    > |*|匹配任意多个字符（包括零个或一个）|
    > |?|匹配任意一个字符（不包括零个）|
    > |[characters|匹配任意一个属于字符集中的字符|
    > |[!characters|匹配任意一个不是字符集中的字符|
    > |[:class:]|匹配任意一个属于指定字符类中的字符|
  * 常用字符类
    > |字符类|意义|
    > |---|---|
    > |[:alnum:]|匹配任意一个字母或数字|
    > |[:alpha:]|匹配任意一个字母|
    > |[:digit:]|匹配任意一个数字|
    > |[:lower:]|匹配任意一个小写字母|
    > [:upper:]|匹配任意一个大写字母|
  * 通配符范例
    > |模式|匹配对象|
    > |---|---|
    > |*|所有文件|
    > |g*|文件名以“g”开头的文件|
    > |b*.txt|以"b"开头，中间有零个或任意多个字符，并以".txt"结尾的文件|
    > |Data???|以“Data”开头，其后紧接着3个字符的文件|
    > |[abc]*|文件名以"a","b",或"c"开头的文件|
    > |BACKUP.[0-9][0-9][0-9]|以"BACKUP."开头，并紧接着3个数字的文件|
    > |[[:upper:]]*|以大写字母开头的文件|
    > |[![:digit:]]*|不以数字开头的文件|
    > |*[[:lower:]123]|文件名以小写字母结尾，或以 “1”，“2”，或 “3” 结尾的文件|
* mkdir - 创建目录
* cp - 复制文件和目录
  > cp选项
  > |选项|意义|
  > |---|---|
  > |-a, --archive|复制文件和目录，以及它们的属性，包括所有权和权限。 通常，复本具有用户所操作文件的默认属性。|
  > |-i, --interactive|在重写已存在文件之前，提示用户确认。如果这个选项不指定， cp 命令会默认重写文件。|
  > |-r, --recursive|递归地复制目录及目录中的内容。当复制目录时， 需要这个选项（或者-a 选项）|
  > |-u, --update|当把文件从一个目录复制到另一个目录时，仅复制 目标目录中不存在的文件，或者是文件内容新于目标目录中已经存在的文件|
  > |-v, --verbose|显示翔实的命令操作信息|

* mv - 移动和重命名文件
  > mv选项
  > |选项|意义|
  > |---|---|
  > |-i --interactive|在重写一个已经存在的文件之前，提示用户确认信息。 如果不指定这个选项，mv 命令会默认重写文件内容。|
  > |-u --update|当把文件从一个目录移动另一个目录时，只是移动不存在的文件， 或者文件内容新于目标目录相对应文件的内容。|
  > |-v --verbose|当操作 mv 命令时，显示翔实的操作信息|

* rm - 删除文件和目录
  > rm选项
  > |选项|意义|
  > |---|---|
  > |-i, --interactive|	在删除已存在的文件前，提示用户确认信息。 如果不指定这个选项，rm 会默默地删除文件|
  > |-r, --recursive|递归地删除文件，这意味着，如果要删除一个目录，而此目录 又包含子目录，那么子目录也会被删除。要删除一个目录，必须指定这个选项|
  > |-f, --force|忽视不存在的文件，不显示提示信息。这选项覆盖了“--interactive”选项。|
  > |-v, --verbose|在执行 rm 命令时，显示翔实的操作信息|

* ln - 创建链接
  * 硬链接
    > 与更加现代的符号链接相比，硬链接是最初 Unix 创建链接的方式。每个文件默认会有一个硬链接， 这个硬链接给予文件名字。我们每创建一个硬链接，就为一个文件创建了一个额外的目录项。 硬链接有两个重要局限性：
      * 一个硬链接不能关联它所在文件系统之外的文件。这是说一个链接不能关联 与链接本身不在同一个磁盘分区上的文件
      * 一个硬链接不能关联一个目录
    > 一个硬链接和文件本身没有什么区别。不像符号链接，当你列出一个包含硬链接的目录 内容时，你会看到没有特殊的链接指示说明。当一个硬链接被删除时，这个链接 被删除，但是文件本身的内容仍然存在（这是说，它所占的磁盘空间不会被重新分配）， 直到所有关联这个文件的链接都删除掉。知道硬链接很重要，因为你可能有时 会遇到它们，但现在实际中更喜欢使用符号链接，下一步我们会讨论符号链接
  * 符号链接
    > 创建符号链接是为了克服硬链接的局限性。符号链接生效，是通过创建一个 特殊类型的文件，这个文件包含一个关联文件或目录的文本指针

    > 一个符号链接指向一个文件，而且这个符号链接本身与其它的符号链接几乎没有区别。 例如，如果你往一个符号链接里面写入东西，那么相关联的文件也被写入。然而， 当你删除一个符号链接时，只有这个链接被删除，而不是文件自身。如果先于符号链接 删除文件，这个链接仍然存在，但是不指向任何东西。在这种情况下，这个链接被称为 坏链接。在许多实现中，ls 命令会以不同的颜色展示坏链接，比如说红色，来显示它们 的存在。
    
#### 5 - Working With Commands
* 常用命令
  * type - 说明怎样解释一个命令名
  * which - 显示会执行哪个可执行程序
  * man - 显示命令手册
  * apropos - 显示一系列合适的命令
  * info - 显示命令info
  * whatis - 显示一个命令的简洁描述
  * alias - 创建命令别名
* 什么是命令，可以是：
  * 是一个可执行的程序
  * 是一个内建于shell自身的命令
  * 是一个shell函数
  * 是一个命令别名
* Further Reading
  * Bash手册<br>http://www.gnu.org/software/bash/manual/bashref.html
  * Bash FAQ <br>http://mywiki.wooledge.org/BashFAQ
  * GUN项目列表<br>http://www.gnu.org/manual/manual.html
  * http://en.wikipedia.org/wiki/Man_page


#### 6 - Redirection
* 常用命令
  * cat - 连接文件
  * sort - 排序文本行
  * uniq - 报导或省略重复行
  * grep - 打印匹配行
  * wc - 打印文件中换行符，字，和字节个数
  * head - 输出文件第一部分
  * tail - 输出文件最后一部分
  * tee - 从标准输入读取数据，并同时写到标准输出和文件

#### 7 - Seeing The World As The Shell Sees It
* 常用命令
  * echo - 显示一行文本
* Further reading
  * http://www.gnu.org/software/bash/manual/bashref.html


#### 8 - Advanced Keyboard Tricks
* 常用命令
  * clear - 清空屏幕
  * history - 显示历史列表内容
* 命令行编辑
  * 移动光标
    > |按键|行动|
    > |---|---|
    > |Ctrl-a|移动光标到行首|
    > |Ctrl-e|移动光标到行尾|
    > |Ctrl-f|光标前移一个字符；和右箭头作用一样|
    > |Ctrl-b|光标后移一个字符；和左箭头作用一样|
    > |Alt-f|光标前移一个字|
    > |Alt-b|光标后移一个字|
    > |Ctrl-l|清空屏幕，移动光标到左上角。clear 命令完成同样的工作|
  * 修改文本
    > |按键|行动|
    > |---|---|
    > |Ctrl-d|删除光标位置的字符|
    > |Ctrl-t|光标位置的字符和光标前面的字符互换位置|
    > |Alt-t|光标位置的字和其前面的字互换位置|
    > |Alt-l|把从光标位置到字尾的字符转换成小写字母|
    > |Alt-u|把从光标位置到字尾的字符转换成大写字母|
  * 剪切和粘贴文本
    > |按键|行动|
    > |---|---|
    > |Ctrl-k|剪切从光标位置到行尾的文本|
    > |Ctrl-u|剪切从光标位置到行首的文本|
    > |Alt-d|剪切从光标位置到词尾的文本|
    > |Alt-Backspace|剪切从光标位置到词头的文本。如果光标在一个单词的开头，剪切前一个单词|
    > |Ctrl-y|把剪切环中的文本粘贴到光标位置|
* 自动补全: tab
  > |按键|行动|
  > |---|---|
  > |Alt-?|显示可能的自动补全列表。在大多数系统中，你也可以完成这个通过按 两次 tab 键，这会更容易些|
  > |Alt-*|插入所有可能的自动补全。当你想要使用多个可能的匹配项时，这个很有帮助|
* 历史命令
  > |按键|行为|
  > |---|---|
  > |Ctrl-p|移动到上一个历史条目。类似于上箭头按键|
  > |Ctrl-n|移动到下一个历史条目。类似于下箭头按键|
  > |Alt-<|移动到历史列表开头|
  > |Alt->|移动到历史列表结尾，即当前命令行|
  > |Ctrl-r|反向增量搜索。从当前命令行开始，向上增量搜索|
  > |Alt-p|反向搜索，非增量搜索。（输入要查找的字符串，按下 Enter来执行搜索）|
  > |Alt-n|向前搜索，非增量|
  > |Ctrl-o|执行历史列表中的当前项，并移到下一个。如果你想要执行历史列表中一系列的命令，这很方便|
* 历史命令展开
  > |序列|行为|
  > |---|---|
  > |!!|重复最后一次执行的命令。可能按下上箭头按键和 enter 键更容易些|
  > |!number|重复历史列表中第 number 行的命令|
  > |!string|重复最近历史列表中，以这个字符串开头的命令|
  > |!?string|重复最近历史列表中，包含这个字符串的命令|
* Further reading
  * http://en.wikipedia.org/wiki/Computer_terminal

#### 9 - Permissions
* 常用命令
  * id - 显示用户身份号
  * chmod - 更改文件模式
  * umask - 设置默认的文件权限
  * su - 以另一个用户的身份来运行shell
  * sudo - 以另一个用户的身份来执行命令
  * chown - 更改文件的所有者
  * chgrp - 更改文件组所有权
  * passwd - 更改用户密码
* 文件类型
  > |属性|文件类型|
  > |---|---|
  > |-|一个普通文件|
  > |d|一个目录|
  > |l|一个符号链接。注意对于符号链接文件，剩余的文件属性总是"rwxrwxrwx"，而且都是 虚拟值。真正的文件属性是指符号链接所指向的文件的属性|
  > |c|一个字符设备文件。这种文件类型是指按照字节流来处理数据的设备。 比如说终端机或者调制解调器|
  > |b|一个块设备文件。这种文件类型是指按照数据块来处理数据的设备，例如一个硬盘或者 CD-ROM 盘|
* 权限属性
  > |属性|文件|目录|
  > |---|---|---|
  > |r|允许打开并读取文件内容|允许列出目录中的内容，前提是目录必须设置了可执行属性（x）|
  > |w|允许写入文件内容或截断文件。但是不允许对文件进行重命名或删除，重命名或删除是由目录的属性决定的|允许在目录下新建、删除或重命名文件，前提是目录必须设置了可执行属性（x）|
  > |x|允许将文件作为程序来执行，使用脚本语言编写的程序必须设置为可读才能被执行|允许进入目录，例如：cd directory|
* Further reading
 * http://en.wikipedia.org/wiki/Malware

#### 10 - Processes
* 常用命令
  * ps - 报告当前进程快照
  * top - 显示任务
  * jobs - 列出活跃的任务
  * bg - 把一个任务放到后台执行
  * fg - 把一个任务放到前台
  * kill - 杀死一个进程
  * killall - 杀死指定名字的进程
  * shutdown - 关机或重启系统
* 进程状态
  > |状态|含义|
  > |---|---|
  > |R|运行中。这意味着，进程正在运行或准备运行|
  > |S|正在睡眠。进程没有运行，而是，正在等待一个事件， 比如说，一个按键或者网络分组|
  > |D|不可中断睡眠。进程正在等待 I/O，比方说，一个磁盘驱动器的 I/O|
  > |T|已停止. 已经指示进程停止运行。稍后介绍更多|
  > |Z|一个死进程或“僵尸”进程。这是一个已经终止的子进程，但是它的父进程还没有清空它。 （父进程没有把子进程从进程表中删除）|
  > |<|一个高优先级进程。这可能会授予一个进程更多重要的资源，给它更多的 CPU 时间。 进程的这种属性叫做 niceness。具有高优先级的进程据说是不好的（less nice）， 因为它占用了比较多的 CPU 时间，这样就给其它进程留下很少时间|
  > |N|低优先级进程。 一个低优先级进程（一个“nice”进程）只有当其它高优先级进程被服务了之后，才会得到处理器时间|


### Part Two - Configuration And The Environment
#### 11 - The Environment
* 常用命令
  * printenv - 打印部分或所有的环境变量
  * set - 设置shell选项
  * export - 导出环境变量，让随后执行的程序知道
  * alias - 创建命令别名
* 登陆shell会话的启动文件
  > |文件|内容|
  > |---|---|
  > |/etc/profile|应用于所有用户的全局配置脚本|
  > |~/.bash_profile|用户个人的启动文件。可以用来扩展或重写全局配置脚本中的设置|
  > |~/.bash_login|如果文件 ~/.bash_profile 没有找到，bash 会尝试读取这个脚本|
  > |~/.profile|如果文件 ~/.bash_profile 或文件 ~/.bash_login 都没有找到，bash 会试图读取这个文件。 这是基于 Debian 发行版的默认设置，比方说 Ubuntu|
* 非登陆shell会话的启动文件
  > |文件|内容|
  > |---|---|
  > |/etc/bash.bashrc|应用于所有用户的全局配置文件|
  > |~/.bashrc|用户个人的启动文件。可以用来扩展或重写全局配置脚本中的设置|

#### 12 - A Gentle Introduction To vi
* Further reading
  * http://en.wikibooks.org/wiki/Vi
  * ftp://ftp.vim.org/pub/vim/doc/book/vimbook-OPL.pdf
  * http://en.wikipedia.org/wiki/Bill_Joy
  * http://en.wikipedia.org/wiki/Bram_Moolenaar
  * https://en.wikipedia.org/wiki/Chopsticks_(music)
  * http://v.youku.com/v_show/id_XMzEyOTk4ODkwMA==.html

#### 13 - Customizing The Prompt
* Further reading
  * http://tldp.org/HOWTO/Bash-Prompt-HOWTO/
  * http://en.wikipedia.org/wiki/ANSI_escape_code

### Part Three - Common Tasks And Essential Tools
#### 14 - Package Management
* 主要的包管理系统家族
  > |包管理系统|发行版（部分列表）|
  > |---|---|
  > |Debian Style (.deb)|Debian, Ubuntu, Xandros, Linspire|
  > |Red Hat Style (.rpm)|Fedora, CentOS, Red Hat Enterprise Linux, OpenSUSE, Mandriva, PCLinuxOS|
* 包管理工具
  > |发行版|底层工具|上层工具|
  > |----|----|----|
  > |Debian-Style|dpkg|apt-get, aptitude|
  > |Fedora, Red Hat Enterprise Linux, CentOS|rpm|yum|
* 软件包查找工具
  > |风格|命令|
  > |---|---|
  > |Debian|apt-get update; apt-cache search search_string|
  > |Red Hat|yum search search_string|
* 软件包安装命令
  > |风格|命令|
  > |---|---|
  > |Debian|apt-get update; apt-get install package_name|
  > |Red Hat|yum install package_name|
* 底层软件包安装命令
  > |风格|命令|
  > |---|---|
  > |Debian|dpkg --install package_file|
  > |Red Hat|rpm -i package_file|
* 软件包删除命令
  > |风格|命令|
  > |---|---|
  > |Debian|apt-get remove package_name|
  > |Red Hat|yum erase package_name|
* 关键包更新命令
  > |风格|命令|
  > |---|---|
  > |Debian|apt-get update; apt-get upgrade|
  > |Red Hat|yum update|
* 底层软件包升级命令
  > |风格|命令|
  > |---|---|
  > |Debian|dpkg --install package_file|
  > |Red Hat|rpm -U package_file|
* 列出所安装的软件包命令
  > |风格|命令|
  > |Debian|dpkg --list|
  > |Red Hat|rpm -qa|
* 软件包状态命令
  > |风格|命令|
  > |---|---|
  > |Debian|dpkg --status package_name|
  > |Red Hat|rpm -q package_name|
* 查看软件包信息命令
  > |风格|命令|
  > |---|---|
  > |Debian|apt-cache show package_name|
  > |Red Hat|yum info package_name|
* 包文件识别命令
  > |风格|命令|
  > |---|---|
  > |Debian|dpkg --search file_name|
  > |Red Hat|rpm -qf file_name|
* Further reading
  * http://www.debian.org/doc/FAQ/ch-pkgtools.en.html
  * http://www.rpm.org
  * http://linux.duke.edu/projects/yum/
  * http://en.wikipedia.org/wiki/Metadata

#### 15 - Storage Media
* 常用命令
  * mount - 挂载一个文件系统
  * umount - 卸载一个文件系统
  * fsck - 检查和修复一个文件系统
  * fdisk - 分区表控制器
  * mkfs - 创建文件系统
  * fdformat - 格式化一张软盘
  * dd - 把面向块的数据直接写入设备
  * genisoimage(mkisofs) - 创建一个ISO 9660的映射文件
  * wodim(cdrecord) - 把数据写入光存储媒介
  * md5sum - 计算MD5检验码

#### 16 - Networking
* 常用命令
  * ping - 发送ICMP ECHO_REQUEST数据包到网络主机
  * traceroute - 打印到一台网络主机的路由器数据包
  * netstat - 打印网络连接，路由表，接口统计数据，伪装连接，和多路广播成员
  * ftp - 因特网文件传输程序
  * wget - 非交互式网络下载器
  * ssh - OpenSSH SSH 客户端（远程登陆程序）
* Further reading
  * http://tldp.org/LDP/nag2/index.html
  * http://en.wikipedia.org/wiki/Internet_protocol_address
  * http://en.wikipedia.org/wiki/Host_name
  * http://en.wikipedia.org/wiki/Uniform_Resource_Identifier

#### 17 - Searching For Files
* 常用命令
  * locate - 通过名字来查找文件
  * find - 在一个目录层次结构中搜索文件
  * xargs - 从标准输入生成和执行命令行
  * touch - 更改文件时间
  * stat - 显示文件或文件系统状态
* 在centos中安装locate
  * ```sudo yum -y install mlocate```
  * ```sudo updatedb```
  * ```locate filename```
* Further reading
  * http://www.gnu.org/software/findutils/


#### 18 - Archiving And Backup
* 常用命令
  * 压缩
    * gzip - 压缩或者展开文件
    * bzip2 - 块排序文件压缩器
  * 归档
    * tar - 磁带打包工具
    * zip - 打包和压缩文件
  * 文件同步程序
    * rsync - 同步远端文件和目录
* Further reading
  * http://www.gnu.org/software/tar/manual/index.html

#### 19 - Regular Expressions
* ```grep```
* Further reading
  * http://en.wikipedia.org/wiki/Posix
  * http://en.wikipedia.org/wiki/Ascii

#### 20 - Text Processing
* 常用命令
  * cat - 连接文件并且打印到标准输出
  * sort - 给文本行排序
  * uniq - 报告或者省略重复行
  * cut - 从每行中删除文本区域
  * paste - 合并文件文本行
  * join - 基于某个共享字段来联合两个文件的文本行
  * comm - 逐行比较两个有序的文件
  * diff - 逐行比较文件
  * patch - 给原始文件打补丁
  * tr - 翻译或删除字符
  * sed - 用户筛选和转换文本的流编辑器
  * aspell - 交互式拼写检查器
* Further reading
  * http://www.gnu.org/software/coreutils/manual/coreutils.html#Output-of-entire-files
  * http://www.gnu.org/software/coreutils/manual/coreutils.html#Operating-on-sorted-files
  * http://www.gnu.org/software/coreutils/manual/coreutils.html#Operating-on-fields-within-a-line
  * http://www.gnu.org/software/coreutils/manual/coreutils.html#Operating-on-characters
  * http://www.gnu.org/software/diffutils/manual/html_mono/diff.html
  * http://www.gnu.org/software/sed/manual/sed.html
  * http://aspell.net/man-html/index.html
  * http://www.grymoire.com/Unix/Sed.html
  * http://sed.sourceforge.net/sed1line.txt

#### 21 - Formatting Output
* 常用命令
  * nl - 添加行号
  * fold - 限制文件列宽
  * fmt - 一个简单的文本格式转化器
  * pr - 让文本为打印做好准备
  * printf - 格式化数据并打印出来
  * groff - 一个文件格式化系统
* Further reading
  * groff指南<br>http://www.gnu.org/software/groff/manual/
  * 运用nroff指令中的-me选项写论文<br>http://docs.freebsd.org/44doc/usd/19.memacros/paper.pdf 
  * -me参考手册<br>http://docs.freebsd.org/44doc/usd/20.meref/paper.pdf 
  * Tbl - 一个格式化表格的指令<br>http://plan9.bell-labs.com/10thEdMan/tbl.pdf
  * Wiki
    * http://en.wikipedia.org/wiki/TeX
    * http://en.wikipedia.org/wiki/Donald_Knuth
    * http://en.wikipedia.org/wiki/Typesetting

#### 22 - Printing
* 常用命令
  * pr - 转换需要打印的文本文件
  * lpr - 打印文件
  * lp - 打印文件
  * a2ps - 为PostScript打印机格式化文件
  * lpstat - 显示打印机状态信息
  * lpq - 显示打印机队列状态
  * lprm - 取消打印任务
  * cancel - 取消打印任务

#### 23 - Compiling Programs
* ```make```
* Further reading
  * Wikipedia
    * http://en.wikipedia.org/wiki/Compiler
    * http://en.wikipedia.org/wiki/Make_(software)
  * GNU Make Manual
    * http://www.gnu.org/software/make/manual/html_node/index.html
    
### Part Four - Writing Shell Scripts
#### 24 - Writing Your First Script
#### 25 - Starting A Project
#### 26 - Top-Down Design
#### 27 - Flow Control: Branching With if
#### 28 - Reading Keyboard Input
#### 29 - Flow Control: Looping With while/until
#### 30 - Troubleshooting
#### 31 - Flow Control: Branching With case
#### 32 - Positional Parameters
#### 33 - Flow Control: Looping With for
#### 34 - Strings And Numbers
#### 35 - Arrays
#### 36 - Exotica