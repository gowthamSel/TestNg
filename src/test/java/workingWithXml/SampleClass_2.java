package workingWithXml;

import org.testng.annotations.Test;

public class SampleClass_2 {


	@Test(groups = "2")
	public static  void metho_1() {
		System.out.println("i am in test-case method-1");
	}	

	@Test(groups = "1")
	public static  void metho_2() {
		System.out.println("i am in test-case method-2");
	}	


	@Test(groups = "2")
	public static  void metho_3() {
		System.out.println("i am in test-case method-3");
	}	

	@Test(groups = "1")
	public static  void metho_4() {
		System.out.println("i am in test-case method-4");
	}


}
