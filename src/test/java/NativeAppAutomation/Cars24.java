package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Cars24 {
	AndroidDriver<MobileElement> driver;
	@Test
	public void setUpAndroidDriver() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability("noReset", true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.cars24.seller");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.cars24.seller.MainActivity");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("cars24 app launched");
		
		driver.findElementByXPath("//android.widget.TextView[@text='SELL MY CAR']").click();
		Thread.sleep(2000);
}
	@Test(priority=1)
	public void handlingDropDown() throws InterruptedException {
		
		MobileElement drop = driver.findElementByXPath("//android.widget.TextView[@text='Search Car Brand']");
		
		drop.click();
		
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("Page scrolling down ");
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = height/2;
		int starty1 = (int)(height * 0.80);
		int endy1 = (int)(height * 0.20);

		TouchAction scrollto = new TouchAction(driver);
//		scrollto.longPress(x,starty1).moveTo(0, endy1).release();
//		scrollto.perform();
		scrollto.press(PointOption.point(x, starty1)).moveTo(PointOption.point(0, endy1)).release();
		scrollto.perform();
		Thread.sleep(5000);
		
	//	driver.findElementByXPath("//android.widget.TextView[@text='DAEWOO']").click();
	//	driver.findElement(MobileBy.AndroidUIAutomator(""));
	}
	
		
	}
