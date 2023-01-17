/*How to convert string to integer?*/
public class ConvertStringToInteger {
	
	public static void main(String[] args) {
		 
        String str = "12345";
 
        int result1 = Integer.parseInt(str); // using Integer.parseInt()
        
        int result2 = Integer.valueOf(str); //using Integer.valueOf()
 
        System.out.println("The converted int is: " + result1);
        
        System.out.println("The converted int is: " + result2);
 
    }
 
}
