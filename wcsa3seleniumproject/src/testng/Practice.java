package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
  @Test
  public void g() {
	  Reporter.log("g",true);
  }
  
  @Test (priority =2)
  public void p() {
	  Reporter.log("p",true);
}
  @Test (priority=3)
  public void z() {
	  Reporter.log("z",true);
  }
  @Test(priority=0)
  public void h() {
	  Reporter.log("h",true);
  }
  @Test(priority=1)
  public void b() {
	  Reporter.log("b",true);
  }
}