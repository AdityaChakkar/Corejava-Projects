//70.sort the array using bubble sort.
package array;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,56,3,65,45,43,85,0,0,0,-1,-2,-1};
		for (int i = 0; i<arr.length ; i++ )
		{
			for (int j = 0; j<arr.length-1 ; j++ )
			{
				if (arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int el : arr)
		{
			System.out.print(el+ " ");
		}
	}
}
