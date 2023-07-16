package day1;
import java.util.Scanner;
class MarriageEligible 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int age = sc.nextInt();
		if (age>=21)
		{
			System.out.println("You are eligible for marriage");
		}
		else{
			System.out.println("You are not eligible for marriage");
		}
	}
}
