package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestHardwareKeysNew {
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
		
//		driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("my_text_fieldCD")).sendKeys("appium!!!");
//		Thread.sleep(1000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));

//		driver.pressKey(new KeyEvent(AndroidKey.A));
//		driver.pressKey(new KeyEvent(AndroidKey.P));
//		driver.pressKey(new KeyEvent(AndroidKey.P));
//		driver.pressKey(new KeyEvent(AndroidKey.I));
//		driver.pressKey(new KeyEvent(AndroidKey.U));
//		driver.pressKey(new KeyEvent(AndroidKey.M));
//		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//		driver.pressKey(new KeyEvent(AndroidKey.A));
//		driver.pressKey(new KeyEvent(AndroidKey.P));
//		driver.pressKey(new KeyEvent(AndroidKey.P));
//		driver.pressKey(new KeyEvent(AndroidKey.I));
//		driver.pressKey(new KeyEvent(AndroidKey.U));
//		driver.pressKey(new KeyEvent(AndroidKey.M));
//		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

	}

}
