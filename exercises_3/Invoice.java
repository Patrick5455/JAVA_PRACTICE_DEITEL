package Algorithm_Solutions.exercises_3;
public class Invoice {

	private String partNo;
	private String partDescription;
	private int quantity;
	private double itemPrice;
	
	public Invoice(String partNo, String partDescription, int quantity, double itemPrice){
		
		this.partNo = partNo;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	public void setPartNo (String partNo){
		this.partNo = partNo;
	}
	
	public String getPartNo (){
		return partNo;
	}
	
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	
	public void setQuantity (int quantity){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
	
	public double getInvoiceAmount(){
		if (quantity < 0){
			return 0;
		}
		
		else if (itemPrice < 0){
			return 0.0;
		}
		return quantity*itemPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}