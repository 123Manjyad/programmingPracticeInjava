package com.org.Shape_project;

public class Circle implements TwoDShape {
  double r;
  Circle()
  {
	  super();
  }
  
  Circle(double r)
  {
	  if(r>0)
	  {
		  System.out.println("Radius is valide please Go ahead");
		  this.r=r;
	  }
	  else
	  {
		  System.out.println("Radius is Invalide please Go Back");
	  }

  }
  
  public void getArea()
  {
	  System.out.println("Area of the Circle is "+Math.PI*r*r+" Sq Unit");
  }
  
  public void getPerimeter()
  {
	  System.out.println("Perimeter of the Circle is "+2*Math.PI*r+" Unit");
  }
}
