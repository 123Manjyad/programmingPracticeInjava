package com.org.ProductProject;

public class Mobile extends Product {
	int ram;
	int hd;
	Mobile()
	{
		
	}
	
	
	
	
	
	public Mobile(String brand ,String catg,double price,int ram, int hd) {
		super(brand ,catg,price);
		this.ram = ram;
		this.hd = hd;
	}





	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", hd=" + hd + ", brand=" + brand + ", catg=" + catg + ", price=" + price + "]";
	}
	
	

}
