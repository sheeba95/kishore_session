package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println("Enter an ID:");
		int tempId = input.nextInt();
		Employee e = (Employee) s.get(Employee.class, tempId);
		if(e != null) {
			System.out.println("Old Name :"+e.getName());
			System.out.println("Enter the name");
			String tempName = input.next();
			e.setName(tempName);
			System.out.println(e.getName());
			s.update(e);
			
			tx.commit();
		}
		else {
			System.err.println("Enter the correct ID");
		}
		s.close();
		sf.close();
		input.close();

	}

		
	}
	