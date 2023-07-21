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

WebUI.callTestCase(findTestCase('Login'), [('userName') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM', ('tituloMake') : 'Make Appointment'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/slect_facility'), facility, false)

WebUI.check(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/checkbox_applyHospital'))

WebUI.click(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/radio_healthcareProgram'))

WebUI.setText(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/input_visitDate'), date)

WebUI.setText(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/textarea_comment'), comment)

WebUI.click(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/button_bookAppoinment'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/TC03-CrearCita/CITA_MAKE/MAKE_APPOINTMENT/button_bookAppoinment'), 5)

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.takeScreenshot('C:\\Users\\DavidSa\\Documents\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Practicas\\Cita.png')

WebUI.closeBrowser()







