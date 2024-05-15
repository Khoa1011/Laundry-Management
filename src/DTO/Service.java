package DTO;

public class Service {
	private String p_idService;
	private String p_nameService;
	private double p_priceService;
	

	public String getIdService() {
		return p_idService;
	}
	public void setIdService(String p_idService) {
		this.p_idService = p_idService;
	}
	public String getNameService() {
		return p_nameService;
	}
	public void setNameService(String p_nameService) {
		this.p_nameService = p_nameService;
	}
	public double getPriceService() {
		return p_priceService;
	}
	public void setPriceService(double p_priceService) {
		this.p_priceService = p_priceService;
	}
	
	public Service(String p_idService, String p_nameService, double p_priceService) {
		this.p_idService = p_idService;
		this.p_nameService = p_nameService;
		this.p_priceService = p_priceService;
	}

	public Service() {
		this.p_idService = "";
		this.p_nameService = "";
		this.p_priceService = 0;
	}
	
}
