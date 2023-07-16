//66.Only Prime number in a given array
class PrimeNoInArray
{
	public static void main(String[] args) 
	{
	   int [] arr = {1,2,3,4,5};
       for(int i=0; i<arr.length; i++){
		   int count=0;

		   for(int j=2; j<arr[i];j++){
          
		  if(arr[i]%j==0){

               count++;
		  }
		   }
		   if(count==0){
               System.out.println("prime num is "+arr[i]);
		}
	    }
	}
}
