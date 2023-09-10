package driverSetup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class OptionsClassDriver {

	public static void main(String[] args) throws MalformedURLException {
		// Pixel5API31

		String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "java" + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
		UiAutomator2Options options = new UiAutomator2Options().setDeviceName("Pixel7Pro")
				.setAutomationName("UiAutomator2").setApp(appUrl);
		URL url = new URL("http://0.0.0.0:4723");
		AppiumDriver driver = new AndroidDriver(url, options);
		System.out.println("Session Id:" +driver.getSessionId());
//adb shell "dumpsys activity activities |grep mResumedActivity"
	}

}
