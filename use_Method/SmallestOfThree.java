package use_Method;
import java.util.Scanner;
class SmallestOfThree 
{
	static void smallest(int a,int b,int c){
		int result =(a<b)?(a<c?a:c):(b<c?b:c);
		System.out.println(result+" is smallest");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number :");
		int c = sc.nextInt();
		smallest(a,b,c);
	}
}
