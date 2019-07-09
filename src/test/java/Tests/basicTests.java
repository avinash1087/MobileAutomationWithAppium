package Tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Screens.HomeScreen;
import Screens.PerferenceDependencyMenu;
import Screens.PreferenceMenu;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class basicTests extends TestBase {
	AndroidDriver<MobileElement> driver;
	HomeScreen objHomeScreen;
	PreferenceMenu objPreferenceMenu;
	PerferenceDependencyMenu objPerferenceDependencyMenu;

	@BeforeClass
	public void setup() throws MalformedURLException {
		// Install App
		driver = capablities();

		// Instantiate Objects
		objHomeScreen = new HomeScreen(driver);
		objPreferenceMenu = new PreferenceMenu(driver);
		objPerferenceDependencyMenu = new PerferenceDependencyMenu(driver);
	}

	@Test
	public void validateWiFiSettingButtonDisabled() throws MalformedURLException {
		// Click on Preference
		objHomeScreen.preference.click();

		// Click on Preference Dependencies
		objPreferenceMenu.preferenceDependencies.click();

		// Assert that Wifi Setting is disabled when Wifi checkbox is not checked
		assertEquals(objPerferenceDependencyMenu.wifiSetting.getAttribute("enabled"), "false");

	}

	@Test
	public void validateWiFiSettingButtonEnabled() {
		// Check the Wifi checkbox
		objPerferenceDependencyMenu.wifiCheckBox.click();

		// Assert that Wifi Setting is enabled when Wifi checkbox is not checked
		assertEquals(driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").getAttribute("enabled"), "true");
	}

	@Test
	public void validateWifiSettingText() {
		// Click on Wifi Setting
		objPerferenceDependencyMenu.wifiSetting.click();

		// Set Wifi Name
		objPerferenceDependencyMenu.wifiSettingTextBox.sendKeys("TestWifi");

		// Click on OK button
		objPerferenceDependencyMenu.wifiSettingOkButton.click();

		// Validate WiFi Setting Text
		objPerferenceDependencyMenu.wifiSetting.click();
		assertEquals(objPerferenceDependencyMenu.wifiSettingTextBox.getText(), "TestWifi");
	}

}
