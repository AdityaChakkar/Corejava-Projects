package use_Method;
import java.util.Scanner;
class AreaOfCircle 
{
	public static void checkArea(double r){
		double pi = 3.14;
		double result = pi*(r*r);
		System.out.println("Area of circle is :"+result);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		double r = sc.nextDouble();
		checkArea(r);
	}
}
