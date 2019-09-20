package Qavalidation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchEmirates {
public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability("noReset", true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.emirates.ek.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.emirates.startup.StartupActivity");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.emirates.ek.android:id/button").click();
		
		driver.findElementById("tab-item-1").click();
		
		driver.findElementById("departureId").click();
		Thread.sleep(2000);
		
		WebElement allLocations = driver.findElementByXPath("//android.view.View[@text='All locations']");
		
		System.out.println(allLocations.getText());
		allLocations.click();
		
		
//		driver.findElementByXPath("//android.widget.Button[@text='Aalborg, Denmark Aalborg Airport AAL']").click();
//		
//		driver.findElementById("arrivalId").click();
//		
//		driver.findElementByXPath("").click();
//		
		
		
	}

}
