package use_Method;
import java.util.Scanner;
class AreaOFRectangle 
{
	public static void area(double l,double w){
		double result = l*w;
		System.out.println("Area  of Rectangle is : " +result);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		double l = sc.nextDouble();
		System.out.println("Enter Width of Rectangle : ");
		double w = sc.nextDouble();
		area(l,w);
	}
}
