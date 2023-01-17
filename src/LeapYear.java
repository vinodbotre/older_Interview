
public class LeapYear {
	
	public void leapyear()
	{
		int year=2024;
     if((year%4==0)||(year%400==0)&&(year%100!=0))//1st condition check- It is century leap year 
    	                                          //2nd condition check- It is leap year 
                                                  //  3rd condition is not century year
		   {
			   System.out.println("Leap year");
		   }
           else
		   {
			   System.out.println("Not Leap year");
		   }
	}  
		   public static void main(String []args)
		   {
			   LeapYear P2=new LeapYear();
			    P2.leapyear();
		   }

}
