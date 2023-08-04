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

WebUI.navigateToUrl(GlobalVariable.URL_DEMOQA)

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/ALTAUSUARIO/HOME/button_elements'), 1)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/HOME/button_elements'))

WebUI.scrollToElement(findTestObject('Object Repository/ALTAUSUARIO/SUBMENU/button_webTables'), 1)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/SUBMENU/button_webTables'))

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/button_add'))

WebUI.verifyTextPresent('First Name', false)

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/input_firstName'), firstName)

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/input_lastName'), lastName)

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/input_userEmail'), Email)

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/input_age'), Age)

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/input_salary'), Salary)

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/input_department'), Department)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMULARIO/button_submit'))

WebUI.verifyTextPresent('David', false)

WebUI.closeBrowser()
