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

int j = 0;

for (i = 1; i <= 7; i++) {

	j=i+1


	WebUI.navigateToUrl('https://discussin.netlify.app')

	WebUI.click(findTestObject('Object Repository/Login/Page_Landing Page/a_Sign in'))

	WebUI.setText(findTestObject('Object Repository/Login/Page_Login Admin/input_Email_email'), findTestData('LoginData2').getValue(
			1, i))

	WebUI.setText(findTestObject('Object Repository/Login/Page_Login Admin/input_Password_password'), findTestData('LoginData2').getValue(
			1, j ))

	WebUI.click(findTestObject('Object Repository/Login/Page_Login Admin/button_Sign In'))

}

