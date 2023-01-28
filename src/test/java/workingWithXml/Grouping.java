package workingWithXml;

import org.testng.annotations.Test;

public class Grouping {


@Test(groups = "1")
	public static  void metho_9() {
		System.out.println("i am in test-case method-9");
	}	

	@Test(groups = "2")
	public static  void metho_10() {
		System.out.println("i am in test-case metho_10");
	}	


	@Test(groups = "1")
	public static  void metho_11() {
		System.out.println("i am in test-case metho_11");
	}	

	@Test(groups = "1")
	public static  void metho_12() {
		System.out.println("i am in test-case method-12");
	}
	
	
}
