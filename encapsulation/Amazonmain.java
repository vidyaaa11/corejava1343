package com.encapsulation;

public class Amazonmain {
	public static void main(String[] args) {
		Amazon a = new Amazon();
		
		 a.setProductId(101);
	        a.setProductName("Laptop");
	        a.setCategory("Electronics");
	        a.setPrice(55000.00);
	        a.setQuantity(2);
	        a.setBrand("HP");
	        a.setSellerName("ABC Store");
	        a.setCustomerName("vidya");
	        a.setEmail("vidya@gmail.com");
	        a.setMobileNumber(9876543210L);
	        a.setAddress("Pune");
	        a.setPaymentMode("UPI");
	        a.setOrderDate("28-10-2026");
	        a.setDeliveryDate("30-10-2026");
	        a.setDelivered(false);
	        
	        System.out.println("Product ID: " + a.getProductId());
	        System.out.println("Product Name: " + a.getProductName());
	        System.out.println("Category: " + a.getCategory());
	        System.out.println("Price: " + a.getPrice());
	        System.out.println("Quantity: " + a.getQuantity());
	        System.out.println("Brand: " + a.getBrand());
	        System.out.println("Seller Name: " + a.getSellerName());
	        System.out.println("Customer Name: " + a.getCustomerName());
	        System.out.println("Email: " + a.getEmail());
	        System.out.println("Mobile Number: " + a.getMobileNumber());
	        System.out.println("Address: " + a.getAddress());
	        System.out.println("Payment Mode: " + a.getPaymentMode());
	        System.out.println("Order Date: " + a.getOrderDate());
	        System.out.println("Delivery Date: " + a.getDeliveryDate());
	        System.out.println("Delivered: " + a.isDelivered());
		
	}

}
