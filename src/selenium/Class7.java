package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		
		WebElement ps=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		ps.sendKeys("admin123");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\Screenshot1.png");
		FileUtils.copyFile(src, dest);
		
		WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		log.click();
		Thread.sleep(2000);
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("D:\\Selenium\\Screenshot2.png");
		FileUtils.copyFile(src1, dest1);


	}

}
