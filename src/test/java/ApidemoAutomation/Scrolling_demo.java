package ApidemoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.ElementOption;

public class Scrolling_demo extends ApiDemoBaseClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")
			//	.click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\\\"WebView\\\"));"));
		System.out.println(driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View")
				.getText());
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(4000);
		
//		TouchAction action = new TouchAction(driver);
//		action.press(driver.findElement(By.id("valid_id"))).perform();
//		Point point =driver.findElementById("valid_id").getLocation();
//		new TouchAction(driver).press(point.x + 20, point.y + 30).waitAction(1000).release().perform();

	}

}
