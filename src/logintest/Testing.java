package logintest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Base;
import loginpage.Page;

public class Testing extends Base {
	
	@Test
	public void test1() throws InterruptedException {
		Page l=new Page(d);
		Thread.sleep(3000);
		
		l.passvalues("sanegamer007@gmail.com","saneshvkkky");
		l.buttonclick();
		Thread.sleep(3000);
		l.homepage();
		Thread.sleep(3000);
		l.imageclick();
		Thread.sleep(2000);
		l.more();
		Thread.sleep(3000);
		l.download();
	}
	

	}


