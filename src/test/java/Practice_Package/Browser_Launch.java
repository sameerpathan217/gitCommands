package Practice_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		WebDriver driver;
  //  System.setProperty("webdriver.chrome.driver","D:\\Training\\TestAutomation\\GitCommands\\Browser\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
	}

}
