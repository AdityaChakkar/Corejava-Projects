class Program5 
{
	public static void main(String[] args) 
	{
		int [][][] mat1 = {{{1,1,1},
							{2,2,2},
							{3,3,3}}};
		int [][][] mat2 = {{{1,1,1},
							{2,2,2},
							{3,3,3}}};
		int [][][] mat3 = {{{1,1,1},
							{2,2,2},
							{3,3,3}}};
		int [][][] result = {{{0,0,0},
							  {0,0,0},
						   	  {0,0,0}}};
		for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                for (int k = 0; k < mat2[i].length; k++) {
                    result[i][j][k] = mat1[i][j][k] * mat2[i][j][k] * mat3[i][j][k] ;
                    System.out.print(result[i][j][k] + " ");
                }
                System.out.println();
        	}
		}
	}
}
