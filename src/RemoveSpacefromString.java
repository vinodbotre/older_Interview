
public class RemoveSpacefromString {

	
	public static void main(String args[])
	{
		
		//using replace mehtod
		   String str = "  Seema  Dange  ";
	       
	        // Call the replaceAll() method
	        str = str.replaceAll("\\s", "");
	       
	        System.out.println(str);
	        
	        
	        
	        
	        
	    //without using replace ()
	        
	        String str1 = "I             Am   A Professor";
	        
	        char chars[] = str1.toCharArray();
	  
	        StringBuffer sb = new StringBuffer();
	  
	        for (int i = 0; i<chars.length; i++)
	        {
	            if( (chars[i] != ' ') && (chars[i] != '\t') )
	            {
	                sb.append(chars[i]);
	            }
	        } 
	        System.out.println(sb);      
	        
	        
	        
	}
	
	
	
}
