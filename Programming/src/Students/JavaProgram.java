package Students;

import java.util.ArrayList;

public interface JavaProgram {
	public static void execution()
	{
		Student s1=new Student();
		s1.setname("kalai");
		System.out.println(s1.getname());
		s1.setmailId("kalai@gmail.com");
		System.out.println(s1.getmailId());
		s1.setnum(9952823722l);
		System.out.println(s1.getnum());
		
		Student s2=new Student();
		s2.setname("kalai1");
		System.out.println(s2.getname());
		s2.setmailId("kalai@gmail.com");
		System.out.println(s2.getmailId());
		s2.setnum(9952823722l);
		System.out.println(s2.getnum());
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		ArrayList<Student> all=new ArrayList<Student>();
	    all.add(s2);
		System.out.println(al);
		al.remove(s1);
		System.out.println(al);
		System.out.println(all);
		System.out.println(al.equals(all));
		System.out.println(al.hashCode());
		System.out.println(all.hashCode());
	}
}
