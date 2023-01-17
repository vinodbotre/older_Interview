import java.util.Scanner;

public class ReversePalinNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter no");
		int num=sc.nextInt();
		int number=num;
	   int rev=0;
	   while(num!=0)
	   {
		  rev=rev*10;
		  rev=rev+num%10;
		  num=num/10;
	   }
	   
	   System.out.println(rev);
	
   
	if(number==rev)
	{
	System.out.println(number+"Number is palindrome");	
	}else
	{
	System.out.println(number+"Number is not palindrome");	
	}
}
}
