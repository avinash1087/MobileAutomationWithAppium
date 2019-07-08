# MobileAutomationWithAppium
Mobile Testing Assignment

Tools Used:
Scripting Language: Java
Testing Framework: TestNG and POM

App used for testing: ApiDemos-debug.apk (app provided by Appium for testing)

Scenarios Tested:
1. Launch the app. Click on 'Preferences'. Assert that 'Wifi Settings' button is disabled
2. Check on 'Wifi' checkbox. Assert that 'WiFi Settings' button is enabled
3. Click on 'WiFi Settings' and set a WiFi Setting text. Assert that text is set.

Steps to Execute Tests

1. Clone the respository
2. Run Maven Clean
3. Run Maven Install
3. Run testng.xml file
