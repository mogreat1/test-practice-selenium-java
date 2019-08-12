package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void softAssertTest() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		sa.assertEquals(2, 2);
		sa.assertAll();
	}

}
