package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPasswordPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//url visit
		driver.get("https://www.nexchar.com/");
		
		//signin page
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		//forgot password link
		driver.findElement(By.xpath("//a[normalize-space()='I forgot password']")).click();
		Thread.sleep(2000);
		
		//send me back link
		driver.findElement(By.xpath("//a[normalize-space()='send me back']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//email textbox
		driver.findElement(By.id("Email")).sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		
		//reset password button
		//driver.findElement(By.className("btn btn-primary w-100")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Reset password']")).click();
		Thread.sleep(2000);
		
		
		//send me back 
		driver.findElement(By.xpath("//a[normalize-space()='send me back']")).click();
	}

}
