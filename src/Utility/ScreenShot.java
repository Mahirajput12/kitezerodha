package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser2;

public class ScreenShot {
public static void main(String[]args) throws IOException {
	WebDriver driver = Browser2.openBrowser("https://www.amazon.in/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\MAHENDRA CLASS\\m\\mah.jpg");
	
	FileHandler.copy(source, destination);
}

}

