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

WebUI.openBrowser('https://my.katalon.com/login')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/p_Dont have an account'), 0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/p_Sign Up'), 0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/svg'), 0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/span_Sign in to Katalon'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Profile/input_Email_email'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Profile/input_Password_password'), 0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/p_By signing in to Katalon Platform, you agree with Katalon Terms of Service and Privacy Policy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/a_Katalon Terms of Service and Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/input_Katalon Terms of Service and Privacy Policy_rememberMe'), 
    0)

WebUI.verifyElementPresent(findTestObject('Login_Profile/button_Sign In'), 0)

WebUI.verifyElementPresent(findTestObject('Verify_Element Login/a_Forgot your password'), 0)

WebUI.takeFullPageScreenshot()

