package com.org.Shape_project;

public class Cube  implements ThreeDShape{
	
	double side;
	public Cube()
	{
		
	}
	public Cube(double side) {
	
		this.side = side;
	}

	public void getVolume()
	{
		System.out.println("Volume of the Cube is "+side*side*side+"Cu. Unit");
	}
	
	public void getCurvedSurfaceArea()
	{
		System.out.println("Volume of the Cube is "+4*side*side+"Sq. Unit");
	}
	
	public void getTotalSurfaceArea()
	{
		System.out.println("Volume of the Cube is "+6*side*side+"Sq. Unit");	
		
	}

	
}
