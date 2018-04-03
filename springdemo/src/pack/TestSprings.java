package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSprings {
private static ApplicationContext ctx;

public static void main(String[] args) {
	ctx = new ClassPathXmlApplicationContext("beans.xml");
	/*Identifier id = (Identifier) ctx.getBean("b1");
	id.display();
	Identifier id1 = (Identifier) ctx.getBean("b2");
	id1.display(); */
	Customer c = (Customer) ctx.getBean("c1");
	c.getInformations(); 
/*	Bank ban = (Bank) ctx.getBean("bank");
	System.out.println(ban.getLocation());
} */
}
}
