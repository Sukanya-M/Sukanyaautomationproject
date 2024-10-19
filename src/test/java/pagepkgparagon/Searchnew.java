package pagepkgparagon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchnew {
WebDriver driver;
 public Searchnew(WebDriver driver)
 {
	 this.driver=driver;
 }
 public void searchey() throws InterruptedException
 {
	 Thread.sleep(2000);
	 WebElement sear=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21807406154005__header\"]/div[1]/header/div[2]/div/div[2]/div[3]/div/div[1]/a/span"));
	 sear.click();
	 WebElement pass=driver.findElement(By.xpath("//*[@id=\"search-popdown\"]/predictive-search/form/div[2]/div/div/div[1]/input"));
	 pass.sendKeys("men");
	 WebElement clicksearch=driver.findElement(By.xpath("//*[@id=\"shopify-section-template--21807414640917__main\"]/section/div[1]/main-search/form/div/span/div/button[2]"));
	 clicksearch.click();
	



}
}
