package basepkgparagon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void preCondition()
	{
	driver=new ChromeDriver();
	driver.get("https://paragonfootwear.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
}
