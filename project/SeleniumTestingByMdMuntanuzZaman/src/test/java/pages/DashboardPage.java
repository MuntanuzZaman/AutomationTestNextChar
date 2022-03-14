package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardPage {

	public static void main(String[] args) throws InterruptedException {
		

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
		
		Select dds= new Select(driver.findElement(By.xpath("(//select[@id='ddlSales'])[1]")));
		dds.selectByValue("sales3");
		Thread.sleep(1000);
		
		Select ddcr= new Select(driver.findElement(By.xpath("(//select[@id='ddlSales'])[2]")));
		ddcr.selectByValue("c_return_7");
		Thread.sleep(1000);
		
		Select ddr= new Select(driver.findElement(By.xpath("(//select[@id='ddlSales'])[3]")));
		ddr.selectByValue("c_receivable_30");
		Thread.sleep(1000);
		
		Select ddcp= new Select(driver.findElement(By.xpath("//select[@default='customer_payable']")));
		ddcp.selectByValue("c_payable_3");
		Thread.sleep(1000);
		
		Select ddp= new Select(driver.findElement(By.xpath("//select[@default='purchase']")));
		ddp.selectByValue("purchase3");
		Thread.sleep(1000);
		
		Select ddsr= new Select(driver.findElement(By.xpath("//select[@default='supplier_return']")));
		ddsr.selectByValue("c_return_7");
		Thread.sleep(1000);
		
		Select ddpr= new Select(driver.findElement(By.xpath("//select[@default='supplier_receivable']")));
		ddpr.selectByValue("s_receivable_30");
		Thread.sleep(1000);
		
		Select ddsp= new Select(driver.findElement(By.xpath("//select[@default='supplier_payable']")));
		ddsp.selectByValue("s_payable_3");
		Thread.sleep(1000);
		
		Select dde= new Select(driver.findElement(By.xpath("//select[@default='expense']")));
		dde.selectByValue("expense7");
		Thread.sleep(1000);
		
		Select ddc= new Select(driver.findElement(By.xpath("//select[@default='cashins_return']")));
		ddc.selectByValue("cashin_30");
		Thread.sleep(1000);
		
		
	}

}
