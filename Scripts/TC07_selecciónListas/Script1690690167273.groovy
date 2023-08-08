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

WebUI.scrollToElement(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/button_widgets'), 1)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/button_widgets'))

WebUI.scrollToElement(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/button_selectMenu'), 1)

WebUI.click(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/button_selectMenu'))

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_selectValue'), 'A root option')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_selectValue'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_selectOne'), 'Prof.')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_selectOne'), Keys.chord(Keys.TAB))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/select_oldSelect'), 'Voilet', false)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_multiselect'), 'Green')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_multiselect'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_multiselect'), 'Blue')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/input_multiselect'), Keys.chord(Keys.TAB))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ALTAUSUARIO/WIDGETS/SELECTMENU/select_standard'), 'Saab', false)

WebUI.closeBrowser()


