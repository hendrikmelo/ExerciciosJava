package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice(double price) {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity(int quantity) {
		return quantity;
	}
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return name
				+ ", $ "
				+ price
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ TotalValueInStock();
	}
}
