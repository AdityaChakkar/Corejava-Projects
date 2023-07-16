package use_Method;
import java.util.Scanner;
class MarriageEligible 
{
	public static void checkMarriage(int age){
		if (age >=18)
		{
			if (age>=21)
			{
			 System.out.println("You are Eligible for Marriage");
			}
			else{
			 System.out.println("if you are a girl then you are Eligible for Marriage");
			 }
		}
		else{
		    System.out.println("You are not Eligible for Marriage");
		}	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		checkMarriage(age);
	}
}
