package Practice_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 driver.findElement(By.id("email")).sendKeys("9561621876");
		 driver.findElement(By.id("pass")).sendKeys("9561621876");
		 driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		 
		 System.out.println("Welcome to the git world");
		 System.out.println("Sameer Pathan: SDET Engineer");
		 System.out.println("Learn how to generate th PR to review from TL");
		 

	}

}

