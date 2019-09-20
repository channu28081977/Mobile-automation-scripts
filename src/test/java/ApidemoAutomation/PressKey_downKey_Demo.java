package ApidemoAutomation;

import java.net.MalformedURLException;
import java.util.Map;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Response;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.PressesKey;

public class PressKey_downKey_Demo extends ApiDemoBaseClass{
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	AndroidDriver<AndroidElement> driver = capabilities();
	
	driver.findElementByAccessibilityId("Views").click();
	driver.findElementByAccessibilityId("Auto Complete").click();
	driver.findElementByAccessibilityId("1. Screen Top").click();
	driver.findElementById("io.appium.android.apis:id/edit").sendKeys("indiana");
	Thread.sleep(1000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_DEL);
	Thread.sleep(1000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_DEL);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
	Thread.sleep(1000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
	Thread.sleep(1000);
	driver.pressKeyCode(AndroidKeyCode.ENTER);
	Thread.sleep(2000);
	
	
	String text = driver.findElementById("io.appium.android.apis:id/edit").getText();
	
	if(text.equals("India")){
		System.out.println("passed");
	}else {
		System.out.println("failed");
	}

//	//double tap on webelement
//	TouchActions action = new TouchActions(driver);
//	action.doubleTap(driver.findElementById(""));
//	action.perform();
//
//	TouchActions action1 = new TouchActions(driver);
//	action1.down(10, 10);
//	action1.move(50, 50);
//	action1.perform();
//
//	TouchActions action2 = new TouchActions(driver);
//	action2.longPress(driver.findElementById(""));
//	action2.perform();
//
//	TouchActions action3 = new TouchActions(driver);
//	action3.scroll(driver.findElementById(""), 10, 100);
//	action3.perform();
//
//	TouchAction action4 = new TouchAction(driver);
//	action4.press(10, 10);
//	action4.moveTo(10, 100);
//	action4.release();
//	action4.perform();

}
}
