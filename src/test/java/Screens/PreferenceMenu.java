package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PreferenceMenu {
	AndroidDriver<MobileElement> driver;
	
	public PreferenceMenu(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement preferenceDependencies;
	
}
