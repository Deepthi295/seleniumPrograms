package seleniumprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Facebook {
	
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Selenium_Facebook f1 = new Selenium_Facebook();
       f1.setup();
       f1.createAccount();
       f1.closeDriver();
	}
	
	public void setup() {
		driver = new ChromeDriver();
		driver .get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	public void createAccount () {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("deepthi");
		driver.findElement(By.name("lastname")).sendKeys("padige");
        new Select(driver.findElement(By.id("day"))).selectByIndex(9);		
//		new Select(driver.findElement(By.id("day"))).selectByValue("9");
//		new Select(driver.findElement(By.id("day"))).selectByVisibleText("23");
		new Select(driver.findElement(By.id("month"))).selectByValue("2");
    	new Select(driver.findElement(By.id("year"))).selectByValue("1995");
		driver.findElement(By.name("reg_email__")).sendKeys("deepthipadieg@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("deepthipadieg@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("deepthi@123");
        driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
	public void closeDriver() {
		driver.quit();
	} 
	
	
}



