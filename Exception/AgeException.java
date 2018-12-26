package labexe4;

public class AgeException extends Exception 
{	
	String str;
	public AgeException(String s) {
		// TODO Auto-generated constructor stub
		str=s;
	}

	public String toString() {
		
		return ("Age Exception: \n"+str);
	}
	
}
