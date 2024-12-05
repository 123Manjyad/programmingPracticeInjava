package com.org.Shape_project;

public class Triangle implements TwoDShape {
	
	double side1;
	double side2;
	double side3;
	
	Triangle()
	{
		
	}
	
	
	public Triangle(double side1, double side2, double side3) {
		super();
		if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2)
		{
			System.out.println("Enter Side of the Triangle is Valide you can Go ahead to intialise the Triangle side:");
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else
		{
			System.out.println("Enter side of the Triangle is not valide it does not follow the properties of Triagnle");
		}
		
	}
	
	public void getArea()
	{
		double s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of the Triangle is "+area+"  Sq Unit");
	}
	
	public void getPerimeter()
	{
		double p=side1+side2+side3;
		
		System.out.println("Perimeter of the Triangle is "+p+"  Unit");
	}
	 

}
