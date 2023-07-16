package pattern;
class Pattern25
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		int num = 1;
		for (int i = 1; i<= 5 ; i++ )
		{
			for (int j = 1 ; j <= i ; j++ )
			{
				if (j%2==0)
				{
					System.out.print(num++);
				}
				else{
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}
