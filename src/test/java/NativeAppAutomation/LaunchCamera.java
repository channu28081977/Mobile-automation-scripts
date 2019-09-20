package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchCamera {
	public static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.oppo.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.oppo.camera.Camera");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		Thread.sleep(2000);

		driver.findElementById("com.oppo.camera:id/switch_camera_button").click();

		Thread.sleep(1000);

		driver.findElementById("com.oppo.camera:id/shutter_button").click();

		Thread.sleep(5000);

		driver.findElementById("com.oppo.camera:id/thumbnail").click();

		Thread.sleep(1000);
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		driver.pressKeyCode(AndroidKeyCode.HOME);
		

		driver.quit();

	}
}
