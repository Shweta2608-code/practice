package gettingStarted;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {48,12,6,16,32};
		
		System.out.println("Array before Selection Sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		
		selSort(arr);
		
		System.out.println("Array after Selection Sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}
	
	static void selSort(int [] arr)
	{
		int n = arr.length;
		int temp,element;
		
		for(int i=0;i<n;i++)
		{
			temp = arr[i];
			for(int j=i+1;j<n;j++)
			{
			   if(arr[j]<temp)
			   {
				   temp = j;  
			   }
			}
		element = arr[temp];
		arr[temp] = arr[i];
		arr[i]= element;
			          
		}
		
	}

}
