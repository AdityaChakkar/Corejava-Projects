//find the minimum element in the array
package array;
class MinEleInArray 
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5,6,7,0};
		int min = arr[0];
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("The Minimum Element of array is : "+min);
	}
}
