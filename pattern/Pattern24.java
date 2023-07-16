package pattern;
class Pattern24
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i<= 5 ; i++ )
		{
			char ch = 'a';
			int num = 1;
			for (int j = 1 ; j <= i ; j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch++);
				}
				else{
					System.out.print(num++);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
