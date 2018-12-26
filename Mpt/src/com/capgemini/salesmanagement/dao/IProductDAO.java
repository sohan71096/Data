package com.capgemini.salesmanagement.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;



public interface IProductDAO 
{
	public ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException;
	public boolean insertSalesDetails(ProductBean product) throws SQLException, ClassNotFoundException, IOException;	
}
