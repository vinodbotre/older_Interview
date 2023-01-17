

import java.util.Scanner;

public class CountNoOfAVN {
	
	public void findAVN(String str)
	{   
		int cntAlphabet=0;
		int cntNumber=0;
		int cntVowels=0;
		int cntSpace=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		
		if(ch>='A'&& ch<='Z'|| ch>='a' && ch<='z')
		{
		    cntAlphabet++;
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			cntVowels++;
		}
			
		}else if (ch>='0'&& ch<='9')
		{
			cntNumber++;
		}else if(ch==' ')
		{
			cntSpace++;
		}
		}
		System.out.println("Total no of Alphabets "+cntAlphabet);
		System.out.println("Total no of Vovewls "+cntVowels);
		System.out.println("Total no of Numebers "+cntNumber);
		System.out.println("Total no of Spaces "+cntSpace);
		
		
	}
	
	public static void main(String args[])
	{
		CountNoOfAVN co=new CountNoOfAVN();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string having numbers");
		String str=sc.nextLine();
		co.findAVN(str);		
	}
	

}
