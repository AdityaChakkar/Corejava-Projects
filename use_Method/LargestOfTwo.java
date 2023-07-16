package use_Method;
import java.util.Scanner;
class LargestOfTwo 
{
	static void checkLargest(int a,int b){
		if (a>b)
		{
		  System.out.println(a+" is Largest");
		}
		else{
			System.out.println(b+" is Largest");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		checkLargest(a,b);
	}
}
