package array;
import java.util.Scanner;
class userInputArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter Array elements :");
		for (int i = 0; i<= arr.length ; i++ )
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[i]);
	}
}
