package day1;
import java.util.Scanner;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount :");
		int p = sc.nextInt();
		System.out.println("Enter Rate in percentage :");
		int r = sc.nextInt();
		System.out.println("Enter Time in year :");
		int t = sc.nextInt();
		int result = (p*r*t)/100;
		System.out.println("The Simple Interest is "+result);
	}
}
