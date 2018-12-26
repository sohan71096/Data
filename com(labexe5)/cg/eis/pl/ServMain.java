package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class ServMain 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String name=sc.nextLine();
		System.out.println("Enter employee id: ");
		int id=sc.nextInt();
		System.out.println("Enter salary of employee: ");
		double sal=sc.nextLong();
		System.out.println("Enter designation of employee: ");
		String design=sc.next();
		
		Service sr=new Service();
		sr.setSalary(sal);
		sr.setDesignation(design);
		System.out.println(sr.getDesignation());
		Employee employee=new Employee();
		employee.setName(name);
		employee.setId(id);
		System.out.println(employee.getName());
		System.out.println(employee+" "+sr);
		sr.employeeInsurance();
		sc.close();
		
	}
	
}
