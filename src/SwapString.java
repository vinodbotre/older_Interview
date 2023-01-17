

public class SwapString {
	
	
	    public static void main(String args[]) { 
	        String a = "seema"; 
	        String b = "dange"; 
	        System.out.println("Before swap: " + a + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After swap : " + a + b);  
	        
	        System.out.println('c' + 'o' + 'd' + 'e');
	        
	        String s1 = new String("coding");
	        String s2 = new String("CODING");
	        System.out.println(s1 = s2);
	        
	        String s11 = "coding";
	        StringBuffer s12 = new StringBuffer(s11);
	        System.out.println(s11.equals(s12));
	    } 
	

}
