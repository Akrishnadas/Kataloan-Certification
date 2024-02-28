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

WebUI.callTestCase(findTestCase('OrangeHr/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_Add_Job/span_Admin'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_Add_Job/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_Add_Job/a_Job Titles'))

WebUI.click(findTestObject('OrangeHRM/Admin/Job/Page_Add_Job/Add'))

WebUI.verifyTextPresent('Add Job Title', false)

WebUI.setText(findTestObject('OrangeHRM/Admin/Job/Page_Add_Job/Job_Title_Name'), 'Automation katalon')

WebUI.setText(findTestObject('OrangeHRM/Admin/Job/Page_Add_Job/Job_Description'), 'Kataloan Automation test enginer')

WebUI.setText(findTestObject('OrangeHRM/Admin/Job/Page_Add_Job/Job_Note'), 'complete Knowledge in api and ui ')

WebUI.click(findTestObject('OrangeHRM/Admin/Job/Page_Add_Job/Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_Add_Job/i_Job_oxd-icon bi-caret-down-fill oxd-userd_f084ee'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_Add_Job/a_Logout'))

WebUI.closeBrowser()

