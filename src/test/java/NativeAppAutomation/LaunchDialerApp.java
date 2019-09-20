package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchDialerApp {
public static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "2b8a778c");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.contacts.DialtactsActivityAlias");
		cap.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		if(driver.isDeviceLocked()) {
			driver.unlockDevice();
			System.out.println("success");
		}
		
	//	driver.findElement(By.id("com.google.android.dialer:id/fab")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"eight TUV\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"one Voicemail \"]/android.widget.LinearLayout/android.widget.ImageView\r\n" + 
				"")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"nine WXYZ\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/com.color.widget.ColorViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout\r\n")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
		
				driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"seven PQRS\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"eight TUV\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"one Voicemail \"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"two ABC\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"six MNO\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"seven PQRS\"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"one Voicemail \"]/android.widget.LinearLayout/android.widget.ImageView\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.contacts:id/sim2_dial_btn")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.id("com.android.incallui:id/endButton")).click();
	//	driver.findElement(By.id("com.google.android.dialer:id/incall_end_call")).click();
		Thread.sleep(2000);
				
		driver.pressKeyCode(AndroidKeyCode.HOME);
//		driver.quit();
	}

}
