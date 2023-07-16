package use_Method;
import java.util.Scanner;
class AreaOfSquare
{
	public static void area(double s){
		double area = s*s;
		System.out.println("Area of Square is : "+area);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of Square: ");
		double s = sc.nextDouble();
		area(s);
	}
}
