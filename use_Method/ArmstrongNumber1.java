package use_Method;
import java.util.Scanner;
class  ArmstrongNumber1
{
//wap to check given number is armstrong  ya not without using Math.pow
//11=1sqr+1sqr , 153=1cube+5cube+3cube   153 is armsstrong number 
	public static void armstrong(int num)
		{
		int temp1=num;
		int temp=num;
		int sum=0;
		int count=0;
		int lastdigit=0;

		while(temp1!=0)
		{
			count++;
			temp1/=10;
		}
       System.out.println(count);
       while(num!=0)
		{
		  int pow=count;
           lastdigit=num%10;
		   int lastdigit1=lastdigit;

		   // logic for Math.pow(lastdigit,pow)
		   for(int j=1;j<pow;j++){
             lastdigit1*=lastdigit;
		   }
		   sum+=lastdigit1;
		   num=num/10;
		}
		if(temp==sum){
			System.out.println(temp+" is a armstrong number");
		}
		else{
             System.out.println(temp+" is not armstrong number");
		}  
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num ");
		int num = sc.nextInt();
	     armstrong(num);
	}
}
