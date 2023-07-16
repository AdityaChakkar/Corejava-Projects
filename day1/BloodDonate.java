package day1;
import java.util.Scanner;
class BloodDonate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age :");
		int age = sc.nextInt();
		System.out.println("Enter Your weight :");
		int weight = sc.nextInt();
		if (age>=18 && age<=60)
		{
			if (weight >=50)
			{
				System.out.println("You are eligible for donate the blood");
			}
			else{
				System.out.println("You are not eligible by weight");
			}
		}
		else{
			System.out.println("You are not eligible by age");
		}
	}
}
