package use_Method;
import java.util.Scanner;
class ValidMonth 
{
		 public static void checkMonths(String month){
			switch (month)
			{
			case "January":
			case "February":
			case "March":
			case "April":
			case "May":
			case "June":
			case "July":
			case "Augest":
			case "September":
			case "October":
			case "November":
			case "December":
				System.out.println("Month is Valid");
				break;
			default :
				System.out.println("Month is not Valid");
			break;
			}
		 }
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valid Month :");
		String month = sc.next();
		checkMonths(month);
	}
}
