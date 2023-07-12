package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lanch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MSP");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("silambu");
//		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("22/05/1991");
//		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Conference");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1500000");
		WebElement sourceid=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select se=new Select(sourceid);
		se.selectByIndex(4);
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("priyacompany");
	}

}
