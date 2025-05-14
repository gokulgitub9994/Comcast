package Task;

public class JavaProgram {
	public static void execution()
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int age;
		System.out.println("Enter age");
		age=scan.nextInt();
		scan.close();
		 if(age<18)
		 {
			 
			 try
			 {
				 throw new NotEligibleForVotingException();
			 }
			 catch(NotEligibleForVotingException e)
			 {
				 System.out.println("Not Eligible Go away");
			 }
		 }
		 else
		 {
			 
			 try
			 {
				 throw new EligibleForVotingException();
			 }
			 catch(EligibleForVotingException e)
			 {
				 System.out.println("Please vote and go");
			 }
		 }
	}
}
