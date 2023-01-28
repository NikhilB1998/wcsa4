package Synchronazation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-qiqglar/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	String actualLoginPageTitle = driver.getTitle();
	if(actualLoginPageTitle.equals("actiTime - Login")) {
		System.out.println("Login page title matched  Testcase is pass!");
	}
	else {
		System.out.println("Home page title not matched !Test Case fail");
	}
		
	
	
}
}
