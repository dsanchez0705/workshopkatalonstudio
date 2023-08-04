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

WebUI.scrollToElement(findTestObject('Object Repository/ALTAUSUARIO/FORMS/button_forms'), 1)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/button_forms'))

//WebUI.scrollToElement(findTestObject('null'), 1)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/button_practiceForm'))

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_firstName'), 'David')

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_lastName'), 'Sanchez')

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_userEmail'), 'dadsag@gmail.com')

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/label_gender'))

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_userNumber'), '5567676767')

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_dateofBirthInput'))

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_month'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_month'), 'July', false)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_year'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_year'), '2023', false)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_day'))

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_subjects'), 'Maths')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_subjects'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_hobbies'))

WebUI.uploadFile(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_picture'), 'C:\\Imagen\\photo_5049085960754670295_y.jpg')

WebUI.setText(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/textarea_currentAddress'), 'Practica Final')

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_state'), State)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_state'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_city'), City)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/input_city'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_submit'))

WebUI.verifyTextPresent('Thanks', false)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/FORMS/REGISTRATIONFORM/button_close'))

WebUI.closeBrowser()









