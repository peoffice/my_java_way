package mark.workspace.mybatis_toturial;

import java.io.InputStream;
import java.net.URL;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mark.workspace.mybatis_toturial.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App p = new App();
    	p.test();
    }
    public void test(){
    	
    	String resource = "mybatis.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
    	    	//mybatis的配置文件
//    	String configPath = "/mybatis.xml";
//		URL fileURL = this.getClass().getResource(configPath);
//		if (fileURL == null) {
//			configPath = "/resources" + configPath;
//		}
//		InputStream is = this.getClass().getResourceAsStream(configPath);
        //String resource = "mybatis.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        //InputStream is = Resources.getClassLoader().getResourceAsStream(resource);
        
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is,"development");
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource); 
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "test.userMapper.getUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        Student student = session.selectOne(statement, 1);
        System.out.println(student.getId());
        //System.out.println(user);
        //System.out.println( "Hello World!" );
    }
}
