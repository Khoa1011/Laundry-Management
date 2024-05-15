package DTO;

public class SalesOrderDetails {
	private Customer p_idCustomer;
	private Service p_idService;
	private String p_idSalesOrder;
	private String p_orderSalesStatus;
	private double p_totalCash;
	
	
	public Customer getIdCustomer() {
		return p_idCustomer;
	}
	public void setIdCustomer(Customer p_idCustomer) {
		this.p_idCustomer = p_idCustomer;
	}
	public Service getIdService() {
		return p_idService;
	}
	public void setIdService(Service p_idService) {
		this.p_idService = p_idService;
	}
	public String getIdSalesOrder() {
		return p_idSalesOrder;
	}
	public void setIdSalesOrder(String p_idSalesOrder) {
		this.p_idSalesOrder = p_idSalesOrder;
	}
	public String getOrderSalesStatus() {
		return p_orderSalesStatus;
	}
	public void setOrderSalesStatus(String p_orderSalesStatus) {
		this.p_orderSalesStatus = p_orderSalesStatus;
	}
	public double getTotalCash() {
		return p_totalCash;
	}
	public void setTotalCash(double p_totalCash) {
		this.p_totalCash = p_totalCash;
	}

	public SalesOrderDetails(Customer p_idCustomer, Service p_idService, String p_idSalesOrder,
			String p_orderSalesStatus, double p_totalCash) {
		this.p_idCustomer = p_idCustomer;
		this.p_idService = p_idService;
		this.p_idSalesOrder = p_idSalesOrder;
		this.p_orderSalesStatus = p_orderSalesStatus;
		this.p_totalCash = p_totalCash;
	}

	public SalesOrderDetails() {
		this.p_idCustomer = new Customer();
		this.p_idService = new Service();
		this.p_idSalesOrder = "";
		this.p_orderSalesStatus = "";
		this.p_totalCash = 0.0;
	}
	
	
}
