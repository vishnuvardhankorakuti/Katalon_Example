import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

// Test data
String url = 'https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php'
String name = 'Vishnu'
String email = 'Vishnu@gmail.com'
String dob = '20-05-1999' // dd-MM-yyyy

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(url)

// Name
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TutorialsPoint_Selenium_Practice/txt_Name'), 20)
WebUI.setText(findTestObject('Object Repository/Page_TutorialsPoint_Selenium_Practice/txt_Name'), name)

// Email
WebUI.setText(findTestObject('Object Repository/Page_TutorialsPoint_Selenium_Practice/txt_Email'), email)

// Gender: Male
WebUI.click(findTestObject('Object Repository/Page_TutorialsPoint_Selenium_Practice/rdo_Gender_Male'))

// Many date inputs accept direct typing; send ENTER/TAB to ensure the value is committed
// Keep browser open for observation if needed; uncomment to close
 WebUI.closeBrowser()
