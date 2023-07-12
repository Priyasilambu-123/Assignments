package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/");
//WebElement eleusername=driver.findElement(By.id("username"));
//eleusername.sendKeys("hari.radhakrishnan@qeagle.com");


driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

//WebElement elepassword=driver.findElement(By.id("password"));
//elepassword.sendKeys("Leaf@1234");

driver.findElement(By.id("password")).sendKeys("Leaf@1234");
driver.findElement(By.id("Login")).click();

	}

}
