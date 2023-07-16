package exceptions;
@SuppressWarnings("serial")
class SalaryException extends RuntimeException
{
	@Override
		public String getMessage(){
			return "Salary cannot be negative";
	}
}
class Employee
{
	String name;
	double sal;

	Employee(String name,double sal){
		this.name = name;
		if (sal>0)
		{
			this.sal = sal;
		}
		else{
			throw new SalaryException();
		}
	}
}
class SalaryExceptions 
{
	public static void main(String[] args){
		try
		{
			Employee e1 = new Employee("Tinku",40000);
			System.out.println("e1 created successfully");
			Employee e2 = new Employee("chintu",-30000);
			System.out.println("e2 created successfully");
		}
		catch (SalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
