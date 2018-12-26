package com.cg.eis.exception;

public class EmployeeException extends Exception 
{
	String str;
	public EmployeeException(String s) {
		// TODO Auto-generated constructor stub
		str=s;
	}
	public String toString() {
		return ("You enetered salary below 3000 "+str);
	}
	
}
