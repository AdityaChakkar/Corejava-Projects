//WAP to find how many prime numbers are present in the given number 
//for eg - 4543 -> 2 prime number =>5,3
package use_Method;
import java.util.Scanner;
class CountPrime
{
	static void countPrime(int num){
		int count=0;
		int rem=0;
		while(num>0)
		{
		rem=num%10;
		for(int i=1;i<=num;i++)
		{
			if(rem%i==0)
			{
              count++;
			}
			num=num/10;
		}
		if(count==2)
			{
              count++;
			}
		}
		System.out.println(count);

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 1 digit number :");
		int num = sc.nextInt();
		countPrime(num);
	}
}
