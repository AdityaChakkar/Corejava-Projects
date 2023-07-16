//Find the average of all the elements in the given array
package array;
class AverageOfArrayEle 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5};
		int avg=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=sum/(arr.length-1);
	}
	System.out.println("Average of element is "+avg);
  }
}
