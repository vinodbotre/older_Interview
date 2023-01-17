
public class NoObject1 {
	
	  static int noobj;
	  
	    
	
	   public static void main(String args[])
	   {
		    NoObject1 no1=new NoObject1();
		    
		    NoObject1 no2=new NoObject1();
		    
		    NoObject1 no3=new NoObject1();
		    
		    NoObject1 no4=new NoObject1();
		    
		    NoObject1 no5=new NoObject1();
		    
		    noobj=noobj+1;
		    
		    System.out.println("No of object "+noobj);
		
		    System.out.println(no1  instanceof NoObject1);
		
		
	   }

}
