package ApidemoAutomation;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ApiDemoAutomation extends ApiDemoBaseClass{

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();

		// xpath using classname as tagname and @text--here no brackets for
		// @text()--wrong!!!
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

		Thread.sleep(2000);
		// element located by Id
		driver.findElementById("android:id/checkbox").click();

		Thread.sleep(1000);

		// xpath when u have only classname duplicate

		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

		Thread.sleep(2000);

		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");

		Thread.sleep(4000);

		// xpath when u have only classname duplicate using findelements()
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	//	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}

	}


