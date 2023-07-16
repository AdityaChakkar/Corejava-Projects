//Check Whether the given number is XYLEM number or not (sum of mean digit = sum of extreme digit)
// for eg = 1234 == 1+4 == 2+3 ans:-1+4=5and 2+3=5 therefore 5==5 then it is the XYLEM number.
package use_Method;
import java.util.Scanner;
class XYLEM_Phloem_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 3 digit number :");
		int num = sc.nextInt();
		int num1 = num;
		int ext = 0;
		int mean = 0;
		while (num1 >0)
		{
			int last= num1 % 10 ;
			if (num1 == num || num1 <= 9)
		{
			ext += last;
		}
		else{
			mean += last;
		}
		num1/=10;
		}
		if (ext==mean)
		{
			System.out.println(ext+"=="+mean+" Xylem Number");
		}
		else{
			System.out.println(ext+"=!"+mean+" phloem Number");
		}
	}
}
