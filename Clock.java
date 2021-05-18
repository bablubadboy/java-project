package AppiumPractice;
###################################
I just made changes lets see
####################################
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Clock {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability("platformName", "ANDROID");
			caps.setCapability("platformVersion", "10.0(Q)");
			caps.setCapability("deviceName", "Pixel 2 API 29");
			caps.setCapability("udid", "emulator-5554");
			caps.setCapability("automationName", "Uiautomator2");

			caps.setCapability("appPackage", "com.google.android.deskclock");
			caps.setCapability("appActivity", "com.android.deskclock.DeskClock");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, caps);
			System.out.println("Clock has been opened");
			
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();

		}
	}

}
