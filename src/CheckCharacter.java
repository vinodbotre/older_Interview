import java.util.Scanner;

	public class CheckCharacter {

		public void toCheck(char ch)
		{
			
			 if(Character.isAlphabetic(ch)) 
			 {

	             System.out.println(ch + " is alphabet");

	        } 
			 else if(Character.isDigit(ch)) 
	        {

	             System.out.println(ch + " is digit");

	        } 
			 else
	        {
    
	             System.out.println(ch + " is special characters");
	        }
		}
		
		
		
		
		/*
		public void toCheck(char ch)
	{
		
		 if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		 {

             System.out.println(ch + " is alphabet");

        } 
		 else if(ch >= '0' && ch <= '9')
		 {

             System.out.println(ch + " is digit");

        } 
		 else 
		 {

             System.out.println(ch + " is special characters");
        }
	}
		 */
		
		public static void main(String args[])
		{
			CheckCharacter CC=new CheckCharacter();
			//taking input from user
			System.out.println("Please enter to check");
			Scanner sc=new Scanner(System.in);
			char a=sc.next().charAt(0);
			CC.toCheck(a);
			
			sc.close();
		}
	}



