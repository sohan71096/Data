package com.capgemini.salesmanagement.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;
import com.capgemini.salesmanagement.ui.util.DBConnection;



public class ProductDAO implements IProductDAO
{

	@Override
	public ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException 
	{
		Connection con= DBConnection.getConnection();
		Statement st=con.createStatement();
		ProductBean Bean=new ProductBean();
		ResultSet rs=null;
		
		rs=st.executeQuery(QueryMapper.view_details);
		while(rs.next())
		{
			System.out.println("Product Code:"+rs.getString(1)+" "+"Product_Name: "+rs.getString(2)+" "+"Product Category"+rs.getString(3)+" "+"Product Description: "+rs.getString(4)+" "+"Product Price :"+rs.getString(5));
			//donorId=rs.getString(1);
		}
		return null;
	}

	@Override
	public boolean insertSalesDetails(ProductBean db) throws SQLException, ClassNotFoundException, IOException
	{
		Connection con= DBConnection.getConnection();
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		
		
		
		String donorId=null;
		int queryResult=0;
		
		try
		{
			preparedStatement=con.prepareStatement(QueryMapper.insert_query);
			
			preparedStatement.setString(1, db.getProduct_Name());
			preparedStatement.setString(2, db.getProduct_Category());
			preparedStatement.setString(3, db.getProduct_description());
			preparedStatement.setDouble(4, db.getProduct_price());
		
			//preparedStatement.executeQuery();
			preparedStatement.executeUpdate();
			
			Statement st=con.createStatement();
			rs=st.executeQuery(QueryMapper.retrieve_all);
			while(rs.next())
			{
				System.out.println("Product Code:"+rs.getString(1)+" "+"Product_Name: "+rs.getString(2)+" "+"Product Category"+rs.getString(3)+" "+"Product Description: "+rs.getString(4)+" "+"Product Price :"+rs.getString(5));
				donorId=rs.getString(1);
			}
			
		}
		
		catch(SQLException sql)
		{
			
		}
		return false;
	}

	
}
