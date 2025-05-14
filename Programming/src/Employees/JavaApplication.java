package Employees;

import java.util.HashSet;

public class JavaApplication {
	public static void execution()
	{
		Employee e1=new Employee("kalai","kalai@gmail.com",9952823722l,984342093177l,"IYLPK8214H",99999863131l,635112);
		Employee e2=new Employee("kalai1","1kalai@gmail.com",9852823722l,884342093177l,"IYkPK8214H",98999863131l,635102);
		Employee e3=new Employee("kalai2","2kalai@gmail.com",8952823722l,784342093177l,"AYLPK8214H",89999863131l,635122);
		Employee e4=new Employee("kalai3","3kalai@gmail.com",7952823722l,684342093177l,"BYLPK8214H",79999863131l,635132);
		Employee e5=new Employee("kalai4","4kalai@gmail.com",952823722l,954342093177l,"ICLPK8214H",96999863131l,635114);
		Employee e6=new Employee("kalai5","5kalai@gmail.com",9932823722l,484342093177l,"DYLPK8214H",59999863131l,635152);
		Employee e7=new Employee("kalai6","6kalai@gmail.com",9912823722l,384342093177l,"EYLPK8214H",49999863131l,635162);
		Employee e8=new Employee("kalai7","7kalai@gmail.com",9922823722l,284342093177l,"FYLPK8214H",39999863131l,635172);
		Employee e9=new Employee("kalai8","8kalai@gmail.com",9952723722l,184342093177l,"HYLPK8214H",29999863131l,635192);
		Employee e10=new Employee("kalai9","9kalai@gmail.com",9952803722l,980342093177l,"HYLPK8214H",19999863131l,635012);
		HashSet<Employee> al=new HashSet<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		al.add(e8);
		al.add(e9);
		al.add(e10);
		HashSet<String> name=new HashSet<String>();
		HashSet<String> mailId=new HashSet<String>();
		HashSet<Long> C_num=new HashSet<Long>();
		HashSet<Long> aadhar=new HashSet<Long>();
		HashSet<String> pan=new HashSet<String>();
		HashSet<Long> uan=new HashSet<Long>();
		HashSet<Integer> pincode=new HashSet<Integer>();
		for(Employee e:al)
		{
			name.add(e.getname());
			mailId.add(e.getmailId());
			C_num.add(e.getnum());
			aadhar.add(e.getaadhar());
			pan.add(e.getpan());
			uan.add(e.getuan());
			pincode.add(e.getpincode());
		}
		System.out.println(name);
		System.out.println(mailId);
		System.out.println(C_num);
		System.out.println(aadhar);
		System.out.println(pan);
		System.out.println(uan);
		System.out.println(pincode);
	}

}
