package use_Method;
import java.util.Scanner;
class DisplayMarks 
{
	static void totalMarks(double mar,double eng,double hin,double math){
		double percent = (mar+eng+hin+math)/4;
		System.out.println("Total percentage is : "+percent);
		if (percent>=35)
		{
			System.out.println("You are Pass");
		}
		else{
			System.out.println("You are Fail");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Marathi : ");
		double mar = sc.nextDouble();
		System.out.println("Enter Marks of English : ");
		double eng = sc.nextDouble();
		System.out.println("Enter Marks of Hindi : ");
		double hin = sc.nextDouble();
		System.out.println("Enter Marks of Mathematics : ");
		double math = sc.nextDouble();

		totalMarks(mar,eng,hin,math);
	}
}
