import java.util.Scanner;

/*Java Program to count the total number of vowels and consonants in a string*/

public class TotalNoOfVovwelConstant {
  
	  public static void main(String args[])
	  {
		  String vowConsStr;
			int i, vowels, consonants;
			vowels = consonants = 0;
			char ch;
			
			Scanner sc= new Scanner(System.in);

			System.out.print("\nPlease Enter Vowel, Consonant String =  ");
			 
			vowConsStr = sc.nextLine();
			
			for(i = 0; i < vowConsStr.length(); i++)
			{
				ch = vowConsStr.charAt(i);
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
						ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels++;
				}
				else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
					consonants++;
				}
			}		
			System.out.println("\nNumber of Vowel Characters     =  " + vowels);
			System.out.println("Number of Consonant Characters =  " + consonants);
	  }
	
}
