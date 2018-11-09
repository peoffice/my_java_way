#### hibernate.cfg.xml
```
<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

<!--声明Hibernate配置文件的开始 -->
<hibernate-configuration>
	<!--表明以下的配置是针对session-factory配置的，SessionFactory是Hibernate中的一个类，这个类主要负责保存HIbernate的配置信息，以及对Session的操作 -->
	<session-factory>
		<!--配置数据库的驱动程序，Hibernate在连接数据库时，需要用到数据库的驱动程序 -->
		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
		<!--设置数据库的连接url:jdbc:mysql://localhost/hibernate,其中localhost表示mysql服务器名称，此处为本机，hibernate是数据库名 -->
		<property name="hibernate.connection.url"> jdbc:mysql://localhost/hibernate</property>
		<!--连接数据库是用户名 -->
		<property name="hibernate.connection.username">root</property>
		<!--连接数据库是密码 -->
		<property name="hibernate.connection.password">123456</property>
		<!--数据库连接池的大小 -->
		<property name="hibernate.connection.pool.size">20</property>
		<!--是否在后台显示Hibernate用到的SQL语句，开发时设置为true，便于差错，程序运行时可以在Eclipse的控制台显示Hibernate的执行Sql语句。项目部署后可以设置为false，提高运行效率 -->
		<property name="hibernate.show_sql">true</property>
		<!--jdbc.fetch_size是指Hibernate每次从数据库中取出并放到JDBC的Statement中的记录条数。FetchSize设的越大，读数据库的次数越少，速度越快，Fetch Size越小，读数据库的次数越多，速度越慢 -->
		<property name="jdbc.fetch_size">50</property>
		<!--jdbc.batch_size是指Hibernate批量插入,删除和更新时每次操作的记录数。BatchSize越大，批量操作的向数据库发送Sql的次数越少，速度就越快，同样耗用内存就越大 -->
		<property name="jdbc.batch_size">23</property>
		<!--jdbc.use_scrollable_resultset是否允许Hibernate用JDBC的可滚动的结果集。对分页的结果集。对分页时的设置非常有帮助 -->
		<property name="jdbc.use_scrollable_resultset">false</property>
		<!--connection.useUnicode连接数据库时是否使用Unicode编码 -->
		<property name="Connection.useUnicode">true</property>
		<!--connection.characterEncoding连接数据库时数据的传输字符集编码方式，最好设置为gbk，用gb2312有的字符不全 -->
		<property name="connection.characterEncoding">gbk</property>
		<!--hibernate.dialect 只是Hibernate使用的数据库方言,就是要用Hibernate连接那种类型的数据库服务器。 -->
		<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
		<!--是否自动创建数据库表  他主要有一下几个值：validate:当sessionFactory创建时，自动验证或者schema定义导入数据库。create:每次启动都drop掉原来的schema，创建新的。create-drop:当sessionFactory明确关闭时，drop掉schema。update(常用):如果没有schema就创建，有就更新。-->
		<property name="hbm2ddl.auto">create</property>
		<!--配置此处 sessionFactory.getCurrentSession()可以完成一系列的工作，当调用时，hibernate将session绑定到当前线程，事务结束后，hibernate将session从当前线程中释放，并且关闭session。当再次调用getCurrentSession()时，将得到一个新的session，并重新开始这一系列工作。-->
		<property name="current_session_context_class">thread</property>
		<!--指定映射文件为“hibernate/ch1/UserInfo.hbm.xml” -->
		<mapping resource="org/mxg/UserInfo.hbm.xml">
	</session-factory>
</hibernate-configuration> 
```
#### 映射文件
···
<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC 
    "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">    
<!-- 
    <hibernate-mapping>一般不去配置，采用默认即可。
    schema:指定映射数据库的schema(模式/数据库)，如果指定该属性，则表名会自动添加该schema前缀
    package:指定包前缀 指定持久化类所在的包名 这样之后calss子元素中就不必使用全限定性的类名
    default-cascade="none"：默认的级联风格，表与表联动。
    default-lazy="true"：默认延迟加载
 -->
