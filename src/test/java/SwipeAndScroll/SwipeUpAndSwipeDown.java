package SwipeAndScroll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeUpAndSwipeDown {

	public static AndroidDriver<WebElement> driver;

	public static void swipedown() {

		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width / 2;
		int top_y = (int) (height * 0.90);
		int bottom_y = (int) (height * 0.10);
		System.out.println("coordinates :" + x + "  " + top_y + " " + bottom_y);
		new TouchAction(driver).press(PointOption.point(x, top_y))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(x, bottom_y))
				.release().perform();
	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.contacts.DialtactsActivityAlias");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		driver.findElementByXPath("//android.widget.TextView[@text='Contacts']").click();

		swipedown();
		Thread.sleep(2000);
		swipedown();
		Thread.sleep(2000);
		swipedown();
		Thread.sleep(2000);
		swipedown();
		Thread.sleep(2000);
		swipedown();
		Thread.sleep(2000);
		swipedown();
		Thread.sleep(2000);

	}
}
