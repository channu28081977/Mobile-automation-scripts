package WebAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.windows.PressesKeyCode;

public class KeypadFunctions {
public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("startUserRegistrationCD").click();
		Thread.sleep(2000);
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("channu");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_SPACE);
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("salgar");
		Thread.sleep(2000);
		
//		AndroidTouchAction act = new AndroidTouchAction(driver);
//		act.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(2000))).moveTo(PointOption.point(xOffset, yOffset))
	    //Check if the keyboard is displayed.
		boolean stat = driver.isKeyboardShown();	
		WebElement ele = driver.findElementById("");
		TapOptions tap = new TapOptions();
		tap.withTapsCount(2).withElement(ElementOption.element(ele));
		TouchAction act = new TouchAction(driver);
	//	act.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofMillis(2000)).withElement(ElementOption.element(element))
		driver.pressKey(new KeyEvent(AndroidKey.SEARCH));
		
		
	}

}
