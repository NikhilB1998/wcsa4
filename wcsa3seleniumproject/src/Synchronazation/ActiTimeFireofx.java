package Synchronazation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeFireofx {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
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
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}
}
