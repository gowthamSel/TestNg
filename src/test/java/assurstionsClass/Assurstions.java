package assurstionsClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import com.google.common.base.Verify;

public class Assurstions {
@Test
	public static void assurt() {
		
			int a =22;
			int b =30;
			int c =44;
			int k =10/10 ;
			
			int d =55;
			int e =66;
			int f=77;
			int g =(e)/33 ;
			System.out.println(g);
							
		Assert.assertEquals(k,1,"the value is matched"  );
		}
	
	@Test
	public static void assur() {
		SoftAssert soft =new SoftAssert();
			int a =22;
			int b =30;
			int c =44;
			int k =10/10 ;
						
			int d =55;
			int e =66;
			int f=77;
			int g =(e)/33 ;
			System.out.println(g);
			
		soft.assertEquals(k,2,"the value is matched ");
			
		}
	@Test
	public static void assu() {
		SoftAssert soft =new SoftAssert();
			int a =22;
			int b =30;
			int c =44;
			int k =10/10 ;
			int d =55;
			int e =66;
			int f=77;
			int g =(e)/33 ;
			System.out.println(g);
			
		soft.assertEquals(k,2,"the value is matched ");
		soft.assertAll();
			
		
		}
}

