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

WebUI.callTestCase(findTestCase('OrangeHr/login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.ea.utility.navigate_to_admin_job.navigate_To_Job'()

WebUI.click(findTestObject('OrangeHRM/Admin/Job/Page_shift/Click_Work_Shift'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_shift/button_Add'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_shift/input_Shift Name_oxd-input oxd-input--focus'), 
    'Night Shift')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_shift/input'), 'normal')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Job/Page_shift/button_Save'))

WebUI.delay(3)

actual_Text = WebUI.getText(findTestObject('OrangeHRM/Admin/Job/Page_shift/verify_the_Add_Shift_Text'))

WebUI.verifyMatch(actual_Text, 'Night Shift', false)

CustomKeywords.'com.ea.utility.Logout.logOut'()

