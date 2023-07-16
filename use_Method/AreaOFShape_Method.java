//WAP to create method area(int, String)
//Where int is the size/radius
//String is the Shape
//And find area of "circle" and "square" accordingly.
package use_Method;
import java.util.Scanner;
class AreaOFShape_Method 
{
	public static double area(double b, String a){
  		 if (a=="circle")
		{
			 b=3.14*b*b;
		}
		else if (a=="square")
		{
			b=b*b;
		}
		return 0;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size/Radius : ");
		double size = sc.nextInt();
		System.out.println("Enter Shape : ");
		String shape = sc.next();
		System.out.println("Area of the given "+shape+ " is "+area(size,shape.toLowerCase()));
	}
}
