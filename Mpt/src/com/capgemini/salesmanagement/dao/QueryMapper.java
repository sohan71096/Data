package com.capgemini.salesmanagement.dao;

public interface QueryMapper 
{
String retrieve_all="select * from product order by product_code";
String view_details="select * from product where product_code=?";
String insert_query="insert into product values(prdt_seq.nextval,?,?,?,?)";
}
