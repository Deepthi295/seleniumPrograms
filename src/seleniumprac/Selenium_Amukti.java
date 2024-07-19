package seleniumprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Amukti {

	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium_Amukti a1 = new Selenium_Amukti();
		a1.setUp();
		a1.Account_Create();
         a1.close();
	}

	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amukti.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	public void Account_Create() {
		driver.findElement(By.linkText("Account")).click();
		driver.findElement(By.id("customer-email")).sendKeys("deepthireddy2@gmail.com");
		driver.findElement(By.id("customer-password")).sendKeys("Nithya1");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
//driver.findElement(By.xpath("//input[@value='Sign In']")).click();  ///it has capture code
        driver.findElement(By.id("first-name")).sendKeys("Deepthi");
        driver.findElement(By.id("last-name")).sendKeys("padige");
        driver.findElement(By.name("customer[email]")).sendKeys("deepthireddy123@gmail.com");
        
	}
	public void close() {
		//driver.close();
	}

}
