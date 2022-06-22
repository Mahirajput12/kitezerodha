package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
@Test
public void LoginPage() {
	System.out.println("Login page opened");
}
@Test
public void UserName(String c) {
	System.out.println(c);
}
@Test
@Parameters({"a","b"}) 
public void add(int a,int b) {
	System.out.println(a+b);
}
}
