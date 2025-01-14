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

WebUI.navigateToUrl('https://discussin.netlify.app/')

WebUI.click(findTestObject('Object Repository/NewLogin/Page_Landing Page/a_Sign in'))

for(def row=1; row<=findTestData('NewLogin.003').getRowNumbers(); row++) {

WebUI.setText(findTestObject('Object Repository/NewLogin/Page_Login Admin/input_Email_email'), findTestData('NewLogin.003').getValue('email', row))

WebUI.setText(findTestObject('Object Repository/NewLogin/Page_Login Admin/input_Password_password'), findTestData('NewLogin.003').getValue('password', row))

WebUI.click(findTestObject('Object Repository/NewLogin/Page_Login Admin/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Login.003/Page_Login Admin/div_Sign in as AdminNot admins Open apps in_29c20b'))

}
WebUI.closeBrowser()

