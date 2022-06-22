package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
public static WebDriver openBrowser(String url) {//here webdriver is return type
	System.setProperty("webdriver.chrome.driver","C:\\oracle my\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//webdriver ki sari method driver is variable
	driver.get(url);//method of webdriver interface
	driver.manage().window().maximize();
	return driver;
}

}

