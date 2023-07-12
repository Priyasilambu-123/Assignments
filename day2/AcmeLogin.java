package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32");
WebDriver driver=new ChromeDriver();
driver.get("https://acme-test.uipath.com/login");
driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.id("password")).sendKeys("leaf@12");
driver.findElement(By.linkText("Login")).click();
driver.manage().window().maximize();
driver.getTitle().contains("https://acme-test.uipath.com/home");
driver.findElement(By.linkText("Log Out"));
driver.close();


	}

}
