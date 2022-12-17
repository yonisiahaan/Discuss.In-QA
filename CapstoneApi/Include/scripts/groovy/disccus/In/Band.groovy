package disccus.In
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Band {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to PUT BA1")
	def SetValidBA1() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/Admins/3/ban BA1")
	def SetValidURLBA1() {
		println ("http://35.78.120.202/api/v1/Admins/3/ban ")
		response = WS.sendRequest(findTestObject('Manage User/Band/TC.001'))
	}

	@And("Admin input HTTP Body BA1")
	def inputValidDataBA1() {
		println ("Input day")
	}

	@And("Admin click button Test Request BA1")
	def clickButtonBA1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 200 OK BA1")
	def verifystatusCodeBA1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode200)
	}

	//@Band.BA2
	//
	@Given("Admin Set method to PUT BA2")
	def SetValidBA2() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/Admins/3/ban BA2")
	def SetValidURLBA2() {
		println ("http://35.78.120.202/api/v1/Admins/3/ban ")
		response = WS.sendRequest(findTestObject('Manage User/Band/TC.002'))
	}

	@And("Admin input HTTP Body BA2")
	def inputValidDataBA2() {
		println ("Input day")
	}

	@And("Admin click button Test Request BA2")
	def clickButtonBA2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 200 OK BA2")
	def verifystatusCodeBA2() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode200)
	}

	//@Band.BA3
	//Band user using method invalid
	@Given("Admin Set method to PUT BA3")
	def SetValidBA3() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/Admins/3/ban BA3")
	def SetValidURLBA3() {
		println ("http://35.78.120.202/api/v1/Admins/3/ban ")
		response = WS.sendRequest(findTestObject('Manage User/Band/TC.003'))
	}

	@And("Admin input HTTP Body BA3")
	def inputValidDataBA3() {
		println ("Input day")
	}

	@And("Admin click button Test Request BA3")
	def clickButtonBA3() {
		println ("Admin click button test Request")
	}

	@Then(" Show the verify result 405 Method Not Allowed  BA3")
	def verifystatusCodeBA3() {
		println ("Show the verify result 405 Method Not Allowed")

		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
}