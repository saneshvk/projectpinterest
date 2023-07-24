package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page {
	WebDriver d;
	By email=By.id("email");
	By password=By.name("password");
	By button=By.xpath("//*[@id=\"mweb-unauth-container\"]/div/div[3]/div/div/div[3]/form/div[7]/button");
	By searchfield=By.xpath("//*[@id=\"searchBoxContainer\"]/div/div/div[2]/input");
	By image=By.xpath("//img[@src='https://i.pinimg.com/236x/89/e3/9f/89e39f7142f79ffd51212336c212d632.jpg']");
	By moreoptions=By.xpath("//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/button/div");
	By downloadlink=By.xpath("//span[@title='Download image']");
	
	public Page(WebDriver d) {
		this.d=d;
		// TODO Auto-generated constructor stub
	}
	public  void passvalues(String emailid,String pass) {
		d.findElement(email).sendKeys(emailid);
		d.findElement(password).sendKeys(pass);				
	}
	


public void buttonclick() {
	d.findElement(button).click();;
}
public void homepage() {
//	d.navigate().to("https://in.pinterest.com/");
	WebElement text=d.findElement(searchfield);
	text.sendKeys("porsche");
	text.sendKeys(Keys.RETURN);
	
}
public void imageclick() {
	d.findElement(image).click();
}
public void more() {
	d.findElement(moreoptions).click();
}
public void download() {
	WebElement dwn=d.findElement(downloadlink);
	Actions move=new Actions(d);
	move.moveToElement(dwn);
	move.perform();
	dwn.click();
}
}
