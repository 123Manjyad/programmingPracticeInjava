package com.org.ProductProject;

public class Driver {
	public static void main(String[] args) {
		ProductService service=new ProductService();
		
		service.addProduct(new Shirt("Arrow","clothing",2300,38,"Gray"));
		service.addProduct(new Shirt("Blackbarry","clothing",4700,40,"DarkBlue"));
		service.addProduct(new Mobile("OnePlus","Eletronic",18500,8,128));
		service.addProduct(new Shirt("Arrow","clothing",3300,38,"Navy-Blue"));
		
	    /*service.getAllProduct();
		System.out.println("Get all the Shirts from the List :: ");
		service.getAllShirt();
	
		System.out.println("Get all the Mobile from the List :: ");
		service.getAllMobile();
	
		System.out.println("Display Products On Category :::::");
		service.getAllProductsOnCategory(); 
		
		System.out.println("Display Product Count on Category :::::");
		service.getProductCountCatg();	
		
		System.out.println("Display Category");
		service.getAllCategory();*/
		
		
		
		
		
		
		System.out.println("Display All the Type of Class");
		service.getProductType();
	}

}
