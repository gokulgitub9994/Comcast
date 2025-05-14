package Task;

public class EligibleForVotingException extends RuntimeException {
	@Override
	public String getMessage()
	{
		return "Eligible";
	}
}
