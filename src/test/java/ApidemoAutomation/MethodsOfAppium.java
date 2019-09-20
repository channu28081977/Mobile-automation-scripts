package ApidemoAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

public class MethodsOfAppium {
public static AndroidDriver<MobileElement> driver; 
	public static void main(String[] args) throws MalformedURLException {

//		Single tap on the touch enabled device
//		TouchActions action = new TouchActions(driver);
//		action.singleTap(element);
//		action.perform();
//
//		double tap on the touch enabled device
//		TouchActions action = new TouchActions(driver);
//		action.doubleTap(element);
//		action.perform();
//		
//		Touch Down
//		Finger down on the screen
//		TouchActions action = new TouchActions(driver);
//		action.down(10, 10);
//		action.move(50, 50);
//		action.perform();
//		
//		Touch Up
//		Finger up on the screen
////		
//		TouchActions action = new TouchActions(driver);
//		action.down(10, 10);
//		action.up(20, 20);
//		action.perform();
//		
//		Shake
//		Perform a shake action on the device
//
//		driver.shake();
//		
//		Lock
//		Lock the device
//		
//		driver.lockDevice();
//		
//		Unlock
//		Unlock the device
//
//		driver.lockDevice();
//		driver.unlockDevice();
//		
//		Is Device Locked
//		Check whether the device is locked or not
//
//		boolean isLocked = driver.isDeviceLocked();
//		
//		Press Key Code
//		Press a particular key on an Android Device
//		
//		driver.pressKeyCode(AndroidKeyCode.SPACE, AndroidKeyMetastate.META_SHIFT_ON);
//		
//		Long Press Key Code
//		Press and hold a particular key code on an Android device
//
//		driver.longPressKeyCode(AndroidKeyCode.HOME);
//		
//		Hide Keyboard
//		Hide soft keyboard
//
//		driver.hideKeyboard();
//		
//		Toggle Airplane Mode
//		Toggle airplane mode on device
//
//		driver.toggleAirplaneMode();
//
//		Toggle Data
//		Switch the state of data service
//
//		driver.toggleData();
//		
//		Click
//		Click element at its center point.
//
//		MobileElement el = driver.findElementByAccessibilityId("SomeId");
//		el.click();
//		
//		Send Keys
//		Send a sequence of key strokes to an element
//
//		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
//		element.sendKeys("Hello world!");
//		
//		Clear Element
//		Clear an element's value
//
//		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
//		element.clear();
//		
//		Get Current Context
//		Get the current context in which Appium is running
//
//		String context = driver.getContext();
//
//		Description
//		Retrieve the current context. This can be either NATIVE_APP for the native context, or a web view context, which will be:
//
//		iOS - WEBVIEW_<id>
//		Android - WEBVIEW_<package name>
//		
//		Set Current Context
//		Set the context being automated
//
//		Set<String> contextNames = driver.getContextHandles();
//		driver.context(contextNames.toArray()[1]);
//		// ...
//		driver.context("NATIVE_APP");
//
//		Set the current context to that passed in. If this is moving into a web view context it will involve attempting to connect to that web view:
//
//			iOS - attempt to connect to the application through the remote debugger
//			Android - start a Chromedriver process and begin a session to connect to the web view
//		
//		Automatically entering the web view context on session start
//		If your application begins in a web view, and you do not want to automate the native 
//		application before entering it, you can have Appium automatically enter the web view context on 
//		session initialization by setting the autoWebview desired capability to true.
//		
//		// assuming we have a set of capabilities
//		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//
//		Set<String> contextNames = driver.getContextHandles();
//		for (String contextName : contextNames) {
//		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
//		}
//		driver.context(contextNames.toArray()[1]); // set context to WEBVIEW_1
//
//		//do some web testing
//		String myText = driver.findElement(By.cssSelector(".green_button")).click();
//
//		driver.context("NATIVE_APP");
//
//		// do more native testing if we want
//
//		driver.quit();
		DesiredCapabilities cap = new DesiredCapabilities();
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		List<MobileElement> list = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TOP Charts\")"));
		
		








































	}

}
