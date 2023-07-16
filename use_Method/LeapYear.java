package use_Method;
import java.util.Scanner;
class LeapYear 
{
	public static void checkYear(int year){
		if (year % 4 ==0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					System.out.println("The Year is Centuary Leap Year.");
				}
				else{
					System.out.println("The Year is not Centuary Leap Year.");
				}
			}
			else{
				System.out.println("The Year is Leap Year.");
			}
		}
		else{
			System.out.println("The Year is not Leap Year.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = sc.nextInt();
		checkYear(year);
	}
}
