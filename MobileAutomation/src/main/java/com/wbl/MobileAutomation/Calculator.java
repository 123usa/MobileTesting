


package com.wbl.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class Calculator{
WebDriver driver;
@BeforeClass
public void setup() throws MalformedURLException
{
	DesiredCapabilities capabilities= new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME","ANDROID");
	
    capabilities.setCapability("VERSION","7.0");
    

capabilities.setCapability("deviceName","Emulator");
capabilities.setCapability("platformName","Android");

capabilities.setCapability("appPackage","com.android.calculator2");

capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);



}




///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.GridLayout[1]/android.widget.Button[8]




@Test
public void testcal() throws Exception
{
	
WebElement two=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
;

		



two.click();
WebElement plus=driver.findElement(By.name("+"));
plus.click();
WebElement four=driver.findElement(By.name("4"));
four.click();
WebElement equalTo=driver.findElement(By.name("="));
equalTo.click();
WebElement results=driver.findElement(By.tagName("EditText"));
assert results.getText().equals("6"):"Actual value is :"+results.getText()+"did not match with expected value : 6";
}

@AfterClass
public void tearDown()
 {
	  driver.quit();
 }
}


	
	
























