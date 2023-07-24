package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base{
	public WebDriver d;
	@BeforeClass
	public void setup() {
		d=new ChromeDriver();
		d.get("https://in.pinterest.com/login/");
		
		
	}
//	@AfterClass
//	public void teardown() {
//		d.quit();
//	}

}
