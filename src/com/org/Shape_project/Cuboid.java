package com.org.Shape_project;

public class Cuboid implements ThreeDShape {
      double length;
      double width;
      double height;
      
      public Cuboid() {
		super();
	}
      
      
	public Cuboid(double height,double length, double width ) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}



	@Override
	public void getVolume() {
		 System.out.println("Volume of the Cuboid is "+length*width*height+" Cube Unit");
		
	}

	@Override
	public void getCurvedSurfaceArea() {
		
		System.out.println("CurvedSurfaceArea of the Cuboid is"+2*length*(width+height)+"Sq Unit");
	}

	@Override
	public void getTotalSurfaceArea() {
		
		
		System.out.println("TotalSurface Area of the Cuboid is "+2*(length*width+width*height+height*length)+"Sq Unit");
		
	}
	

	@Override
	public String toString() {
		return "Cuboid [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

	

}