<hibernate-mapping>
    <!-- 
        <class>：使用class元素定义一个持久化类。
        name="cn.javass.user.vo.UserModel"：持久化类的java全限定名；
        table="tbl_user"：对应数据库表名，默认持久化类名作为表名；
        proxy:指定一个接口，在延迟装载时作为代理使用，也可在这里指定该类自己的名字。
        mutable="true"：默认为true，设置为false时则不可以被应用程序更新或删除，等价于所有<property>元素的update属性为false，表示整个实例不能被更新。
        dynamic-insert="false"：默认为false，动态修改那些有改变过的字段，而不用修改所有字段；
        dynamic-update="false"：默认为false，动态插入非空值字段；
        select-before-update="false"：默认为false，在修改之前先做一次查询，与用户的值进行对比，有变化都会真正更新；
        optimistic-lock="version"：默认为version(检查version/timestamp字段)，取值：all(检查全部字段)、dirty(只检查修改过的字段)；
                                   none(不使用乐观锁定)，此参数主要用来处理并发，每条值都有固定且唯一的版本，版本为最新时才能执行操作；
                   如果需要采用继承映射，则class元素下还会增加<subclass.../>元素等用于定义子类。
     -->
    <class name="cn.javass.user.vo.UserModel" table="tbl_user" >
        
        <!-- 
            <id>：定义了该属性到数据库表主键字段的映射。
            type  指定该标识属性的数据类型，该类型可以是Hibernate的内建类型，也可以是java类型，如果是java类型则需要使用全限定类名（带包名）。该属性可选，如果没有指定类型， 则hibernate自行判断该标识属性数据类型。通常建议设定。
            name="userId"：标识属性的名字；
            column="userId"：表主键字段的名字，如果不填写与name一样；
            
         -->
        <id name="userId">
            <!-- <generator>：指定主键由什么生成，推荐使用uuid，assigned指用户手工填入。设定标识符生成器
                                     适应代理主键的有：
                increment：有Hibernat自动以递增的方式生成标识符，每次增量1；
                identity：由底层数据库生成标识符，前提条件是底层数据库支持自动增长字段类型。（DB2,MYSQL）
                uuid:用128位的UUID算法生成字符串类型标识符。
                                     适应自然主键：
                assigned:由java程序负责生成标识符，为了能让java应用程序设置OID,不能把setId（）方法设置成private类型。
                                     让应用程序在save()之前为对象分配一个标识符。相当于不指定<generator.../>元素时所采用的默认策略。
                                     应当尽量避免自然主键
            -->
            <generator class="uuid"/>
        </id>
        
        <!-- 
            <version/>：使用版本控制来处理并发，要开启optimistic-lock="version"和dynamic-update="true"。
            name="version"：持久化类的属性名，column="version"：指定持有版本号的字段名；
         -->
        <version name="version" column="version"/>
        
        <!-- 
            <property>：为类定义一个持久化的javaBean风格的属性。
            name="name"：标识属性的名字，以小写字母开头；
            column="name"：表主键字段的名字，如果不填写与name一样；
            update="true"/insert="true"：默认为true，表示可以被更新或插入；
            access="property/field"：指定Hibernate访问持久化类属性的方式。默认property。property表示使用setter/getter方式。field表示运用java反射机制直接访问类的属性。
            formula="{select。。。。。}"：该属性指定一个SLQ表达式，指定该属性的值将根据表达式类计算，计算属性没有和它对应的数据列。
            formula属性允许包含表达式：sum,average,max函数求值的结果。
                            例如：formula="(select avg(p.price) from Product P)"
         -->
        <property name="name" column="name" />
        <property name="sex" column="sex"/>
        <property name="age" column="age"/>
        
        <!-- 
                          组件映射：把多个属性打包在一起当一个属性使用，用来把类的粒度变小。
            <component name="属性，这里指对象">
                 <property name="name1"></property>
                 <property name="name2"></property>
             </component>
         -->
         
         <!-- 
             <join>:一个对象映射多个表，该元素必须放在所有<property>之后。
             <join table="tbl_test：子表名">
                 <key column="uuid：子表主键"></key>
             <property name="name1：对象属性" column="name：子表字段"></property>
         </join>
          -->
         
    </class>    
</hibernate-mapping>
··· 