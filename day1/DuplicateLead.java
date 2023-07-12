package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chromedriver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("msp");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mithu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("pinky");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computerscience");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("best company");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyamaithily2@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("work with peace");
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("pinkycompany");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mithupriya");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle().contains("Create Lead/opentaps CRM");

		// driver.close();

	}

}
