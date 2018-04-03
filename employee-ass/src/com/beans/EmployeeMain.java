package com.beans;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		
		Employee e = (Employee) context.getBean("employeeObject");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int choice;
		do {
			System.out.println("******** Employee Management System ********");
			System.out.println("1)	Add   2) Delete by Id  3) Display All"
					+ "  4) Update by id  5) Exit");
			
			System.out.print("Input");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("**** Performing Insert ****");
					System.out.println("Enter id");
					e.setId(sc.nextInt());
					System.out.println("Enter name");
					e.setName(sc.next());
					System.out.println("Enter Salary");
					e.setSalary(sc.nextInt());
					System.out.println("Enter Designation");
					e.setDesignation(sc.next());					
					service.insert(e);
					System.out.println("**** Employee information stored successfully ****");
					break;
					
				case 2:
					System.out.println("*** Performing Delete ***");
					System.out.println("Enter id");
					
					e.setId(sc.nextInt());
					service.delete(e);
					System.out.println("*** Employee deleted successfully ***");
					break;
					
				case 3:
					System.out.println("**** Displaying All Employees ****** ");
					//service.getAllEmployee(e);
					List<Employee> EmployeeList = service.getEmployee();
					for(Employee e1 : EmployeeList) {
						System.out.println(e1.getId()+ " "+e1.getName()+" "+e1.getSalary()+ " "+e1.getDesignation());
					} 
					System.out.println("....... And many more based on number of records in a table.....");
					break;
				
				case 4:
					System.out.println("Enter Id");
					int a = sc.nextInt();
				int ch;
				do {
						System.out.println("***** A sub menu to update the following ****");
						System.out.println("1	Name	2 Salary 	3 Designation	4 Exit");
						System.out.println("Input:");
					    ch = sc.nextInt();
						switch(ch) {
							case 1:
								System.out.println("Enter new name:");
								String n = sc.next();
								service.updateName(a,n);
								break;
							case 2:
								System.out.println("Enter new Salary");
								Double s = sc.nextDouble();
								service.updateSalary(a,s);
								break;
							case 3:
								System.out.println("Enter new Designation");
								String d = sc.next();
								service.updateDesignation(a,d);
								break;
							case 4:
								System.out.println("***Sub menu exit***");
								break;
						}
					}while(ch<4);
			}
		}while(choice<5);
		System.out.println("***Main menu exits***");
		System.out.println("****Thank you for visiting*****");
	}
}
	
/*List<Employee> EmployeeList = service.getEmployee();
for(Employee e1 : EmployeeList) {
	System.out.println(e1.getId()+ " "+e1.getName()+" "+e1.getSalary()+ " "+e1.getDesignation());
} */
