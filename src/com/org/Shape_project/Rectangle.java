package com.org.Shape_project;

public class Rectangle  implements TwoDShape{
	
	double width;
	double length;
	
	Rectangle()
	{
		super();
	}
	
	Rectangle(double w,double l)
	{
		this.width=w;
		this.length=l;
		
	}

	
	public void getArea()
	{
		
		double area=length*width;
		System.out.println("Area of the Rectangle is "+area+"  Sq Unit");
	}
	
	public void getPerimeter()
	{
		double p=2*(length+width);
		
		System.out.println("Perimeter of the Ractangle is "+p+"  Unit");
	}
	 

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	

}
