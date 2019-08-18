package gettingStarted;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bub[]= {4,12,2,8,16};
		
		System.out.println("Array before Bubble sorting:");
		for(int i=0;i<bub.length;i++)
		{
			System.out.println(bub[i]+ " ");
		}
      
		bubbleSortEx(bub);
		
		System.out.println("Array after Bubble Sort:");
		for(int i=0;i<bub.length;i++)
		{
			System.out.println(bub[i]+ " ");
		}
		
	}

	static void bubbleSortEx(int[] bub)
	{
		int n= bub.length;
		int temp =0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-1;j++)
			{
				if(bub[j-1]>bub[j])
				{
					temp = bub[j-1];
					bub[j-1] = bub[j];
					bub[j] = temp;
				}
			}
		}
	}
}
