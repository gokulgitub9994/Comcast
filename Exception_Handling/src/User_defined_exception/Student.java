package User_defined_exception;

public class Student {
	String name;
	String MailId;
	Long num;
	
	Student(String name,String MailId,long num)
	{
		this.name=name;
		this.MailId=MailId;
		this.num=num;
	}
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println(name);
		System.out.println(MailId);
		System.out.println(num);
	}
}
