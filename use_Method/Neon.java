//9 is the neon number 
//for example 9*9 = 81 and 8+1 =9 then 9==9 therefore 9 is neon number
package use_Method;
import java.util.Scanner;
 class Neon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//9
		int mult=num*num;
		int sum=0;
		while(mult>0)
		{
			int last=mult%10;
			sum=sum+last;
			mult/=10;
		}
		if(num==sum)

		{
			System.out.print("NEON NUMBER");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
		
	}

}
