package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		// url visit

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.nexchar.com/");
	
		//Signup page
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
		Thread.sleep(2000);
		
		//sign in link below
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//terms of use link 
		driver.findElement(By.xpath("//a[@target='_blank'][normalize-space()='Terms of Use']")).click();
		Thread.sleep(2000);
		
	
		
		//privacy policy link
		driver.findElement(By.xpath("//a[@href='/privacy/']")).click();
		Thread.sleep(2000);
		
		//switching to previous tab(parent window) from new tab(child window) by getting window handles(string values) and assigning them to a object
		//learned from tutorialspoint
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(0));
		Thread.sleep(2000);
		
		//customer name
		driver.findElement(By.id("Name")).sendKeys("Jurat");
		Thread.sleep(2000);
		
		//dropdown menu business type
		Select dd= new Select(driver.findElement(By.id("CategoryId")));
		
		dd.selectByVisibleText("Cafe and food truck");
		Thread.sleep(2000);
		
		//email address
		driver.findElement(By.id("Email")).sendKeys("Camden_Partridge2803@acrit.org");
		Thread.sleep(2000);
		
		//password
		driver.findElement(By.id("Password")).sendKeys("Jurat12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@for='Password']//*[name()='svg']")).click();
		Thread.sleep(2000);
		
		//checkbox
		driver.findElement(By.id("NotReceiveNewsLetter")).click();
		Thread.sleep(2000);
		
		//submit button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}

}
