package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {

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
		log.click();
		
		Thread.sleep(2000);
		WebElement buzz=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		buzz.click();
		
		Thread.sleep(2000);
		WebElement post=driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		post.sendKeys("Nisha");
		
		WebElement postbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		postbutton.click();
		
	}

}
