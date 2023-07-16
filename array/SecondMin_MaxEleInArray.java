//find 2nd minimum and 2nd maximum element from an array
package array;
class SecondMin_MaxEleInArray 
{
	public static void main(String[] args) 
	{
		int[] arr={4,5,3,7,1,2,6};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=i+1;j<arr.length;j++)
			{
			 if(arr[i]>arr[j])
				{
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSecond minimum element in given array is "+arr[1]);
	    System.out.println("Second maximum element in given array is "+arr[arr.length-2]);
	}
}
