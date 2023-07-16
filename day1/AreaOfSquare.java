package day1;
import java.util.Scanner;
class AreaOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of Square :");
		int s= sc.nextInt();
		int result = s*s;
		System.out.println("Area of Square is :"+result);
	}
}
