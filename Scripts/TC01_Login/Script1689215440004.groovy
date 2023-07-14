import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_BASE)

WebUI.setText(findTestObject('Object Repository/PRACTICA 1/LOGIN/input_userName'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/PRACTICA 1/LOGIN/input_password'), password)

WebUI.click(findTestObject('Object Repository/PRACTICA 1/LOGIN/button_login'))

WebUI.verifyMatch(WebUI.getUrl(), 'http://www.saucedemo.com/inventory.html', false)

WebUI.verifyTextPresent('Products', false)

WebUI.takeScreenshot('C:\\Users\\DavidSa\\Documents\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Login.png')
	
WebUI.closeBrowser()

	



