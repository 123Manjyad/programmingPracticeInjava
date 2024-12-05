package com.org.ProductProject;

public class Shirt extends Product{
	
	double price;
	int size;
	String color;
	Shirt()
	{
		super();
	}
	
	Shirt(String brand ,String catg,double price,int size,String color)
	{
		super(brand,catg,price);
		this.brand=brand;
		this.price=price;
		this.catg=catg;
		this.color=color;
		this.size=size;
	}
	
	

	@Override
	public String toString() {
		return "Shirt [price=" + price + ", size=" + size + ", color=" + color + "]";
	}
	
	

}
