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



class DeleteTopicTopic {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to DETELE FF1")
	def SetValidFF1() {
		println ("Set method DELETE")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/topics/delete/72 FF1")
	def SetValidURLFF1() {
		println ("http://35.78.120.202/api/v1/topics/delete/72 ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Delete/TC.001'))
	}

	@And("Admin click button Test Request FF1")
	def clickButtonFF1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 200 OK FF1")
	def verifystatusCodeFF1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode200)
	}

	//@DeleteTopic.FF2
	//Detele user with invalid id

	@Given("Admin Set method to DETELE FF2")
	def SetValidFF2() {
		println ("Set method DELETE")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/topics/delete/1 FF2")
	def SetValidURLFF2() {
		println ("http://35.78.120.202/api/v1/topics/delete/1 ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Delete/TC.002'))
	}

	@And("Admin click button Test Request FF2")
	def clickButtonFF2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 404 Not Found FF2")
	def verifystatusCodeFF2() {
		println ("Show the verify result 404 Not Found")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode404)
	}

	//@DeleteTopic.FF3
	//DeleteTopic user with invalid method request
	@Given("Admin Set method to PUT FF3")
	def SetValidFF3() {
		println ("Set method PUT")
	}

	@When(" Admin Set URL http://35.78.120.202/api/v1/topics/delete/1 FF3")
	def SetValidURLFF3() {
		println ("http://35.78.120.202/api/v1/topics/delete/1 ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Delete/TC.003'))
	}

	@And("Admin click button Test Request FF3")
	def clickButtonFF3() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed FF3")
	def verifystatusCodeFF3() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
}