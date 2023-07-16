package use_Method;
import java.util.Scanner;
class BloodDonate 
{
	public static void checkBloodDonate(int age,int weight){
		if (age >= 18 && age <=50)
		{
			if (weight >= 50)
			{
				System.out.println("You are eligible for donate the blood");
			}
			else{
				System.out.println("You are not eligible for donate the blood by weight");
			}
		}
		else{
			System.out.println("You are not eligible for donate the blood by age");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter weight :");
		int weight = sc.nextInt();
		checkBloodDonate(age,weight);
	}
}
