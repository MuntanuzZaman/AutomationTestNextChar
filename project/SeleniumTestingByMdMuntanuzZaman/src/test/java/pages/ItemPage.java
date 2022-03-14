package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ItemPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//url visit
		driver.get("https://www.nexchar.com/");
				
		//signin page
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		
		//email textbox
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		Thread.sleep(1000);
				
		//password textbox
		driver.findElement(By.name("Password")).sendKeys("12345");
		Thread.sleep(1000);
		
		//submit button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Item')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("txtSearch")).sendKeys("Anniversary");
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='btnEdit btn-link btn-sm'][normalize-space()='Purchase'])[1]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("SupplierName")).click();
		driver.findElement(By.id("ui-id-2")).click();
		
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.id("Quantity")).sendKeys("10");
		Thread.sleep(1000);
		
		driver.findElement(By.id("UnitPrice")).sendKeys("10");
		Thread.sleep(1000);
		
		driver.findElement(By.id("AmountPaid")).sendKeys("50");
		Thread.sleep(1000);
		
		Select op= new Select(driver.findElement(By.id("PaymentMethod")));
		
		op.selectByVisibleText("Cheque");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Item')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("editor")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='Bold']//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("editor")).sendKeys("ggg");
		Thread.sleep(1000);
		
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		
	}

}
