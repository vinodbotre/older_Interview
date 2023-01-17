
public class ArrayOperation {
	
	
	public static void main(String args[])
	{
		
		
		int arr[]= {6, 3 ,9, 10, 5, 4, 2, 1};
		
		
		int size=arr.length;
		
		
		/*for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
			{
				int temp;
				temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
			System.out.println(arr[i]);
		}
		*/
		
		
	/*	System.out.println("even array element");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(+arr[i]);
			}
		}
		
		System.out.println("odd array element");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(+arr[i]);
			}
		}
		*/
		
		
		//	int arr[]= {6, 3 ,9, 10, 5, 4, 2, 1};
		/*int max = arr[0];
		
	      for (int i = 1; i<size; i++) {
	         if (arr[i] > max) 
	         {
	        	 max = arr[i];
	         }
	      }
	      System.out.println("Max Number in array is... " + max);  
	      
	     
	      
	      int min = arr[0];
			
	      for (int i = 1; i <size; i++) {
	         if (arr[i]<min) 
	         {
	        	 min = arr[i];
	         }
	      }
	      System.out.println("Min Number in array is... " + min);  
		*/
        
		
	/*	int sum=0;
		
		 for (int i = 0; i<size; i++)
		 {
			 
			 sum=sum+arr[i];
			 
		 }
		
		System.out.println("Sum of array using addition..."+sum);*/
	
		
		int arr1[]= {2,3,4,1,2,3,5,4,1};
		int cnt=0;
		int len=arr1.length;
		System.out.println("remove duplicates..");
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.println(arr1[i]);
					
					
				}
			}
		}
		System.out.println("remove duplicates..and other ");
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr1[i]>arr1[j])
					{
						System.out.println(""+arr1[i]);
					}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		int cnt=0;
		  for (int i=arr[0]; i<arr[size-1]; i++)
		    {
		      if (arr[cnt]==i)
		      {
		        cnt++;
		      }
		      else
		      {
		        System.out.print(i+" ");
		      }
		    }
		
		*/
		
	}

}
