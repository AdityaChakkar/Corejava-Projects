package pattern;
import java.util.Scanner;
class Pattern20 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for (int i = 1 ; i<= 5 ; i++ )
		{
			for (int j = 1 ; j<= n ; j++ )
			{
					if (num > 9)
					{
						num =1;
					}
				System.out.print(num++);
			}
			System.out.println();
		}
		System.out.println();
	}
}
