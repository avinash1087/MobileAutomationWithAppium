package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PerferenceDependencyMenu {
	AndroidDriver<MobileElement> driver;
	
	public PerferenceDependencyMenu(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement wifiSetting;
	
	@FindBy(id="android:id/checkbox")
	public WebElement wifiCheckBox;
	
	@FindBy(className = "android.widget.EditText")
	public WebElement wifiSettingTextBox;
	
	
	@FindBy(id = "android:id/button1")
	public WebElement wifiSettingOkButton;
	
}
