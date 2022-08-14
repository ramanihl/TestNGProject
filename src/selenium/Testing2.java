package selenium;

import org.testng.annotations.Test;

public class Testing2 {
 
	@Test(groups = "smoke")
  public void test4() {
		System.out.println("test4");
  }
	
	@Test (groups = "sanity")
	  public void test5() {
			System.out.println("test5");
	  }
}
