package pagepkgparagon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myaccountparagon {
WebDriver driver;
public Myaccountparagon(WebDriver driver)
{
this.driver=driver;	
}
public void myacc() throws InterruptedException
{
	Thread.sleep(2000);                      
	WebElement myac=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21807406154005__header\"]/div[1]/header/div[2]/div/div[2]/div[3]/div/div[2]/a/span"));
	myac.click();
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]"));
	email.sendKeys("sukanya@gmail.com");
	Thread.sleep(2000);
	WebElement password=driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]"));
	password.sendKeys("sukanya2809");
	Thread.sleep(2000);
	WebElement signin=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button"));
	signin.click();
}
}
