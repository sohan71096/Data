package com.capgemini.salesmanagement.bean;

public class ProductBean 
{
	private String product_Name;
	private String product_Category;
	private String product_description;
	private double product_price;
	private int quantity;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Category() {
		return product_Category;
	}
	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "ProductBean [product_Name=" + product_Name + ", product_Category=" + product_Category
				+ ", product_description=" + product_description + ", product_price=" + product_price + "]";
	}
	
	
	
}
