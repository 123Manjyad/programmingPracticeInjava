package com.org.ProductProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductService {

	private List<Product> ll=new ArrayList<>();
	
	public void addProduct(Product p)
	{
		ll.add(p);
	}
	
	public void  getAllProduct()
	{
		for(Product p:ll)
		{
			System.out.println(p);
		}
	}
	
	public void  getAllShirt()
	{
		for(Product p:ll)
		{
			if(p instanceof Shirt)
			{
				System.out.println(p);
				
			}
		
		}
	}
	
	public void  getAllMobile()
	{
		for(Product p:ll)
		{
			if(p instanceof Mobile)
			{
				System.out.println(p);
				
			}
		
		}
	}
	
	public void getAllProductsOnCategory()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Category please    :::::");
		String ucatg=sc.nextLine();
		for(Product p:ll)
		{
			if(p.catg.equalsIgnoreCase(ucatg));
			{
				System.out.println(p);
			}
		}
		
		sc.close();
	}
	
	public void getProductCountCatg()
	{
		Map<String,Integer> m1=new HashMap<>();
		
		for(Product p:ll)
		{
			if(m1.containsKey(p.catg))
			{
				m1.put(p.catg, m1.get(p.catg)+1);
			}
			else
			{
				m1.put(p.catg,1);
			}
		}
		
		System.out.println(m1);
		
	}
	
	public void getAllCategory()
	{
		Set<String> s1=new TreeSet<>();
		for(Product p:ll)
		{
			s1.add(p.catg);
		}
		System.out.println(s1);
	}
	
	public void getProductType()
	{
		Set<String> s1=new TreeSet<>();
		for(Product p:ll)
		{
			if(p instanceof Shirt )
			{
				s1.add("Shirt");
			}
			else if(p instanceof Mobile )
					{
				s1.add("Mobile");
					}
			
			else
			{
				s1.add("No Such Product is Existed :::::");
			}
		}
		System.out.println(s1);
	}
	
	public void removeProduct()
	{
		
	}
	
}
