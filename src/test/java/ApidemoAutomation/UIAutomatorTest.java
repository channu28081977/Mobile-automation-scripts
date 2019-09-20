package ApidemoAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class UIAutomatorTest extends ApiDemoBaseClass{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
	//	driver.findElementByAndroidUIAutomator("atribute(value)")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		WebElement doubletap = driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
		driver.findElements(MobileBy.AndroidUIAutomator(""));
		
		TouchActions action = new TouchActions(driver);
		action.doubleTap(doubletap).perform();
	//	action.perform();
		action.longPress(doubletap);
		driver.longPressKeyCode(AndroidKeyCode.HOME);
		driver.pressKeyCode(AndroidKeyCode.SPACE);

	}

}
