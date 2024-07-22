package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=headers");
		
		Thread.sleep(1000);
		WebElement con=driver.findElement(By.xpath("//select[@id='country']"));
		con.click();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement ts=driver.findElement(By.xpath("//option[@value='186']"));
		//js.executeScript("arguments[0].scrollIntoView(false)",ts );
		Thread.sleep(2000);
		ts.click();
		

	}

}
