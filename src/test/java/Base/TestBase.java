package Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;

public class TestBase {

	public static DesiredCapabilities dCap;
	public static AndroidDriver<MobileElement> driver;

	@SuppressWarnings("static-access")
	public static AndroidDriver<MobileElement> capablities() throws MalformedURLException {
		File fs = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ApiDemos-debug.apk");
		dCap = new DesiredCapabilities().android();
		dCap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
		dCap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// new step
		dCap.setCapability("app", fs.getAbsolutePath());
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dCap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
