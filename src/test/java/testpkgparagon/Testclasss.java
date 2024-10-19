package testpkgparagon;

import org.testng.annotations.Test;

import basepkgparagon.Baseclass;
import pagepkgparagon.Addtocartparagon;
import pagepkgparagon.Bestsellingdropdown;
import pagepkgparagon.Linkcountparagon;
import pagepkgparagon.Myaccountparagon;
import pagepkgparagon.Searchnew;
import pagepkgparagon.Titlegetparagon;
import pagepkgparagon.Verifylogo;

public class Testclasss extends Baseclass {
	@Test(priority=1)
	public void myaccn() throws InterruptedException
	{
		Myaccountparagon mypr=new Myaccountparagon(driver);
		mypr.myacc();		
	}
	@Test(priority=2)
	public void searchnew() throws InterruptedException
	{
		Searchnew snew=new Searchnew(driver);
		snew.searchey();
		
	}
	@Test(priority=4)
	public void dropdown() throws InterruptedException
	{
	Bestsellingdropdown bst=new Bestsellingdropdown(driver);
	bst.bstslr();
	}
	@Test(priority=3)
	public void addtocart() throws InterruptedException
	{
		Addtocartparagon addcrt=new Addtocartparagon(driver);
				addcrt.addcart();
	}
	@Test(priority=5)
	public void verifylogoes() throws InterruptedException
	{
	Verifylogo vl=new Verifylogo(driver);
	vl.verifylogo();		
	}
	@Test(priority=6)
	public void countlink()
	{
		Linkcountparagon lcp=new Linkcountparagon(driver);
		lcp.linkcount();
	}
	@Test(priority=7)
	public void gettitle()
	{
		Titlegetparagon tit=new Titlegetparagon(driver);
		tit.getTitle1();		
			
				
	}
}
