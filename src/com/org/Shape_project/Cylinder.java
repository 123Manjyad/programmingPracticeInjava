package com.org.Shape_project;

public class Cylinder  implements ThreeDShape {
	
	double r;
	double h;
	public Cylinder()
	{
		
	}
	public Cylinder(double r, double h) {
		super();
		this.r = r;
		this.h = h;
	}
	
	public void getVolume()
	{
		System.out.println("Volume "+Math.PI*r*r*h+"Sq. Unit");
	}
	
	public void getCurvedSurfaceArea()
	{
		System.out.println("Volume "+Math.PI*r*h+"Sq. Unit");
	}

	
	public void getTotalSurfaceArea()
	{
		System.out.println("Volume "+2*Math.PI*r*h+"Sq. Unit");
	}
	


}
