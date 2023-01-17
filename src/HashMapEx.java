import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
/*Write a Java Program to iterate HashMap using While and advance for loop.

Answer: Here we have inserted three elements in HashMap using put() function.  */
public class HashMapEx {
	
	 public static void main(String[] args)
	 {
	        
	        HashMap map = new HashMap();
	        
	        map.put(2, "Saket");
	        map.put(25, "Saurav");
	        map.put(12, "HashMap");
	        
	        System.out.println(map.size());
	        
	        System.out.println("While Loop:");
	        
	        Iterator itr = map.entrySet().iterator();
	        
	        while(itr.hasNext())
	        {
	            Map.Entry me = (Map.Entry) itr.next();
	            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
	        }
	        System.out.println("For Loop:");
	        
	        for(Object me2: map.entrySet()) {
	            System.out.println("Key is: " + ((Entry) me2).getKey() + " Value is: " + ((Entry) me2).getValue());
	        }
	    }

}
