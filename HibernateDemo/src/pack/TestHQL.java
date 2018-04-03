package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		String hql = "select obj from pack.Employee obj where obj.salary>20000";
		Query query = s.createQuery(hql);
		List list = query.list();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Employee e = (Employee) it.next();
			System.out.println("ID: "+e.getId()+", Name: "+e.getName()+", Salary :" +e.getSalary());
			
		}
		System.out.println("************");
		String hql1 = "select obj.name from pack.Employee obj";
		Query query1 = s.createQuery(hql1);
		List list1 = query1.list();
		Iterator it1 = list1.iterator();
		while(it1.hasNext()) {
			String ex = (String) it1.next();
			System.out.println(ex);
			
		}
		
		System.out.println("************");
		String hql2 = "select e.name,e.salary from pack.Employee e";
		Query query2 = s.createQuery(hql2);
		List list2 = query2.list();
		Iterator it2 = list2.iterator();
		while(it2.hasNext()) {
			Object[] obj = (Object[]) it2.next();
			String name = (String) obj[0];
			Double salary = (Double) obj[1];
			System.out.println("Name : "+name+", Salary = "+salary);
			
		}
		
		
		s.close();
		sf.close();
	}

}
