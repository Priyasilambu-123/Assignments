package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chromedriver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32");
WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.name("firstname")).sendKeys("pinky");
driver.findElement(By.name("lastname")).sendKeys("s");
driver.findElement(By.name("reg_email__")).sendKeys("9856232588");
driver.findElement(By.id("password_step_input")).sendKeys("gkpinky");
//WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
WebElement dropdown = driver.findElement(By.id("day"));
Select seldropdown =new Select(dropdown);
seldropdown.selectByVisibleText("22");

WebElement dropdown1 = driver.findElement(By.id("month"));
Select seldropdown1 =new Select(dropdown1);
seldropdown1.selectByVisibleText("Jul");


WebElement dropdown2 = driver.findElement(By.id("year"));
Select seldropdown2 =new Select(dropdown2);
seldropdown2.selectByVisibleText("1991");

driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();;
}
}