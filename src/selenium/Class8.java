package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		
		WebElement ps=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		ps.sendKeys("admin123");
		
		WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		System.out.println(log.isDisplayed());
		System.out.println(log.isEnabled());
		boolean a=log.isDisplayed();
		if(a==true)
		{
			log.click();
		}
		Thread.sleep(2000);
		WebElement myinfo=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
		myinfo.click();
		Thread.sleep(2000);
		WebElement male=driver.findElement(By.xpath("//label[normalize-space()='Male']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']"));
          System.out.println(male.isSelected());
          boolean b=male.isSelected();
          if(b==false)
          {
        	  male.click();
          }
	}

}
