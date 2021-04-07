package code1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_assert {
	@Test 
	public void m1() {
	String exp="abcd";
	String act="xyz";
	
	Assert.assertNotEquals(exp, act);
	
	}

}
