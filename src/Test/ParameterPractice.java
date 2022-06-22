package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice {
@Test
public void GoToHome() {
	System.out.println("Home page opened");
}
@Test
@Parameters
public void HomepageTest(String c) {
	System.out.println(c);
}
@Test
@Parameters({"a","b"})
public void add(int a, int b) {
	System.out.println(a-b);
}

}
