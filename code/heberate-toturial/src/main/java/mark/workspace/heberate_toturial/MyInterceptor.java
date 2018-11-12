package mark.workspace.heberate_toturial;

import java.util.Iterator;

import org.hibernate.EmptyInterceptor;

public class MyInterceptor extends EmptyInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void preFlush(Iterator iterator) {
	      System.out.println("preFlush");
	   }
	   //called after committed into database
	   public void postFlush(Iterator iterator) {
	      System.out.println("postFlush");
	   }
}
