package com.org.Shape_project;

public class User {
	public static void main(String[] args) {
		Game g=new Game();
 
		int choice=g.selectShape();
		
		if(choice ==1)
		{
			
			System.out.println("You have Selected Two-D Shape :");
			TwoDShape td=g.SelectTwoDShape();
			
			 td.getArea();
			 td.getPerimeter();
	
		
		}
		else if(choice==2)
		{
			
			System.out.println("You have Selected Three-D Shape :");
			ThreeDShape td= g.selectThreeDShape();
			
			td.getVolume();
			td.getCurvedSurfaceArea();
			td.getTotalSurfaceArea();
			
		
			
			
		}
	}

}
