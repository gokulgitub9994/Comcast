package Students;

import java.util.Objects;

class Student {
	private String name;
	private String mailId;
	private long num;

	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setmailId(String mailId) {
		this.mailId=mailId;
	}
	public String getmailId() {
		return mailId;
	}
	public void setnum(long num) {
		this.num=num;
	}
	public long getnum() {
		return num;
	}
	public String toString()
	{
		return name+" "+ mailId+" " + num;
	}
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		if((s.name==this.name)&&(s.mailId==this.mailId)&&(s.num==this.num))
		{
			return true;
		}
		else {
		return false;
		}
	}
	public int hashCode()
	{
		return Objects.hash(name,mailId,num);
	}
}
