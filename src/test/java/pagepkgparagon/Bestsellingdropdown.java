package pagepkgparagon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Bestsellingdropdown {
WebDriver driver;
public Bestsellingdropdown(WebDriver driver)
{
	this.driver=driver;
}

public void bstslr() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement bst=driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div/nav/div[1]/div/div/popout-select/div/button/span[1]"));
	bst.click();
WebElement lth=driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div/nav/div[1]/div/div/popout-select/div/ul/li[5]/a/span"));
lth.click();
}
}
