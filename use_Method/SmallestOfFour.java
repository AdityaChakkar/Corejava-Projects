package use_Method;
import java.util.Scanner;
class SmallestOfFour
{
	public static void checkSmallest(int a,int b,int c,int d){
		int result = (a<b)?(a<c?(a<d?a:d):(c<d?c:d)):(b<c?b:c);
			System.out.println(result+" is Smallest");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println("Enter third number :");
		int c = sc.nextInt();
		System.out.println("Enter fourth number :");
		int d = sc.nextInt();
		checkSmallest(a,b,c,d);
	}
}
