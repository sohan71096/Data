package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.dao.ProductDAO;
import com.capgemini.salesmanagement.exception.ProductException;
import com.capgemini.salesmanagement.service.IProductService;
import com.capgemini.salesmanagement.service.ProductService;

public class Client 
{
	static IProductService productService=null;
	static ProductService productServiceImpl=null;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ProductBean productBean=null;
		String donorCode=null;
		int option=0;
			
		
		
		while (true)
		{
			
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\tBilling Software Application");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.View Product Information");
		System.out.println("2.Insert Product Details");
		System.out.println("3.Exit Application");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Enter your choice:");
		
		try {
			option=sc.nextInt();
				switch (option)
				{
					case 1:
							
									System.out.println("Enter the id on which u want to view the details: ");
									int pid=sc.nextInt();
									try
									{
										productBean=new ProductBean();
										productServiceImpl=new ProductService(); 
										
										
										if(productServiceImpl.validateProductCodeId(pid))
										{
											productBean=productService.getProductDetails(pid);
										}
										else
										{
											System.out.println("Product id is not valid ");
										}
									}
									catch(Exception exp)
									{
										System.err.println("Error not valid :"+exp.getMessage());
									}
								
								
								break;
							
		
					case 2:
						Boolean r;
						productBean=new ProductBean();
						
								productBean=populateProductBean();
						
					
						productServiceImpl=new ProductService(); 
							try {
								
								r=productServiceImpl.insertSalesDetails(productBean);
							}
							
							catch(Exception c) 
							{
								
							}
							
						break;
						
					case 3:
						System.out.println("Exiting the Menu");
						System.exit(0);
						break;
				}		
		
		
				}catch(Exception e)
				{
					
				}
		
		
		
	}
}

	private static ProductBean populateProductBean() 
	{
		ProductBean productBean=new ProductBean();
		System.out.println("Enter Product Name: ");
		productBean.setProduct_Name(sc.next());
		System.out.println("Enter Product Category: ");
		productBean.setProduct_Category(sc.next());
		System.out.println("Enter Product description: ");
		productBean.setProduct_description(sc.next());
		System.out.println("Enter the product price: ");
		productBean.setProduct_price(sc.nextDouble());
		System.out.println("Enter the product quantity: ");
		productBean.setQuantity(sc.nextInt());
		productServiceImpl=new ProductService(); 
		try
		{
			productServiceImpl.validateProduct(productBean);
			return productBean;
		}
		catch(ProductException prdtException)
		{
			System.err.println("Invalid data: ");
			System.err.println(prdtException.getMessage()+ "\n Try again..");
			System.exit(0);
		}
		return null;
	}
}
