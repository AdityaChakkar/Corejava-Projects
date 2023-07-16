//Find Second Smallest Without sorting the array
package array;
class SecondSmallestWithoutSort
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		System.out.print("Array : ");
		for (int i= 0; i<arr.length ; i++ )
		{
			System.out.print(arr[i]+" ");
			if (arr[i]<smallest)
			{
				
				secondSmallest =smallest ;
				smallest= arr[i];
			}else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
		}
			 if (secondSmallest == Integer.MAX_VALUE) {
			             System.out.println("There is no second smallest element.");
			         } else {
            System.out.println("\nThe second smallest element is : "+secondSmallest);
        }
	}
}
