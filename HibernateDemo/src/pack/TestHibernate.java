package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		/*
		Transaction tx = s.beginTransaction();
		
		Employee emp = new Employee(106,"vinu",12000);
		
		s.save(emp);
		tx.commit();
		*/
		Employee e = (Employee) s.get(Employee.class, 102);
		System.out.println("ID = "+e.getId()+" ,Name = "+e.getName()+" ,Salary = "+e.getSalary());
		
		
		s.close();
		sf.close(); 
		System.out.println("********Everything is done********");

	}

}
