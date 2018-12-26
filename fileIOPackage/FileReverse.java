package fileIOPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReverse {
	
	public static void main(String[] args) throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\exercise\\Desktop\\New folder\\sample_project\\hello.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		try(FileReader inputStream = new FileReader("C:\\Users\\exercise\\Desktop\\New folder\\sample_project\\hello.txt");
				FileWriter outputStream = new FileWriter("C:\\Users\\exercise\\Desktop\\New folder\\sample_project\\copy.txt");)
		{
			int c;
			System.out.println(" ");
			System.out.println(" Content in copied file : ");
			while((c=inputStream.read())!=-1)
			{
				outputStream.write(c);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		FileInputStream wis = new FileInputStream("C:\\Users\\exercise\\Desktop\\New folder\\sample_project\\copy.txt");
		int j=0;
		//System.out.println(" ");
		String r = "";
		String k="";
		while((j=wis.read())!=-1)
		{
			r = r+(char)j;
			System.out.print((char)j);
		}
		System.out.println(" ");
		//System.out.println(r);
		
		char arr[] = r.toCharArray();
		for(int s=arr.length-1;s>=0;s--)
		{
			System.out.print(arr[s]);
		}
		
}
}