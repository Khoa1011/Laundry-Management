package DTO;

public class Customer extends Person{
	private float p_kilogramClothes;
	private double p_totalCash;
	
	public float getKilogramClothes() {
		return p_kilogramClothes;
	}
	public void setKilogramClothes(float p_kilogramClothes) {
		this.p_kilogramClothes = p_kilogramClothes;
	}
	public double getTotalCash() {
		return p_totalCash;
	}
	public void setTotalCash(double p_totalCash) {
		this.p_totalCash = p_totalCash;
	}

	public Customer(String pr_id, String pr_name, int pr_age, String pr_address, String pr_phoneNumber,
			float p_kilogramClothes, double p_totalCash) {
		super(pr_id, pr_name, pr_age, pr_address, pr_phoneNumber);
		
		this.p_kilogramClothes = p_kilogramClothes;
		this.p_totalCash = p_totalCash;
	}

	public Customer() {
		super();
		this.p_kilogramClothes=0;
		this.p_totalCash=0;
	}
	
	@Override
	public boolean isCustomer() {
		return true;
	}
	
}
