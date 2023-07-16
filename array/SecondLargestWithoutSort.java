//Find Second Largest Without sorting the array
package array;
class SecondLargestWithoutSort 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		int largest = 0;
		int secondLargest = 0;
		System.out.print("Array : ");
		for (int i= 0; i<arr.length ; i++ )
		{
			System.out.print(arr[i]+" ");
			if (arr[i]>largest)
			{
				
				secondLargest =largest ;
				largest= arr[i];
			}else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
		}
		//	if (secondLargest == 0) {
			   //         System.out.println("There is no second largest element.");
			   //     } else {
            System.out.println("\nThe second largest element is : "+secondLargest);
       // }
	}
}
