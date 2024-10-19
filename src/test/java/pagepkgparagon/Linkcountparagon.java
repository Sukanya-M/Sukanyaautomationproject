package pagepkgparagon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkcountparagon {
	WebDriver driver;
	public Linkcountparagon (WebDriver driver)
	{
		this.driver=driver;
	}
	public void linkcount()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("no:of links="+li.size());
	}
}
