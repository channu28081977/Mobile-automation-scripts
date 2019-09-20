package Qavalidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SeelndroidNativeAppAutomation {
	static DesiredCapabilities cap;
	static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".HomeScreenActivity");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		
//		driver.findElementByAccessibilityId("showPopupWindowButtonCD").click();
//		Thread.sleep(2000);
//		Alert simplealert = driver.switchTo().alert();
//		simplealert.dismiss();
//		Thread.sleep(2000);
	driver.findElementByAccessibilityId("startUserRegistrationCD").click();
		Thread.sleep(2000);
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("channu");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_SPACE);
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("salgar");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.DEL);
		Thread.sleep(2000);
//	
//	     //click on EN button
//	     driver.findElementByXPath("//android.widget.Button[@content-desc=\"buttonTestCD\"]").click();
//	     System.out.println(driver.findElementById("android:id/message").getText());
//	     driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]").click();
//	 
//	     //Click on display text view button and compare the text  displayed
//	     driver.findElementByXPath("//android.widget.Button[@content-desc=\"visibleButtonTestCD\"]").click();
//	     String text = driver.findElement(By.xpath("//*[@content-desc='visibleTestAreaCD']/android.widget.TextView")).getText();
//	     System.out.println(text);
//	     Assert.assertEquals(text, "Text is sometimes displayed");
	     
	     driver.quit();
	  }
}
