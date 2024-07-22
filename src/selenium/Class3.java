package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://uncodemy.com/");
		
		Thread.sleep(1000);
		WebElement ct=driver.findElement(By.xpath("//span[@id=\"categoriesBtn\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(ct).perform();
		
		Thread.sleep(1000);
		WebElement st=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		a.moveToElement(st).perform();
		
		Thread.sleep(1000);
		WebElement mt=driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
		mt.click();
		
	}

}
