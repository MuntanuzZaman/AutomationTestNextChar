package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException  {
		// HomepageTesting
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.nexchar.com/");
	
		
		//Pricing tab
		driver.findElement(By.linkText("Pricing")).click();
		Thread.sleep(2000);
		
		//Demo tab
		driver.findElement(By.linkText("Demo")).click();
		Thread.sleep(2000);
		
		//Contact tab
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		
		//Logo HomePage
		driver.findElement(By.className("navbar-brand-image")).click();
		Thread.sleep(2000);
		
		//signin tab
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		//signup button
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Signup now button
		driver.findElement(By.xpath("//a[contains(text(),'Sign up now')]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//google play button
		driver.findElement(By.cssSelector("img[src='/images/google-play-badge.png']")).click();
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//try free button
		driver.findElement(By.xpath("//a[contains(text(),'free')]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//privacy policy
		driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
		Thread.sleep(2000);
		
		//terms of use
		driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]")).click();
		Thread.sleep(2000);
		
		//contact us
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(2000);
		
		//nextchar
		driver.findElement(By.xpath("//a[contains(text(),'Nexchar')]")).click();
		Thread.sleep(2000);
		
	}

}
