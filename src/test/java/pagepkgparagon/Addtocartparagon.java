package pagepkgparagon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addtocartparagon {
WebDriver driver;
public  Addtocartparagon(WebDriver driver)
{
	this.driver=driver;
}
public void addcart() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div[2]/div[1]/nav/div/div[3]/a/span"));
	ele.click();
	
	WebElement cart=driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div/div[2]/div/div[2]/div[3]/product-grid-item/product-grid-item-variant/div/a/div[2]/product-grid-item-image[3]/div/img"));
	cart.click();
	
	WebElement add=driver.findElement(By.xpath("/html/body/main/div[1]/div/div[3]/div/div/div[2]/div/div[7]/div/div[1]/fieldset/legend"));
	add.click();
}
}
