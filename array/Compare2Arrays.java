//72.compare element in two arrays and return true if arrays are identical
package array;
class Compare2Arrays 
{
	public static void main(String[] args) 
	{
		int [] arr1 = {1,2,3,4,5,6,7,8};
		int [] arr2 = {1,2,3,4,34,45,7,8};
		for (int i = 0 ; i <arr1.length ; i++ )
		{
			for (int j = 0 ; j<arr2.length ; j++ )
			{
		
		           if (arr1[i]==arr2[j])
				{
					System.out.println("Arrays are same");
				}
				else{
					System.out.println("Arrays are different");
				}
			}
	    }
	}
}
