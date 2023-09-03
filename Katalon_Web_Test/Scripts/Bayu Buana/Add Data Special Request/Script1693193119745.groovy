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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Bayu Buana/Login BBDEV Master Data'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Bayu Buana/Dashboard'))

WebUI.click(findTestObject('Bayu Buana/Master Data Management'))

WebUI.click(findTestObject('Bayu Buana/a_Special Request'))

WebUI.mouseOver(findTestObject('Bayu Buana/button_Create New'))

WebUI.click(findTestObject('Bayu Buana/button_Create New'))

def randomName = RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('Bayu Buana/input_Special Request Name_special_request_name'), randomName)

def randomCode = RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Bayu Buana/input_Special Request Code_special_request_code'), randomCode)

WebUI.click(findTestObject('Bayu Buana/button_SAVE'))

WebUI.click(findTestObject('Bayu Buana/button_OK'))

WebUI.takeFullPageScreenshot()

WebUI.takeFullPageScreenshotAsCheckpoint('Simple Visual Data')

