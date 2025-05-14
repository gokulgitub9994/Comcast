package Employees;

public class Employee {
	String name;
	String mailId;
	long num;
	long aadhar;
	String pan;
	long uan;
	int pincode;
	Employee(String name,String mailId,long num,long aadhar,String pan,long uan,int pincode){
		this.name=name;
		this.mailId=mailId;
		this.num=num;
		this.aadhar=aadhar;
		this.pan=pan;
		this.uan=uan;
		this.pincode=pincode;
	}
	public String toString()
	{
		return name+" "+mailId+" "+num+" "+aadhar+" "+pan+" "+uan+" "+pincode;
	}
	public String getname()
	{
		return name;
	}
	public String getmailId()
	{
		return mailId;
	}
	public long getnum()
	{
		return num;
	}
	public long getaadhar()
	{
		return aadhar;
	}
	public long getuan()
	{
		return uan;
	}
	public String getpan()
	{
		return pan;
	}
	public int getpincode()
	{
		return pincode;
	}
}
