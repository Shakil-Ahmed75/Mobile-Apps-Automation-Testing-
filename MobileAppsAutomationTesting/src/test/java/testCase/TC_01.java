package testCase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC_01 {
 
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
//		UiAutomator2Options options =new UiAutomator2Options();
//		options.setDeviceName("Android Device");
//		//options.setPlatformName("");
//		options.setApp("C:\\Users\\ShakilAhmed\\git\\Mobile-Apps-Automation-Testing-\\MobileAppsAutomationTesting\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//		Pixel 5 API 31
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//		driver.quit();
		
		DesiredCapabilities caps = new DesiredCapabilities();
//	    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, value:"Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android" );
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel5API31");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		String appUrl =System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+
				File.separator+"java"+
		File.separator+"resources"+ File.separator+ "ApiDemos-debug.apk";
//		URL url = new URL("http://0.0.0.0:4723");
//       AppiumDriver driver = new AndroidDriver(url, caps);
        URL url =new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,caps);
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
}
