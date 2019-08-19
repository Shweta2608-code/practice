package gettingStarted;

public class insertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inst[] = {12,48,6,2,50,8};
		
		System.out.println("Array before Insertion Sort:");
		
		for(int i=0;i<inst.length;i++)
		{
			System.out.println(inst[i]+ " ");
			
		}
		
		insrtSort(inst);
		
		System.out.println("Array after Insertion Sort:");
		
		for(int i=0;i<inst.length;i++)
		{
			System.out.println(inst[i]+" ");
		}
		
	}
	
	static void insrtSort(int[] inst)
	{
		int n = inst.length;
		int temp;
		int j;
		
		for(int i=1;i<n;i++)
		{
			temp = inst[i];
			j= i-1;
			
			while(j>=0 && inst[j]>temp)
			{
				inst[j+1]= inst[j];
				j= j-1;
				                  
			}
			inst[j+1]= temp;
		}
	}

}
