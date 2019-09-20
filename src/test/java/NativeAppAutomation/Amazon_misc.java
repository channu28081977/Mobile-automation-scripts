package NativeAppAutomation;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Amazon_misc {
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "2b8a778c");
		caps.setCapability("platfromName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		caps.setCapability("noReset", true);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	
		driver.findElementByXPath("//android.widget.ImageView[@content-desc='scan it']").click();
		
		
		WebElement drag = driver.findElement(By.id("drag_1")); 
		WebElement drop = driver.findElement(By.id("drop_1")); 
		TouchAction dragNDrop = new TouchAction(driver);
		dragNDrop.longPress((LongPressOptions.longPressOptions().withElement((ElementOption.element(drag))).withDuration(Duration.ofSeconds(2)))
		.longPressOptions()).moveTo(ElementOption.element(drop)).release();
	dragNDrop.longPress(ElementOption.element(drag)).moveTo(ElementOption.element(drop)).release();
		 
		dragNDrop.perform();
		
		

	}

}
