package DTO;

public class Person {
	protected String pr_id;
	protected String pr_name;
	protected int pr_age;
	protected String pr_address;
	protected String pr_phoneNumber;
	
	
	public String getID() {
		return pr_id;
	}
	public void setID(String value) {
		this.pr_id=value;
	}
	public String getName() {
		return pr_name;
	}
	public void setName(String value) {
		this.pr_name = value;
	}
	public int getAge() {
		return pr_age;
	}
	public void setAge(int value) {
		this.pr_age = value;
	}
	public String getAddress() {
		return pr_address;
	}
	public void setAddress(String value) {
		this.pr_address = value;
	}
	public String getPhoneNumber() {
		return pr_phoneNumber;
	}
	public void setPhoneNumber(String pr_phoneNumber) {
		this.pr_phoneNumber = pr_phoneNumber;
	}

	public Person(String pr_id, String pr_name, int pr_age, String pr_address, String pr_phoneNumber) {
		this.pr_id = pr_id;
		this.pr_name = pr_name;
		this.pr_age = pr_age;
		this.pr_address = pr_address;
		this.pr_phoneNumber = pr_phoneNumber;
	}

	public Person() {
		this.pr_id = "";
		this.pr_name = "";
		this.pr_age = 0;
		this.pr_address = "";
		this.pr_phoneNumber = "";
	}
	
	public boolean isEmployee() {
		return false;
	}
	public boolean isCustomer() {
		return false;
	}
}
