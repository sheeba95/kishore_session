package pack;

public class Manager extends Employee {
	private int employeeCount;

	public Manager(String name, int age, int employeeCount) {
		super(name, age);
		this.employeeCount = employeeCount;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + ", getName()="
				+ getName() + ", getAge()=" + getAge() + "]";
	}

	
	

}
