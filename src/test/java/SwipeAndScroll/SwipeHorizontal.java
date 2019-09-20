package SwipeAndScroll;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeHorizontal {
	static AndroidDriver<MobileElement> driver;
	static DesiredCapabilities cap;
	public static void swipehorizontal() throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();

		// getting y location --height = y-axis
		int startY = height / 2;

		int startX = (int) (width * 0.80);

		int endX = (int) (width * 0.20);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(endX, startY)).release().perform();
		Thread.sleep(3000);
	}
	public static void swipehorizontalreverse() throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();

		// getting y location --height = y-axis
		int startY = height / 2;

		int startX = (int) (width * 0.20);

		int endX = (int) (width * 0.80);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(endX, startY)).release().perform();
		Thread.sleep(3000);
	}

	public static void screenShot() throws IOException {
		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src\\test\\resources\\screenshotmobile\\Screenshot.jpg"));

	}
	public static void main(String[] args) throws InterruptedException, IOException {
		
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.contacts.DialtactsActivityAlias");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
		
		swipehorizontal();
		Thread.sleep(2000);
		screenShot();
		Thread.sleep(2000);
		swipehorizontal();
		Thread.sleep(2000);
		screenShot();
		Thread.sleep(2000);
		swipehorizontalreverse();
		Thread.sleep(2000);
		screenShot();
		Thread.sleep(2000);
		swipehorizontalreverse();
	//	screenShot();
		Thread.sleep(2000);


	}

}
