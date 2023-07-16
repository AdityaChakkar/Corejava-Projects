//create array using input from user.
package array;
import java.util.Scanner;
class ArrayUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number that you want to insert as element :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		//System.out.println("Enter the element of the array:");
		for (int i = 0; i< n ; i++ )
		{
			System.out.println("Enter element number "+i+" of the array:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are :");

		for (int ele : arr)
		{
			System.out.print(ele+" ");
		}
	}
}
