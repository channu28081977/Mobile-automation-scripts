package ApidemoAutomation;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class GestureDemo extends ApiDemoBaseClass{

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {

		AndroidDriver<AndroidElement> driver = capabilities();
		
driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]").click();
		
		TouchAction action = new TouchAction(driver);
		
		WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(peopleNames)).withDuration(Duration.ofSeconds(2))).release().perform();
		
		Thread.sleep(20000);
		
		System.out.println(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout").isDisplayed());	
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
				
	}

}
