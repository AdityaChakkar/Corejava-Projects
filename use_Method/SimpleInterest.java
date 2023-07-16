package use_Method;
import java.util.Scanner;
class SimpleInterest 
{
	public static void resultSI(double p,double r,double t){
		double result = (p*r*t)/100;
		System.out.println("The Simple Interest is : "+result);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal in rupees :");
		double p = sc.nextDouble();
		System.out.println("Enter Rate in percentage :");
		double r = sc.nextDouble();
		System.out.println("Enter Time in year :");
		double t = sc.nextDouble();
		resultSI(p,r,t);
	}
}
