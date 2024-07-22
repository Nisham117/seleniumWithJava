package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String parentW= driver.getWindowHandle();
		//System.out.println(parentW);
		
	WebElement insta=driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
	insta.click();
	Set<String> allWindow=driver.getWindowHandles();
	//System.out.println(allWindow);
	for(String win:allWindow) {
		if(!(parentW.equals(win))) {
			driver.switchTo().window(win);
		}
		
	}
	
	 Thread.sleep(5000);
       WebElement insta1=driver.findElement(By.xpath("//input[@name='username']"));
	 insta1.sendKeys("45839292");
		
		
		
		
		

	}

}
