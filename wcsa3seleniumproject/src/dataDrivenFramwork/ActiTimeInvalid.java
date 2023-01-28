package dataDrivenFramwork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalid {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-qiqglar/login.do;jsessionid=107uj3t2taftr");
		
		Flib flib=new Flib();
		int rc=flib.r
		
	}

}
