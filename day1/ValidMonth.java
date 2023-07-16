package day1;

import java.util.Scanner;

class ValidMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter valid month :");
		String input =sc.next();
		String month=input.toLowerCase();
		switch (month) {
			case "january":
			case "february":
			case "march":
			case "april":
			case "may":
			case "june":
			case "jully":
			case "Augest":
			case "september":
			case "october":
			case "november":
			case "december":
			System.out.println("month is valid");	
				break;
		
			default:
			System.out.println("month is Invalid");
				break;
		}
		
	}
}
