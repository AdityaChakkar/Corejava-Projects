package day1;
import java.util.Scanner;
class OddEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice :");
		int num = sc.nextInt();
		if (num % 2 == 0 )
		{
			System.out.println("The number is Even");
		}
		else{
			System.out.println("The number is Odd");
		}
	}
}
