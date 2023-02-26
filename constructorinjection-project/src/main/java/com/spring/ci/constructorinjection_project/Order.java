package com.spring.ci.constructorinjection_project;


public class Order {
	
	private String productId;
	private String productName;
	private Customer customer;
	
	
	public Order(Customer customer) {
		super();
		this.customer = customer;
	}


	public Order(String productId, String productName, Customer customer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [productId=" + productId + ", productName=" + productName + ", customer=" + customer + "]";
	}
	
	
		
	
}
