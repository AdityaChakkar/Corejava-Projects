//75.Program to replace given element in an array
package array;
import java.util.Scanner;
class ReplaceElement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6,7};
		for (int elem :arr )
		{
			System.out.print(elem+" ");
		}
		System.out.print("\nEnter the number which you want to replace in the given array ");
		int ele1 = sc.nextInt();
		System.out.print("Enter your choice number that you want to replace ");
		int ele2 = sc.nextInt();

		for (int i = 0 ; i<arr.length ; i++ )
		{
			if (arr[i] == ele1)
			{
				arr[i]=ele2;
			}
		}
		for (int ele : arr )
		{
			System.out.print(ele+" ");
		}
	}
}
