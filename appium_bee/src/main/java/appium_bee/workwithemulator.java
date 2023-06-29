package appium_bee;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.WebElement ;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;



public class workwithemulator {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities() ;
		
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Device_B");
		
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/bhavyakarimikonda/git/appautomatelocal/appium_bee/WikipediaSample.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, capabilities);
		
		driver.quit();
	}
	
}
