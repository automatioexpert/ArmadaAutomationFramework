package rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void t2() {
		int num = 5;
		if (num == num-1 ||num == num || num == num+1) {
			System.out.println("Test is Pass with: "+num);
		}
		
		else {
			Assert.fail("DB Validation test failed");
		}

	}

}
