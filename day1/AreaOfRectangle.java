package day1;
import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle :");
		int l= sc.nextInt();
		System.out.println("Enter Width of Rectangle :");
		int w= sc.nextInt();
		int result = l*w;
		System.out.println("Area of Rectangle is :"+result);
	}
}
