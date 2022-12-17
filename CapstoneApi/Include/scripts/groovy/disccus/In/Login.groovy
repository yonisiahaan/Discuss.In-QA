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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to POST AA1")
	def SetValidAA1() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/login AA1")
	def SetValidURLAA1() {
		println ("http://35.78.120.202/api/v1/users/login ")
		response = WS.sendRequest(findTestObject('Auth/Login/TC.001'))
	}

	@And("Admin Input HTTP Body AA1")
	def InputValidDataAA1() {
		println ("Input day")
	}

	@And("Admin click button Test Request AA1")
	def clickButtonAA1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 200 OK AA1")
	def verifystatusCodeAA1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode200)
	}

	//Login.AA2

	@Given("Admin Set method to POST AA2")
	def SetValidAA2() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/login AA2")
	def SetValidURLAA2() {
		println ("http://35.78.120.202/api/v1/users/login ")
		response = WS.sendRequest(findTestObject('Auth/Login/TC.002'))
	}

	@And("Admin input HTTP Body AA2")
	def inputValidDataAA2() {
		println ("Input day")
	}

	@And("Admin click button Test Request AA2")
	def clickButtonAA2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request AA2")
	def verifystatusCodeAA2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}

	//Login.AA3
	@Given("Admin Set method to POST AA3")
	def SetValidAA3() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/login AA3")
	def SetValidURLAA3() {
		println ("http://35.78.120.202/api/v1/users/login ")
		response = WS.sendRequest(findTestObject('Auth/Login/TC.006'))
	}

	@And("Admin input HTTP Body AA3")
	def inputValidDataAA3() {
		println ("Input day")
	}

	@And("Admin click button Test Request AA3")
	def clickButtonAA3() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 403 Forbidden AA3")
	def verifystatusCodeAA3() {
		println ("Show the verify result 403 Forbidden")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode403)
	}

	//Login.AA4
	@Given("Admin Set method to PUT AA4")
	def SetValidAA4() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/login AA4")
	def SetValidURLAA4() {
		println ("http://35.78.120.202/api/v1/users/login ")
		response = WS.sendRequest(findTestObject('Auth/Login/TC.009'))
	}

	@And("Admin input HTTP Body AA4")
	def inputValidDataAA4() {
		println ("Input day")
	}

	@And("Admin click button Test Request AA4")
	def clickButtonAA4() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed AA4")
	def verifystatusCodeAA4() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
}