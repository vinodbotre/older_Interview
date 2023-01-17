
public class ThirstSmallest {
	
	public static void main(String args[])
	{
		
		int arr[]= {23,45,12,78,20};
		
		System.out.println("Sorting of array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					 temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
					
				}
			}
			System.out.println(arr[i]);	
			
		}
		
		for(int i1=arr.length-1;i1>0;i1--)
		{
			System.out.println(arr[i1]);
		}
		int size=arr.length;
		System.out.println("Third smallest number is:: "+arr[size-5]);
 	}


}
