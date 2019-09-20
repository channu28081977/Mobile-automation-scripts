package NativeAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClickOnParticularBtnInApp {
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
		
		
		driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("hello wierd appium !!!");
		Thread.sleep(2000);
		
		driver.hideKeyboard();
		
		System.out.println("No of buttons in the app are : "+driver.findElements(By.className("android.widget.Button")).size());
		
		List<WebElement> btn = driver.findElements(By.className("android.widget.Button"));
		
		for(WebElement button : btn) {
			if(button.getAttribute("text").contains("Display text view")){
				
				button.click();
				Thread.sleep(1000);
			}
		}
		
		driver.quit();

	}

}
