package skenario;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PulsaBuy {
	private AndroidDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
	
		try {
			
			DesiredCapabilities caps = new DesiredCapabilities();
//			caps.setCapability("platformName", "Android");
//			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability("platformName","Android");
			caps.setCapability("platformVersion", "10");
			caps.setCapability("deviceName", "ASUS_Z01RD");
			caps.setCapability("udid", "J9AZGF000585Y83");
			caps.setCapability("newCommandTimeout", 60);
			caps.setCapability("automationName", "appium");
			caps.setCapability("appPackage", "com.tokopedia.tkpd");
			caps.setCapability("appActivity","com.tokopedia.navigation.presentation.activity.MainParentActivity");
			//com.tokopedia.digital.home.presentation.activity.RechargeHomepageActivity
			caps.setCapability("noReset","true");
	        caps.setCapability("fullReset", "false");
	        			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url,caps);
//			driver = new AndroidDriver<MobileElement>(url,caps);
//			driver = new IOSDriver<MobileElement>(url,caps);
			
			System.out.println("Setup aplikasi berhasil");
		}
	        catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
		}
	}	
	
	
	@AfterTest
	public void teardown() {
		System.out.println("Testing aplikasi telah selesai. Terima Kasih");
	}
	
	
	@Test
	public void pulsaIndosat() throws InterruptedException {

		//script asli dari appium record
//		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[4]/android.widget.TextView");
//		el1.click();
//		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
//		el2.click();
//		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");
//		el3.click();
//		MobileElement el4 = (MobileElement) driver.findElementById("com.tokopedia.tkpd:id/btn_recharge_checkout_next");
//		el4.click();
//		MobileElement el5 = (MobileElement) driver.findElementById("com.tokopedia.tkpd.df_base:id/btnCheckout");
//		el5.click();

		
		//agar tidak terlalu cepat
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[4]/android.widget.TextView"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("com.tokopedia.tkpd:id/btn_recharge_checkout_next"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("com.tokopedia.tkpd.df_base:id/btnCheckout"))).click();
		
	}
		
}
