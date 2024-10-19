package pagepkgparagon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verifylogo {
	WebDriver driver;
	 public Verifylogo (WebDriver driver)
	 {
		 this.driver=driver;
	 }

	public void verifylogo() throws InterruptedException 
	{
		Thread.sleep(2000);
		
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21807406154005__header\"]/div[1]/header/div[1]/div/div[1]/div[1]/div[1]/div/div/a[1]/img"));
	if(logo.isDisplayed())

	{
		System.out.println("Limeroad logo is displayed on the page");
	}
	else
	{
		System.out.println("Limeroad logo is not displayed on the page");
	}
	}
}
