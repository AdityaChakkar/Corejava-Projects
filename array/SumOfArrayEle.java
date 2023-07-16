//Find the sum of all the elements in the given arraypackage array;
class SumOfArrayEle
{
	public static void main(String[] args) 
	{
		int[] arr={0,1,2,3,4};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Elements is "+sum);
	}
}