package com.org.Shape_project;

public class SegmentCircle implements TwoDShape {
	
	double angle;
	double radius;
	
	SegmentCircle()
	{
		super();
	}

	public SegmentCircle(double angle, double radius) {
		super();
		this.angle = angle;
		this.radius = radius;
	}

	
	 
	  public void getArea()
	  {
		  System.out.println("Area of the SegmentCircle is "+Math.PI*radius*radius*angle/360+" Sq Unit");
	  }
	  
	  public void getPerimeter()
	  {
		  System.out.println("Perimeter of the Circle is "+angle/360*2*Math.PI*radius+2*radius*Math.sin(angle/2)+" Unit");
	  }

	@Override
	public String toString() {
		return "SegmentCircle [angle=" + angle + ", radius=" + radius + "]";
	}
	
	

}
