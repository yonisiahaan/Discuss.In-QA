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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to POST AB1")
	def SetValidAB1() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/register AB1")
	def SetValidURLAB1() {
		println ("http://35.78.120.202/api/v1/users/register ")
		response = WS.sendRequest(findTestObject('Auth/Register/TC.001'))
	}

	@And("Admin Input HTTP Body AB1")
	def InputValidDataAB1() {
		println ("Input day")
	}

	@And("Admin click button Test Request AB1")
	def clickButtonAB1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 201 Created AB1")
	def verifystatusCodeAB1() {
		println ("Show the verify result 201 Created")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode201)
	}
	
	//Register.AB2
	// Register with invalid email, valid password and  username
	@Given("Admin Set method to POST AB2")
	def SetValidAB2() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/register AB2")
	def SetValidURLAB2() {
		println ("http://35.78.120.202/api/v1/users/register ")
		response = WS.sendRequest(findTestObject('Auth/Register/TC.002'))
	}

	@And("Admin Input HTTP Body AB2")
	def InputValidDataAB2() {
		println ("Input day")
	}

	@And("Admin click button Test Request AB2")
	def clickButtonAB2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 419 Conflict AB2")
	def verifystatusCodeAB2() {
		println ("Show the verify result 419 Conflict")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode409)
	}
	
	//Register.AB3
	// Register with input invalid password, valid email and username
	@Given("Admin Set method to POST AB3")
	def SetValidAB3() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/register AB3")
	def SetValidURLAB3() {
		println ("http://35.78.120.202/api/v1/users/register ")
		response = WS.sendRequest(findTestObject('Auth/Register/TC.004'))
	}

	@And("Admin Input HTTP Body AB3")
	def InputValidDataAB3() {
		println ("Input day")
	}

	@And("Admin click button Test Request AB3")
	def clickButtonAB3() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request AB3")
	def verifystatusCodeAB3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//Register.AB4
	// Register with valid email, valid password and invalid username
	@Given("Admin Set method to POST AB4")
	def SetValidAB4() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/register AB4")
	def SetValidURLAB4() {
		println ("http://35.78.120.202/api/v1/users/register ")
		response = WS.sendRequest(findTestObject('Auth/Register/TC.005'))
	}

	@And("Admin Input HTTP Body AB4")
	def InputValidDataAB4() {
		println ("Input day")
	}

	@And("Admin click button Test Request AB4")
	def clickButtonAB4() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 415 Unsuspported Media Type AB4")
	def verifystatusCodeAB4() {
		println ("Show the verify result 415 Unsuspported Media Type")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode415)
	}
	
	//Register.AB5
	// Register with invalid method request
	@Given("Admin Set method to PUT AB5")
	def SetValidAB5() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/users/register AB5")
	def SetValidURLAB5() {
		println ("http://35.78.120.202/api/v1/users/register ")
		response = WS.sendRequest(findTestObject('Auth/Register/TC.015'))
	}

	@And("Admin Input HTTP Body AB5")
	def InputValidDataAB5() {
		println ("Input day")
	}

	@And("Admin click button Test Request AB5")
	def clickButtonAB5() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Bad Request AB5")
	def verifystatusCodeAB5() {
		println ("Show the verify result 405 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
}