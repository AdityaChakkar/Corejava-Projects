//74.in an array element separate them base on odd number and even number
//ex:9,2,1,8,6
//output:9,1,2,8,6

package array;
class SeparateOddEven
{
	public static void main(String[] args) 
	{
		int [] arr = {1,3,5,7,9,2,4,6,8,10,};
		for (int i = 0; i<arr.length ; i++ )
		{
			for (int j = 0 ; j< arr.length-1 ; j++ )
			{
				if (arr[j]%2==0)
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int ele : arr )
		{
			System.out.print(ele+" ");
		}
	}
}
