package gettingStarted;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {28,12,2,16,4,36,8};
		
		System.out.println("Array before Merge Sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	
	    sort(arr,0,arr.length-1);
		
	}

	static void sort(int arr[], int l,int n )
	{
		if(l<n)
		{
			//find the middle element
		    int m = (l+n)/2;
		    
		    //sort first half
			sort(arr,l,m); 
			
			//sort second half
			sort(arr,m+1,n);

			//merge the 2 halves into one
			merge(arr,l,m,n);
			
			
		}
		
	}
	
	static void merge(int arr[],int first,int mid,int last)
	{
		int l1 = mid-first+1;
		int l2 = last-mid;
		
		
	}
}
