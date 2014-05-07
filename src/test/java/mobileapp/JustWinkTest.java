package mobileapp;

import java.io.File;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class JustWinkTest {
	private AppiumDriver driver;
	
	@Before
	public void setUp() throws Exception {
		File app = new File("/home/prudhvi/Downloads/com.justwink.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("device", "android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(CapabilityType.VERSION, "4.4");
		capabilities.setCapability(CapabilityType.PLATFORM, "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.justwink");
		//capabilities.setCapability("app-activity", "JustWinkApplication");
		capabilities.setCapability("appActivity", "com.justwink.splashscreen.SplashActivity");
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void clickCategoriesButton() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement el = driver.findElement(By.name("categories"));
		el.click();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}