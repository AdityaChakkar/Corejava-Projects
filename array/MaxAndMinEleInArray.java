//find the maximum element in the array
package array;
class MaxAndMinEleInArray 
{
	public static void main(String[] args) 
	{
		int[] arr={1,4,3,6,9,7};
		int max=arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(" Maximum number in array is "+max);
	}
}
