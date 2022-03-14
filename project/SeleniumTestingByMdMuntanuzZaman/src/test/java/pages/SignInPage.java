package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//url visit
		driver.get("https://www.nexchar.com/");
		
		//signin page
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		//forgot passworf link
		driver.findElement(By.xpath("//a[normalize-space()='I forgot password']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//signup link
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//email textbox
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		Thread.sleep(2000);
		
		//password textbox
		driver.findElement(By.name("Password")).sendKeys("12345");
		Thread.sleep(2000);
		
		//show password button
		driver.findElement(By.id("show-password")).click();
		Thread.sleep(2000);
		
		//remember me checkbox
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(2000);
		
		//submit button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		
	}
}
