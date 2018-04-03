package pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory getSessionFactory() {
		SessionFactory sf = null;
		
		Configuration cgf = new Configuration();
		cgf.configure();
		sf = cgf.buildSessionFactory();
		
		return sf;
		
		
	}

}
