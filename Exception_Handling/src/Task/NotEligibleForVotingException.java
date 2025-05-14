package Task;

public class NotEligibleForVotingException extends RuntimeException{
	
	public String getMesage()
	{
		return "Not Eligible";
	}
}
