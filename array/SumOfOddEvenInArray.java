//64.sum of odd numbers and sum of even numbers in given array
package array;
class SumOfOddEvenInArray 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,6};
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evensum+=arr[i];
			}
			else
			{
				oddsum += arr[i];
			}
		}	 
		 System.out.println("Sum of Even Numbers in given array is "+evensum);
		 System.out.println("Sum of Odd Numbers in given array is "+oddsum);
	}
}
