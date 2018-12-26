package com.capgemini.salesmanagement.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.dao.ProductDAO;
import com.capgemini.salesmanagement.exception.ProductException;

public class ProductService implements IProductService
{
	ProductDAO productDAO=new ProductDAO();
	
	public void validateProduct(ProductBean bean) throws ProductException 
	{
		List<String> validationErrors=new ArrayList<String>();
		if(!(isValidName(bean.getProduct_Name())))
		{
				validationErrors.add("\nProduct name should be in alphabets and minimum 3 alphabets long");
		}
	
		if(!(isValidCategory(bean.getProduct_Category())))
		{
				validationErrors.add("\nProduct category name should be in alphabets and minimum 3 alphabets long\n");
		}
	
		if(!(isValidDescription(bean.getProduct_description())))
		{
				validationErrors.add("\nProduct description should be in alphabets and minimum 3 alphabets long\n");
		}
	
		if(!(isValidAmount(bean.getProduct_price())))
		{
				validationErrors.add("\nAmount should be positive number!!!\n");
		}
		if(!(isValidQuantity(bean.getQuantity())))
		{
				validationErrors.add("\nQuantity should be more than 1!!!\n");
		}
				
		if(!validationErrors.isEmpty())
		{
			throw new ProductException(validationErrors +"");
		}
	}

	private boolean isValidQuantity(int quantity)
	{
		// TODO Auto-generated method stub
		return quantity>0;
	}

	private boolean isValidAmount(double product_price) {
		// TODO Auto-generated method stub
		return product_price>0;
	}

	private boolean isValidDescription(String product_description)
	{
		Pattern descPattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher descMatcher=descPattern.matcher(product_description);

		return descMatcher.matches();
	}

	private boolean isValidCategory(String product_Category)
	{
		Pattern catPattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher catMatcher=catPattern.matcher(product_Category);

		return catMatcher.matches();
	}

	private boolean isValidName(String product_Name)
	{
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(product_Name);

		return nameMatcher.matches();
	}
	
	public boolean validateProductCodeId(int pid)
	{
		if(pid>1000 && pid<1050)
		{
			return true;
		}
		else 
			return false;
	}

	@Override
	public ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException 
	{
		productDAO=new ProductDAO();
		ProductBean productBean=null;
		productBean=productDAO.getProductDetails(productCode);
		return productBean;
	}

	@Override
	public boolean insertSalesDetails(ProductBean product) throws ClassNotFoundException, SQLException, IOException 
	{
		boolean r;
		r=productDAO.insertSalesDetails(product);
		return r;
	}
}
