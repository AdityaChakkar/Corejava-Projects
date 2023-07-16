package pattern;
import java.util.Scanner;
class pattern19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		char ch = 'a';

		for (int i = 1 ; i <= 5 ; i++ )
		{
			for (int j = 1 ; j<= n ; j++ )
			{
				if (j%2==1)
				{
					System.out.print(num);
					num+=2;
					if (num > 9)
					{
						num =1;
					}
				}
				else{
					System.out.print(ch++);
					if (ch > 'z')
					{
						ch='a';
					}
				}
			}
			System.out.println();
		}
	}
}
