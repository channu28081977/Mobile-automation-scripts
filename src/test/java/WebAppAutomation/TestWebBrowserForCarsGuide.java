package WebAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestWebBrowserForCarsGuide {
	public static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	cap.setCapability("deviceName", "2b8a778c");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("noReset", true);

	driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	driver.get("http://www.google.com");

	driver.findElement(By.name("q")).sendKeys("carsguide");
	
	Thread.sleep(2000);
	
	driver.pressKey(new KeyEvent(AndroidKey.SEARCH));

//	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/button[2]")).click();
//
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div[1]/a")).click();
//
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//*[@id=\"u_H-white\"]/div/a")).click();
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/a")).click();
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//a[text()='Search Cars']")).click();
//	Thread.sleep(3000);
//
//	WebElement branddropDown = driver.findElement(By.xpath("*//select[@id='makes']"));
//	branddropDown.click();
//	Select make = new Select(branddropDown);
//
//	make.selectByVisibleText("BMW");
//	Thread.sleep(3000);
//
//	WebElement modeldropDown = driver.findElement(By.xpath("*//select[@id='models']"));
//	modeldropDown.click();
//	Select model = new Select(modeldropDown);
//
//	model.selectByVisibleText("1 Series");
//	Thread.sleep(3000);
//
//	WebElement locationdropDown = driver.findElement(By.xpath("*//select[@id='locations']"));
//	locationdropDown.click();
//	Select location = new Select(locationdropDown);
//
//	location.selectByVisibleText("NSW - All");
//	Thread.sleep(3000);
//
//	WebElement pricedropDown = driver.findElement(By.xpath("*//select[@id='price-max']"));
//	pricedropDown.click();
//	Select price = new Select(pricedropDown);
//
//	price.selectByVisibleText("$10,000");
//	Thread.sleep(3000);
}
}
