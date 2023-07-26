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

WebUI.openBrowser('https://demoqa.com/elements')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') : 'Forms']), 1)

WebUI.click(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') :'Forms']))

WebUI.verifyElementVisible(findTestObject('Object Repository/button/PRACTICA6/a_optionSubmenuDYN', [('textSubmenu') :'Practice Form']))


WebUI.scrollToElement(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') : 'Alerts, Frame & Windows']), 1)

WebUI.click(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') :'Alerts, Frame & Windows']))

WebUI.verifyElementVisible(findTestObject('Object Repository/button/PRACTICA6/a_optionSubmenuDYN', [('textSubmenu') :'Browser Windows']))


WebUI.scrollToElement(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') : 'Widgets']), 1)

WebUI.click(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') :'Widgets']))

WebUI.verifyElementVisible(findTestObject('Object Repository/button/PRACTICA6/a_optionSubmenuDYN', [('textSubmenu') :'Accordian']))


WebUI.scrollToElement(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') : 'Interactions']), 1)

WebUI.click(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') :'Interactions']))

WebUI.verifyElementVisible(findTestObject('Object Repository/button/PRACTICA6/a_optionSubmenuDYN', [('textSubmenu') :'Sortable']))


WebUI.scrollToElement(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') : 'Book Store Application']), 1)

WebUI.click(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') :'Book Store Application']))

WebUI.verifyElementVisible(findTestObject('Object Repository/button/PRACTICA6/a_optionSubmenuDYN', [('textSubmenu') :'Login']))


WebUI.scrollToElement(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') : 'Elements']), 1)

WebUI.click(findTestObject('Object Repository/button/PRACTICA6/a_optionMenuDYN', [('textoMenu') :'Elements']))

WebUI.verifyElementVisible(findTestObject('Object Repository/button/PRACTICA6/a_optionSubmenuDYN', [('textSubmenu') :'Text Box']))


