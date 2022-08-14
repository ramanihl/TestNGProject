package selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test(priority = 1 , groups = "smoke") //create new user  // use priority and dependancy to run code in order
  public void createUser() {
	  System.out.println("I am in home test");
	  System.out.println("createUser Before assertion");
	  Assert.assertTrue(4>3, "Verifying element");  // we use regular assert in industry
	  System.out.println("createUser after assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test (priority = 2, dependsOnMethods = "createUser")// edit user  
  public void editUser() {
	  System.out.println("edit user Before assertion");
	  softAssert.assertTrue(2>3, "Verifying element");  
	  System.out.println("edit user after assertion");
	  softAssert.assertAll(); // similar to error collector in Junit
  }
  
  @Test (priority = 3, dependsOnMethods = "editUser")// delete user
  public void deleteUser() {
	  System.out.println("I am in end test");
	  System.out.println("deleteUser Before assertion");
	  softAssert.assertTrue(2>3, "Verifying element");  
	  System.out.println("deleteUser after assertion");
	  softAssert.assertEquals("abc", "abc");
	  System.out.println("deleteUser after secound assertion");
	  softAssert.assertAll(); 
  }
  
}
