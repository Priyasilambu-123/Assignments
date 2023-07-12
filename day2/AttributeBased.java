package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com//opentaps");
		driver.manage().window().maximize();
		WebElement eleusername=driver.findElement(By.xpath("//input[@id='username']"));
		eleusername.sendKeys("demosalesmanager");		
//driver.findElement(By.xpath("//input[@id='username']")).sendkeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");		
	}

}
