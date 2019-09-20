package NativeAppAutomation;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAmazon {
public static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.flipkart.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.flipkart.android.SplashActivity");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementByXPath("//android.widget.TextView[@text='Search for Products, Brands and More']").sendKeys("mobile");
		WebElement image = driver.findElementById("com.flipkart.android:id/tv_card_view_holder");
		image.click();
//		Dimension dim = image.getSize();
//		int ht=dim.getHeight();
//		int wd=dim.getWidth();
		

//		System.out.println("height of image is = " +ht +"width +" +wd);
//		driver.findElementByAndroidUIAutomator("atribute(value)")
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		driver.findElements(MobileBy.AndroidUIAutomator(""));

	}

}
