package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Drag_and_drop_demo {
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mobeta.android.demodslv");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mobeta.android.demodslv.Launcher");
		cap.setCapability("noReset", true);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		Thread.sleep(3000);
		
		if(driver.isDeviceLocked()) {
			driver.unlockDevice();
			System.out.println("success");
		}
		System.out.println("device is unlocked hurray!!!!");
		
	//	System.out.println(driver.getPageSource());
	//	driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(0).click();
		
		Thread.sleep(5000);
		
	//	xml code
	//	driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Basic')]")).click();
		
	//using uiautomator class
		String text = "Basic";
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\""+text+"\")" ).click();
		
	//dragable and droppable element
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.mobeta.android.demodslv:id/text")));
		
	//	System.out.println(driver.getPageSource());
//		MobileElement dragabble = driver.findElement(By.id("//android.widget.TextView[contains(@text,'Brad ')]/preceding-sibling::android.widget.ImageView"));
		MobileElement dragabble1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.ImageView"));
		
		MobileElement dropabble = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.ImageView"));
		
		TouchAction action = new TouchAction(driver);
		
		
		
		
//		MobileElement firstElement = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0);
//		
//		MobileElement secondElement = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(3);
//		
//		TouchAction action = new TouchAction(driver);
//		
		action.press(ElementOption.element(dragabble1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(ElementOption.element(dropabble)).release().perform();
		
//		Thread.sleep(3000);
//		
//	//	driver.quit();
//		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}

}
