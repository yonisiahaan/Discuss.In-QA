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

WebUI.navigateToUrl('https://discussin.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Band/Page_Login Admin/input_Email_email'), 'admin90@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Band/Page_Login Admin/input_Password_password'), 'MucOlae76iZ9Y7OBkdaO9A==')

WebUI.click(findTestObject('Object Repository/Band/Page_Login Admin/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Band/Page_Dashboard  discuss.in/a_Users'))

WebUI.click(findTestObject('Object Repository/Band/Page_Manage User/button_Ban'))

WebUI.setMaskedText(findTestObject('Band/Page_Manage User/input_Ban User_banUntil'), 1)

WebUI.click(findTestObject('Object Repository/Band/Page_Manage User/button_Yes'))

WebUI.click(findTestObject('Object Repository/Band/Page_Manage User/h1_Manage User'))

WebUI.closeBrowser()

