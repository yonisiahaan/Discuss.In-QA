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

WebUI.navigateToUrl('https://discussin.netlify.app/login/')

WebUI.setText(findTestObject('Object Repository/StopActivity/Page_Login Admin/input_Email_email'), 'admin90@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/StopActivity/Page_Login Admin/input_Password_password'), 'MucOlae76iZ9Y7OBkdaO9A==')

WebUI.click(findTestObject('Object Repository/StopActivity/Page_Login Admin/button_Sign In'))

WebUI.click(findTestObject('Object Repository/StopActivity/Page_Dashboard  discuss.in/a_Threads'))

WebUI.click(findTestObject('Object Repository/StopActivity/Page_Manage Thread/div_Stop Activity'))

WebUI.verifyElementText(findTestObject('Object Repository/StopActivity/Page_Manage Thread/h1_Stop All Activity'), 'Stop All Activity')

WebUI.click(findTestObject('Object Repository/StopActivity/Page_Manage Thread/div_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/StopActivity/Page_Manage Thread/h1_Manage Thread'), 'Manage Thread')

WebUI.closeBrowser()

