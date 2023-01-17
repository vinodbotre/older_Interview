import java.util.Arrays;
import java.util.Scanner;

/*Java Program to determine whether two strings are the anagram*/
public class ArnagramString {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter First String");
	  String str1=sc.next();  
	  System.out.println("Enter Second String");
      String str2=sc.next();  

        
      str1 = str1.toLowerCase();  
      str2 = str2.toLowerCase();  

      
      if (str1.length() != str2.length()) {  
          System.out.println("Both the strings are not anagram");  
      }  
      else
      {  
           
          char strArr1[] = str1.toCharArray();  
          char strArr2[] = str2.toCharArray();  

            
          Arrays.sort(strArr1);  
          Arrays.sort(strArr2);  

          //Comparing both the arrays using in-built function equals ()  
          if(Arrays.equals(strArr1, strArr2) == true) {  
              System.out.println("Both the strings are anagram");  
          }  
          else {  
              System.out.println("Both the strings are not anagram");  
          }  
      }  
  }
}
