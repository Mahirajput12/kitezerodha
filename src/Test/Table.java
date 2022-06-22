package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;

import POJO.Browser2;

public class Table {

public static void main(String[] args)
	{
		WebDriver driver = Browser2.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr"));
		 int columnsize = column.size();
		 System.out.println(columnsize);
		 List<WebElement> currentPrice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		 double Highest = 0;
		 for(int i =0; i<currentPrice.size();i++)
		 {
			 WebElement price = currentPrice.get(i) ;
			 String currentPriceValue = price.getText();
			 System.out.println(currentPriceValue);
			 Double cpv =Double.parseDouble(currentPriceValue);
			 if (Highest < cpv)
			 {
				 Highest = cpv;
			 } 
		 }
 
		 System.out.println("Highest price = " + Highest);
		 
		 WebElement price = currentPrice.get(0);
		 String a = price.getText();
		 Double cpv =Double.parseDouble(a);
		 double lowest = cpv;
		 for(int i =0; i<currentPrice.size();i++)
		 {
			 WebElement price1 = currentPrice.get(i) ;
			 String currentPriceValue = price1.getText();
			 System.out.println(currentPriceValue);
			 Double cpv1 =Double.parseDouble(currentPriceValue);
			 if (lowest > cpv1)
			 {
				 lowest = cpv1;
			 } 
		 }
 
		 System.out.println("lowest price = " + lowest);	
	}

}