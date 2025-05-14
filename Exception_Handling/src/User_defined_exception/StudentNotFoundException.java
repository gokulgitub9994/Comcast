package User_defined_exception;

public class StudentNotFoundException extends RuntimeException {

	@Override
	public String getMessage()
	{
		return "Student Not Found";
	}
}
