package seleniumprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
//         driver.findElement(By.id("email")).sendKeys("deepthi123.com");
//	       driver.findElement(By.name("pass")).sendKeys("deepthi123");
//	       driver.findElement(By.name("login")).click();

		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("padige");
		driver.findElement(By.name("lastname")).sendKeys("deepth");
//      driver.findElement(By.name("birthday_day")).sendKeys("09");
//      driver.findElement(By.name("birthday_month")).sendKeys("feb");
//		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		driver.findElement(By.name("reg_email__")).sendKeys("deeptpadige@gmail.com");
}

}
