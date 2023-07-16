package use_Method;
import java.util.Scanner;
class TaxPaidForCar 
{
	public static void checkTax(int price){
		if (price >= 500000 && price<=1000000 )
		{
			System.out.println("10% tax will be applied");
			int res = (price*10)/100;
			System.out.println("tax is :"+res);
			int total = res+price;
			System.out.println("total with tax" +total);
		}
		else if(price <500000){
			System.out.println("5% tax will be applied");
			int res = (price*5)/100;
			System.out.println("tax is :"+res);
			int total = res+price;
			System.out.println("total with tax" +total);
		}
		else if(price >1000000){
			System.out.println("20% tax will be applied");
			int res = (price*20)/100;
			System.out.println("tax is :"+res);
			int total = res+price;
			System.out.println("total with tax " +total);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price of the Car :");
		int price = sc.nextInt();
		checkTax(price);
	}
}
