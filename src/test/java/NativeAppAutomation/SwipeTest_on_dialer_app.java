package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeTest_on_dialer_app {
	
	public static void SwipeScreen(WebElement el, WebDriver driver) throws InterruptedException {
		WebElement Panel = el;
		Dimension dimension = Panel.getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();

		// getting y location --height = y-axis
		int startY = height / 2;
		
		int startX = (int)(width * 0.80);
	
		int endX = (int)(width * 0.20);
		

//		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStartX, startY))
//				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
//				.moveTo(PointOption.point(scrollEndX, startY)).release().perform();

		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(endX, startY))
		.release().perform();
//		Thread.sleep(3000);
	}

	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.contacts.DialtactsActivityAlias");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);

		//
		WebElement Panel = driver.findElement(By.id("com.android.contacts:id/list"));
		

		// swipe twice
		SwipeScreen(Panel, driver);
		Thread.sleep(4000);
		SwipeScreen(Panel, driver);
		
		

		driver.quit();

	}

}
