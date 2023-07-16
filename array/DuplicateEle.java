//find the duplicate element in the given array
package array;
class DuplicateEle
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,1,5,4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					System.out.println("Duplicate number is "+arr[j]);
				}
			}
		}
	}
}
