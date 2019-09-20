package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Amazon_automation {
public static AndroidDriver<AndroidElement> driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.amazon.mShop.android.shopping");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("oppo k3 mobile phone");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='oppo k3 mobile phone']").click();
		
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"OPPO F11 Pro (Aurora Green, 6GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers,image\"]").click();
		
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add to Cart\"));").click();
		Thread.sleep(3000);
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"add-to-cart-button\")).scrollIntoView("
				+ "new UiSelector().text(\"Submit\"))"));
		element.click();
//		Dimension dim = driver.manage().window().getSize();
//		int height = dim.getHeight();
//		int width = dim.getWidth();
//		System.out.println(height);
//		System.out.println(width);
//		int startx = width/2;
//		int endx = width/2;
//		int starty = (int) (height * 0.40);
//		int endy = (int) (height * 0.20);
//		
//		Thread.sleep(3000);
//		TouchAction action1 = new TouchAction(driver);
//        action1.press(PointOption.point(startx, starty)) 
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
//        .moveTo(PointOption.point(endx, endy)) 
//        .release().perform();
	}

}
