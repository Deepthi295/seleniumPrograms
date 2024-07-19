package seleniumprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Outlook {

	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium_Outlook o1 = new Selenium_Outlook();
		o1.set_up();
		o1.create_Account();
		o1.close_driver();
	}

	public void set_up() {
		driver = new ChromeDriver();
		driver.get(
				"https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=152&ct=1717564403&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26culture%3den-us%26country%3dus%26RpsCsrfState%3dbd198138-e449-9290-4e46-52ae7388d239&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	public void create_Account() {
		driver.findElement(By.xpath("//span[text()='Create one!']")).click();
		driver.findElement(By.xpath("//input[@name='MemberName']")).sendKeys("deepthireddy23232@outlook.com");
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.id("PasswordInput")).sendKeys("Nithya1@");
		driver.findElement(By.id("ShowHidePasswordLabel")).click();
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Padige");
		driver.findElement(By.id("LastName")).sendKeys("poreddy");
		driver.findElement(By.id("iSignupAction")).click();
		new Select(driver.findElement(By.xpath("//select[@id='Country']"))).selectByValue("IN");
		new Select(driver.findElement(By.xpath("//select[@id='BirthMonth']"))).selectByValue("6");
		new Select(driver.findElement(By.xpath("//select[@id='BirthDay']"))).selectByValue("8");
		driver.findElement(By.id("BirthYear")).sendKeys("2000");
		driver.findElement(By.id("iSignupAction")).click();
		String value = driver.findElement(By.xpath("//div[text()='deepthireddy23232@outlook.com']")).getText();
		if (value.contains("deepthireddy23232")) {
			System.out.println("test passed successfully");

		} else {
			System.out.println("Test failed account not created");
		}
	}
        public void close_driver() {
		driver.close();
	}
}
