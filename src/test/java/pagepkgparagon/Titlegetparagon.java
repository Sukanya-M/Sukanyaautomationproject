package pagepkgparagon;

import org.openqa.selenium.WebDriver;

public class Titlegetparagon {
	WebDriver driver;
	public  Titlegetparagon (WebDriver driver)
	{
		this.driver=driver;
	}

	public void getTitle1()
	{
		String Exp="Paragon";
		String act=driver.getTitle();
		System.out.println(act);
		if(Exp.equals(act))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
}
}
