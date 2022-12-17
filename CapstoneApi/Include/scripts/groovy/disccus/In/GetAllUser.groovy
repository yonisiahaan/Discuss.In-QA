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



class GetAllUser {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to GET BC1")
	def SetValidBC1() {
		println ("Set method GET")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/users?page=1 BC1")
	def SetValidURLBC1() {
		println ("http://35.78.120.202/api/v1/users?page=1 ")
		response = WS.sendRequest(findTestObject('Manage User/GetAllUser/TC.001'))
	}

	@And("Admin click button Test Request BC1")
	def clickButtonBC1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 200 OK BC1")
	def verifystatusCodeBC1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode200)
	}

	//@GetAllUser
	//Admin Get All User with invalid method request
	@Given("Admin Set method to POST BC2")
	def SetValidBC2() {
		println ("Set method POST")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/users?page=1 BC2")
	def SetValidURLBC2() {
		println ("http://35.78.120.202/api/v1/users?page=1 ")
		response = WS.sendRequest(findTestObject('Manage User/GetAllUser/TC.002'))
	}

	@And("Admin click button Test Request BC2")
	def clickButtonBC2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed BC2")
	def verifystatusCodeBC2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
}