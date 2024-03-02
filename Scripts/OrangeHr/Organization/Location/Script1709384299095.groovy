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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('OrangeHr/login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.ea.utility.Navigate_To_Organization.navigate_Organitaion'()

WebUI.click(findTestObject('OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/Click_Location'))

WebUI.verifyTextPresent('Locations', false)

WebUI.click(findTestObject('OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/Click_Add'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    '678613')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/div_-- Select --'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    '8086478379')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/textarea_Address_oxd-textarea oxd-textarea-_2f3678'), 
    'hot')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Organization/Location/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

