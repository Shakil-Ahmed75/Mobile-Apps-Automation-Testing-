package demoApp;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {

	@Test
	public void name() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
	}
}
