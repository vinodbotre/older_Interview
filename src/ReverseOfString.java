

import java.util.Scanner;

public class ReverseOfString {
public 	String getReverseString(String revstr)
	{
	
	  char ch[]=revstr.toCharArray();
	    String revs=" ";  
	   
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	
	    	 revs=revs+ch[i];  
	    	
	    }
	    return revs;
		
	}
    public static void main(String args[])
    {
      ReverseOfString rs=new ReverseOfString();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String to reverse");
      String str=sc.nextLine();
     String rev= rs.getReverseString(str);
     System.out.println("Reverse of string is "+rev);
	}

}
