import java.util.Scanner;
/*Java Program to count the total number of characters in a string*/
public class TotalNoOfCharacter {
	public static void main(String args[])
	{

		 int vowels=0;
		int number=0;
		int space=0;
		int character=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		str.toLowerCase();
		for (int i = 0; i <str.length();i++)
		 {
		      char ch = str.charAt(i);
		      
		      if(ch>='a' && ch <= 'z')
				 {
					 character++;
				 }
		      else	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' || ch == 'U')
			 {
				 vowels++;
				 
			 }else if(ch >= '0' && ch <= '9')
				 
			 {
		       number++;
		      
			 
			 }else if(ch ==' ')
				 
			 {
		       space++;
		      
			 }
			
		 }
		System.out.println("Total no of Character .."+character);
		 System.out.println("Total no of vowels .."+vowels);
		 System.out.println("Total no of numbers .."+number);
		  
	     System.out.println("Total no of space .."+space);
		
		 
		 }
	
	

}
