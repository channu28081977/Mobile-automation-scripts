package ApidemoAutomation;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeDemo extends ApiDemoBaseClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Date Widgets\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Inline\"]").click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
		
		TouchAction action = new TouchAction(driver);
		
	//	action.longPress(first).moveToElement(second).release().perform();
//		action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(first)).withDuration(Duration.ofSeconds(2)))
//		.moveTo(ElementOption.element(second)).release().perform();

		action.longPress(ElementOption.element(first)).moveTo(ElementOption.element(second)).release().perform();
		
		Thread.sleep(2000);
		
		
		

	}

}
