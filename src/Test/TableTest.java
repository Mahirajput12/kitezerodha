package Test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser2;

public class TableTest {
public static void main(String[] args) {
WebDriver driver =Browser2.openBrowser("https://demo.guru99.com/test/web-table-element.php");

  List<WebElement> column =driver.findElements(By.xpath("//table//thead//tr//th"));
  int columnsize = column.size();
  System.out.println(columnsize);

  List<WebElement> row =driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
  int rowsize =row.size();
  System.out.println(rowsize);

  List<WebElement> currentprice=driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
double max =0;
//double min =0;
  for(int i=0;i<currentprice.size();i++)
     {WebElement price=currentprice.get(i);
      String currentpricevalue=price.getText();
double value =Double.parseDouble(currentpricevalue); //919.4,355.7,752.5,967.5
 if(value > max ) 
{
	 max =value;
}
System.out.println(max );



}
}
}
