package day1;
import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args) 
	{
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		int r = sc.nextInt();
		double result = pi*(r*r);
		System.out.println("Area of Circle is : "+ result);
	}
}
