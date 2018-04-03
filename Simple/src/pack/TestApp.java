package pack;

public class TestApp {
	public static void main(String[] a) {
		Employee emp = new Employee("Raj", 35);
		System.out.println(emp);
		Manager mgr = new Manager("velu", 20, 10);
		System.out.println(mgr);
	}
}
