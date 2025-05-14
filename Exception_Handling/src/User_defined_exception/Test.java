package User_defined_exception;

public class Test {
	public static void verifier(Student student) throws ArithmeticException
	{
		if(student!=null)
		{
			student.display();
		}
		else
		{
			throw new StudentNotFoundException();
		}
	}
}
