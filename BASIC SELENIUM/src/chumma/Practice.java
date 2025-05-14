package chumma;

public class Practice {

	int studentId;
	String studName;
	String city;
	
	
	
	public Practice(int studentId) {
		this.studentId = studentId;
	}
	
	

	public Practice(int studentId, String studName) {
		this(studentId);
		this.studName = studName;
	}
	
	public Practice(int studentId, String studName, String city){
		this(studentId,studName);
		this.city = city;	
	}
	
	public void studentDetails() {
		System.out.println("Student Id is :"+studentId);
		System.out.println("Student name is :"+studName);
		System.out.println("student city is :"+city);
	}
	
	
}
