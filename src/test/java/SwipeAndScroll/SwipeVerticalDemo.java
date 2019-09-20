package SwipeAndScroll;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SwipeVerticalDemo {
	AppiumDriver<MobileElement> driver;
public void setUp() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	cap.setCapability("noReset", true);
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
	
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("driver is launched");
}

	public static void swipeVertical(AppiumDriver<MobileElement> driver, double startpercentage, double finalpercentage, int duration) {
		Dimension size = driver.manage().window().getSize();
		int width = (int) (size.width/2);
		int startpoint = (int)(size.getHeight() * startpercentage);
		int endpoint = (int)(size.getHeight() * finalpercentage);
		new TouchAction(driver).press(PointOption.point(width, startpoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(width, endpoint)).release().perform();
		
	}
	public void swipeTest() {
		System.out.println("view found : " +driver.findElementByAccessibilityId("Views").isDisplayed());
		driver.findElementByXPath("//*[@text='Views']").click();
//		System.out.println("Imageview found : "+driver.findElementByAccessibilityId("ImageView").isDisplayed());
		for(int i = 0; i <= 10; i++) {
			try {
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				WebElement webview = driver.findElementByAccessibilityId("WebView");
				webview.isDisplayed();
				webview.click();
				System.out.println("***********webview found**********");
				break;
				
			}catch(Exception e) {
				swipeVertical(driver, 0.80, 0.20, 2000);
			}
		}
	}
	
	public void tearDown() {
		driver.quit();
	}
	public static void main(String[] args) throws MalformedURLException {
		SwipeVerticalDemo obj = new SwipeVerticalDemo();
		obj.setUp();
		obj.swipeTest();
	//	obj.tearDown();
		

	}

}
