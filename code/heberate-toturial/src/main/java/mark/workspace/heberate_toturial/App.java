package mark.workspace.heberate_toturial;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        try{
             Payment payment = session.get(Payment.class, "CN328545");
             Customer customer = session.get(Customer.class, 103);
             Employee employee = session.get(Employee.class, 1002);
             Office office = session.get(Office.class, "1");
             Order order = session.get(Order.class, 10100);
             OrderDetail orderdetail = session.get(OrderDetail.class, 10100);
             Product product = session.get(Product.class, "S10_1678");
             ProductLine productline = session.get(ProductLine.class, "Classic Cars");
             if(payment==null){
            	 System.out.println("not find");
             }
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
            System.out.println("保存失败!");
        }finally{
            HibernateUtil.closeSession();
        }
        System.out.println( "Hello World!" );
    }
}
