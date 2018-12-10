#### 工具列表
* mongostat
  > mongostat是mongodb自带的状态检测工具，在命令行下使用。它会间隔固定的时间获取mongodb的当前运行状态，并输出。如果你发现数据库突然变慢或者有其他问题的话，你第一手的操作就是考虑采用mongostat来查看mongo的状态，它的输出有一下几列
  * inserts/s 每秒插入次数
  * query/s 每秒查询次数
  * update/s 每秒更新次数
  * delete/s 每秒删除次数
  * getmore/s 每秒执行getmore次数
  * command/s 每秒的命令数，比以上插入、查找、更新、删除的综合还多，还统计了别的命令
  * flushs/s 每秒执行fsync将数据写入硬盘的次数。
  * mapped/s 所有的被mmap的数据量，单位是MB，
  * vsize 虚拟内存使用量，单位MB
  * res 物理内存使用量，单位MB
  * faults/s 每秒访问失败数（只有Linux有），数据被交换出物理内存，放到swap。不要超过100，否则就是机器内存太小，造成频繁swap写入。此时要升级内存或者扩展
  * locked % 被锁的时间百分比，尽量控制在50%以下吧
  * idx miss % 索引不命中所占百分比。如果太高的话就要考虑索引是不是少了
  * q t|r|w 当Mongodb接收到太多的命令而数据库被锁住无法执行完成，它会将命令加入队列。这一栏显示了总共、读、写3个队列的长度，都为0的话表示mongo毫无压力。高并发时，一般队列值会升高。
  * conn 当前连接数
  * time 时间戳
* 使用profiler
  * use test
  * db.setProfilingLevel(2)
  * db.getProfilingLevel()
  * db.system.profile.find().sor({$natural:-1})
* 使用Web控制台
  > Mongodb自带了Web控制台，默认和数据服务一同开启。他的端口在Mongodb数据库服务器端口的基础上加1000，如果是默认的Mongodb数据服务端口(Which is 27017)，则相应的Web端口为28017
  * 从3.6版本之后，已经废弃、

* mongotop
* [Ops Manager (mms)](https://docs.opsmanager.mongodb.com/v4.0/application/)
  * [使用MMS(MongoDB Monitoring Service)监控MongoDB](https://www.cnblogs.com/tippoint/p/3441160.html)

* Commands
  * serverStatus
  * dbStats
  * collState
  * replSetGetStatus
  * 