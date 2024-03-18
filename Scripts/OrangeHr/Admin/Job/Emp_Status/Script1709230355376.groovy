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

WebUI.click(findTestObject('OrangeHRM/Admin/Job/Emp_Status/Emp_status'))

WebUI.click(findTestObject('OrangeHRM/Admin/Job/Emp_Status/Add_Status'))

WebUI.setText(findTestObject('OrangeHRM/Admin/Job/Emp_Status/Send_name'), GlobalVariable.Emp_Status)

WebUI.click(findTestObject('OrangeHRM/Admin/Job/Emp_Status/Save_Emp_Status'))

WebUI.delay(3)

actual_Text = WebUI.getText(findTestObject('OrangeHRM/Admin/Job/Emp_Status/verify_the_text'))

WebUI.verifyMatch(actual_Text, GlobalVariable.Emp_Status, false)

//CustomKeywords.'com.ea.utility.Logout.logOut'()

