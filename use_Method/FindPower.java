package use_Method;
import java.util.Scanner;
class FindPower 
{
	static int checkPower(int num,int pow){
		int result = 1;
		if (pow >=0)
		{
			for (int i = 1;i<=pow ;i++ )
			{
				result*=num;
			}
		}
		else{
				for (int i = 1;i<= -pow ;i++ )
				{
					result/=num;
				}
			}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		System.out.println("Enter power :");
		int pow = sc.nextInt();
		int results=checkPower(num,pow);
		System.out.println("The power of " +num+ " is :"+results);
	}
}
