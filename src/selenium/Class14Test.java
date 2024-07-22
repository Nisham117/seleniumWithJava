package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class14Test {
	WebDriver driver= new ChromeDriver();
	String driverPath = "C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	void navigate() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void login(String user, String pass) throws InterruptedException {
		Thread.sleep(1000);
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys(user);
		
		WebElement ps=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		ps.sendKeys(pass);
	}
	
	void login() {
		//WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//log.click();
	}
}
