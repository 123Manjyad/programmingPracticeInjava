package com.org.Shape_project;

import java.util.Scanner;

public class Game {
	
	Game()
	{
		System.out.println("Game has Started Now.....");
		System.out.println("x=========x===x=======x");
	}

	public int selectShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Two-D Shape");
		System.out.println("Press 2 for Three-D Shape");
	
		int choice=sc.nextInt();
		
		if(choice ==1)
		{
			return 1;
		}
		
		else if(choice ==2)
		{
			return 2;
		}
		
		else 
		{

				return selectShape();

		}
		
	}
	public  TwoDShape SelectTwoDShape()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 for Circle :");
		System.out.println("Press 2 for Triangle :");
		System.out.println("Press 3 for Rectangle :");
		System.out.println("Press 4 for SegmentCircle :");
		
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("You have selected Circle :");			
			System.out.println("Enter radius");
			double r=sc.nextDouble();
			Circle c2=new Circle(r);
			return c2;
		}
		else if(choice==2)
		{
			System.out.println("You have selected Triangle :");
			
			System.out.println("Enter Side1");
			double side1=sc.nextDouble();
			System.out.println("Enter Side2");
			double side2=sc.nextDouble();
			System.out.println("Enter Side3");
			double side3=sc.nextDouble();
			
			return new Triangle(side1,side2,side3);
		}
		
		else if(choice==3) {
			
			System.out.println("You have selected Rectangle :");
			System.out.println("Enter length ");
			double length=sc.nextDouble();
			System.out.println("Enter width ");
			double width=sc.nextDouble();
			
			return new Rectangle(length,width);
			
		}
     	else if(choice==4) 
     	{		
			System.out.println("You have selected SegmentCircle :");
			System.out.println("Enter Angle ");
			double angle=sc.nextDouble();
			System.out.println("Enter Radius ");
			double radius=sc.nextDouble();
			
			return new SegmentCircle(angle,radius);
			
		}
		else
		{
			
			System.out.println("You Enter Invalide Choice please Select Correct One");
		    return  SelectTwoDShape();
		}
	
	}
	public  ThreeDShape selectThreeDShape()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 for Cube :");
		System.out.println("Press 2 for Cylinder :");
		System.out.println("Press 3 for Cuboid :");
		System.out.println("Press 4 for Cone :");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("You have selected Cube :");
			
			System.out.println("Enter Side");
			double side=sc.nextDouble();
			 Cube c=new Cube(side);
			return c;
		}
		else if(choice==2)
		{
			System.out.println("You have selected Triangle :");
			
			System.out.println("Enter Radius");
			double radius=sc.nextDouble();
			System.out.println("Enter Height");
			double height=sc.nextDouble();
			
			
	        return new Cylinder(radius,height);
		}
		else if(choice==3)
		{
			System.out.println("You have selected Cuboid");
			System.out.println("Enter the height");
			double height=sc.nextDouble();
			
			System.out.println("Enter the length");
			double length=sc.nextDouble();
			
			System.out.println("Enter the width");
			double width=sc.nextDouble();
			
			return new Cuboid(height,length,width);
			
		}
		else if(choice==4)
		{
			System.out.println("You have selected Cone");
			System.out.println("Enter the height");
			double h=sc.nextDouble();
			
			System.out.println("Enter the length");
			double r=sc.nextDouble();
			
			System.out.println("Enter the width");
			double l=sc.nextDouble();
			
			return new Cone(h,r,l);
			
		}
		else
		{
			System.out.println("You Enter Invalide Choice please Select Correct One");
		     return  selectThreeDShape();
		}
	
	}
	
}
