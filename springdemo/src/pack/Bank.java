package pack;

import java.util.List;

public class Bank {
	private String bankName;
	private List<String> location;
	public Bank() {
		super();
	}
	public Bank(String bankName, List<String> location) {
		super();
		this.bankName = bankName;
		this.location = location;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	
}
