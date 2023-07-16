//Average of odd and even numbers in given array
package array;
class AvgOfOdd_EvenInArray 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,6};
		int evensum=0;
		int oddsum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evensum+=arr[i];
				count ++;
			}
			else
			{
				oddsum += arr[i];
				count ++;
			}
		}
		 System.out.println("Average of Even Numbers in given array is "+evensum/count);
		 System.out.println("Average of Odd Numbers in given array is "+oddsum/count);

	}
}
