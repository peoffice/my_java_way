package mark.workspace.heberate_toturial;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import junit.framework.TestCase;

public class SingleTableTest extends TestCase {
	
	public void testConfig(){
		Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        try{
             Payment payment = session.get(Payment.class, "HQ336336");
             assert(payment!=null);
             if(payment!=null){
            	 assert(payment.getCustomerNumber()==103);
             }
            
             Customer customer = session.get(Customer.class, 103);
             assert(customer!=null);
             if(customer!=null){
            	 assert(customer.getContactFirstName().equals("Carine "));
             }
             
             Employee employee = session.get(Employee.class, 1002);
             assert(employee!=null);
             if(employee!=null){
            	 assert(employee.getFirstName().equals("Diane"));
             }
             
             Office office = session.get(Office.class, "1");
             assert(office!=null);
             if(office!=null){
            	 assert(office.getCity().equals("San Francisco"));
             }
             
             Order order = session.get(Order.class, 10100);
             assert(order!=null);
             if(order!=null){
            	 assert(order.getStatus().equals("Shipped"));
             }
             
             OrderDetail orderdetail = session.get(OrderDetail.class, 10100);
             assert(orderdetail!=null);
             if(orderdetail!=null){
            	 assert(orderdetail.getOrderLineNumber()==3);
             }
             
             Product product = session.get(Product.class, "S10_1678");
             assert(product!=null);
             if(product!=null){
            	 assert(product.getProductVendor().equals("Min Lin Diecast"));
             }
             
             ProductLine productline = session.get(ProductLine.class, "Classic Cars");
             assert(productline!=null);
             if(productline==null){
            	 assert(productline.getHtmlDescription()==null);
             }
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
            assert(false);
        }finally{
        	tx.commit();
            HibernateUtil.closeSession();
        }
	}
    public void testHqlinConfig(){
		Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        try{
        	Query query = session.getNamedQuery("queryHQL");
        	assert(query!=null);
        	List<Customer> customers = query.list();
        	assert(customers.size()>0);
        	if(customers.size()>0){
        		for(Customer customer:customers){
        			System.out.println(customer.getCity());
        		}
        	}
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
            assert(false);
        }finally{
        	tx.commit();
            HibernateUtil.closeSession();
        }
    }
}
