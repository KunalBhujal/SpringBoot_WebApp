package com.ecommerce.app.model;

public class EcomProductsEntity {
	
	private String name;
	private String description;
	private String price;
	
	
	
	public EcomProductsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EcomProductsEntity(String name, String description, String price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
