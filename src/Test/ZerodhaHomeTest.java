package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ZerodhaHomeTest {
@DataProvider (name="NameData")
public Object[][] data(){
return new Object[][] {{"Velocity,Katraj"},{"Velocity,Pune"}};
}

@Test(dataProvider = "NameData")
public void GoToHomePageTest(String value,String pass) {
	System.out.println(value + pass);
}
@Test
@Parameters({"c"})
public void HomePageTest(String c) {
	System.out.println(c);
	}
@Test
@Parameters({"a","b"})
public void add(int a,int b) {
	System.out.println(a+b);
}
@Test
public void newtest() {
	System.out.println("new test added by Mahendra");
}
}
