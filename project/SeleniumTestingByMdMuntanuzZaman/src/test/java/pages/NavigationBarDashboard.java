package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationBarDashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//url visit
		driver.get("https://www.nexchar.com/");
				
		//signin page
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		//email textbox
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		Thread.sleep(2000);
				
		//password textbox
		driver.findElement(By.name("Password")).sendKeys("12345");
		Thread.sleep(2000);
		
		//submit button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Item')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Purchase')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Outlet')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Suppliers')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Brands')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'DisplayGroups')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/admin/sales/list']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Cash Flow']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='CashIn']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Expense']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/admin/Customer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Staff')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@href,'/admin/report')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
		Thread.sleep(1000);
		
		

	}

}
