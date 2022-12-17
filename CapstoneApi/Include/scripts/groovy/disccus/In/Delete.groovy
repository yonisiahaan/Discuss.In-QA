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



class Delete {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to DETELE BB1")
	def SetValidBB1() {
		println ("Set method PUT")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/users/1/ BB1")
	def SetValidURLBB1() {
		println ("http://35.78.120.202/api/v1/users/1/ ")
		response = WS.sendRequest(findTestObject('Manage User/Delete/TC.001'))
	}

	@And("Admin click button Test Request BB1")
	def clickButtonBB1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 201 Created BB1")
	def verifystatusCodeBB1() {
		println ("Show the verify result 201 Created")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode201)
	}

	//@Delete.BB2
	//Detele user with invalid id

	@Given("Admin Set method to DETELE BB2")
	def SetValidBB2() {
		println ("Set method PUT")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/users/1/ BB2")
	def SetValidURLBB2() {
		println ("http://35.78.120.202/api/v1/users/1/ ")
		response = WS.sendRequest(findTestObject('Manage User/Delete/TC.002'))
	}

	@And("Admin click button Test Request BB2")
	def clickButtonBB2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 404 Not Found BB2")
	def verifystatusCodeBB2() {
		println ("Show the verify result 404 Not Found")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode404)
	}

	//@Delete.BB3
	//Delete user with invalid method request
	@Given("Admin Set method to PUT BB3")
	def SetValidBB3() {
		println ("Set method PUT")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/users/1/ BB3")
	def SetValidURLBB3() {
		println ("http://35.78.120.202/api/v1/users/1/ ")
		response = WS.sendRequest(findTestObject('Manage User/Delete/TC.003'))
	}

	@And("Admin click button Test Request BB3")
	def clickButtonBB3() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed BB3")
	def verifystatusCodeBB3() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}

}