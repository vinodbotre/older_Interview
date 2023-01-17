/*triangle */
public class TrianglePattarn {
	 public static void main(String[] args) {
 /* //left triangle
		    // size of the triangle
		    int size = 5;
		    // loop to print the pattern
		    for (int i = 0; i < size; i++) {
		      // print column
		      for (int j = 0; j <= i; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }*/
		 
		 
		 
		 //right trianble
		 
		// size of the triangle
		    int size = 5;
		    // loop to print the pattern
		    for (int i = 0; i < size; i++) {
		      // print spaces
		    	
		      for (int j = 1; j < size - i; j++) {
		        System.out.print(" ");
		      }
		      // print stars
		      for (int k = 0; k <= i; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		 
		 
		  }
}
