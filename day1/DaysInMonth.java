package day1;
import java.util.Scanner;
class DaysInMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice :");
		int month = sc.nextInt();
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days in this month");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days in this month");
		break;
		case 2:
			System.out.println("28 days in this month");
		break;
		default : 
		System.out.println("Invalid Choice!!");
		break;
		}
	}
}
