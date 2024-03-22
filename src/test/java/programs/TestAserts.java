package programs;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAserts {
	@Test
	public void Program() {
		int a = 4;
		int b = 3;
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(a,b);
		System.out.println("hi");
	}
}
