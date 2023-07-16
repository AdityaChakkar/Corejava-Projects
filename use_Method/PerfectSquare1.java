package use_Method;
import java.util.Scanner;
class PerfectSquare1
{
//wap to check number is perfect squre or not
//for eg (1,4,9,16,25....n)
	public static void squre(int num){
     
	 boolean condition=false;

	for(int i=1; i<=100; i++){
       
	   if(num==i*i){

          condition=true;
	   }
	}

	if(condition){

          System.out.println(num+" is a perfect square");
	}
	else{

		System.out.println(num+" is not a perfect square");

	}

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1 ");
		int num = sc.nextInt();
		
		squre(num);
	}
}
