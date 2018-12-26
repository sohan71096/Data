package fileIOPackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadDisplay {
	
	public static void main(String[] args) throws IOException {
	
		FileWriter fis = new FileWriter("numbers.txt");
		fis.write(1);
		fis.write(2);
		FileReader fr = new FileReader("numbers.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			
		}
		
		
		
	}

}
