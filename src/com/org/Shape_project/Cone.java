package com.org.Shape_project;

public class Cone implements ThreeDShape {
	
	double r;
	double h;
	double l;

	Cone()
	{
		super();
	}

	public Cone( double h,double r, double l) {
		super();
		this.r = r;
		this.h = h;
		this.l = l;
	}






	@Override
	public void getVolume() {
		 
		System.out.println("Volume of the Cone is "+0.334*Math.PI*r*r*h+" Cu Unit ");
		
	}

	@Override
	public void getCurvedSurfaceArea() {
	
		System.out.println("CurvedSurfaceArea  of cone is "+Math.PI*r*l+" Sq Unit");
		
	}

	@Override
	public void getTotalSurfaceArea() {
		
		
		System.out.println("TotalSurfaceArea of the cone is "+Math.PI*r*(r+l)+"Sq Unit");
		
	}
	
	
	@Override
	public String toString() {
		return "Cone [r=" + r + ", h=" + h + ", l=" + l + "]";
	}


}
