package com.capgemini.salesmanagement.service;

import java.io.IOException;
import java.sql.SQLException;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;

public interface IProductService
{
	public ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException;
	public boolean insertSalesDetails(ProductBean product) throws ClassNotFoundException, SQLException, IOException;
}
