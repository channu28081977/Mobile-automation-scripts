package NativeAppAutomation;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class LaunchSelndroid {
public static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("noReset", true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
//		if(driver.isDeviceLocked()) {
//			driver.unlockDevice();
//			System.out.println("success");
//		}
		
		driver.findElementById("io.selendroid.testapp:id/startUserRegistration").click();
		Thread.sleep(2000);
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("channu");
		Thread.sleep(2000);
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx = width/2;
		int endx = width/2;
		int starty = (int) (height * 0.40);
		int endy = (int) (height * 0.10);
		
//		TouchAction action = new TouchAction(driver);
//		action.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy))
//		.perform().release();
		
//		Thread.sleep(3000);
		TouchAction action1 = new TouchAction(driver);
        action1.press(PointOption.point(startx, starty)) 
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
        .moveTo(PointOption.point(endx, endy)) 
        .release().perform();
		
        driver.findElementById("io.selendroid.testapp:id/input_adds").click();
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	//	driver.quit();

	}

}
