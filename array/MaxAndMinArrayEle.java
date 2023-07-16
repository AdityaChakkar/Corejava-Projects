//81.Find differnce between maximum and minimum element in an array.
package array;
class MaxAndMinArrayEle 
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5};
		int max = arr[0];
		for (int i = 0 ; i<arr.length ; i++ )
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("The Maximum element in array is : "+max);

		int min = arr[0];
		for (int i = 0; i<arr.length ; i++ )
		{
			if (arr[i]< min)
			{
				min = arr[i];
			}
		}
		System.out.println("The Minimum Element in array is : "+min);

		System.out.println("Differencce between Maximum and Minimum element of array is : "+(max-min));
	}
}
