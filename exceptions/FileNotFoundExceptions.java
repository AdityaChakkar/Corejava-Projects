//97.handle FileNotFoundException

package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class FileNotFoundExceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream file =new FileInputStream("C:\\Users\\aditya\\text.txt");
			System.out.println(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotHandledException handled");
		}
	}
}
