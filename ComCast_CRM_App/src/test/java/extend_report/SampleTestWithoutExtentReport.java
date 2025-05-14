package extend_report;

import org.testng.annotations.Test;

public class SampleTestWithoutExtentReport {
	
	@Test
	public void createContactTest() {
		System.out.println("LogIn TO App");
		System.out.println("navigate to contact module");
		System.out.println("create contact");
		System.out.println("Logout from app");
		if("HDFC".equals("HDFC")) {
			System.out.println("Contact is Created");
		}else {
			System.out.println("Contact not is Created");
		}
	}

}
