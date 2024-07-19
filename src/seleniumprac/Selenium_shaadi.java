package seleniumprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_shaadi {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Selenium_shaadi s1 = new Selenium_shaadi();
		s1.setup();
		s1.Login_SetUp();
		s1.quitdriver();
		

	}

	public void setup() {
		driver = new ChromeDriver();
        driver.get("https://www.shaadi.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        

        }
	public void Login_SetUp() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div[text()=\"Woman\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Man\"]")).click();
		//driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div/div/div/div[text()='22']")).click();
		Thread.sleep(2000);
      
		//driver.findElement(By.xpath("//div[text()='21']")).click();
        driver.findElement(By.xpath("//div[text()='to']/following-sibling::div//div[text()='28']")).click();
	   	driver.findElement(By.xpath("//div[text()='21']")).click();
        driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div//div[contains(@class,'is-selected')]")).click();
        driver.findElement(By.xpath("//div[text()='Hindu']")).click() ;
        driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div/div/div[text()='Select']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div [text()='Frequently Used']/following-sibling::div[text()='Hindi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]")).click();
	
			}

	public void quitdriver() {
		//driver.quit();
		

	}
	

}
