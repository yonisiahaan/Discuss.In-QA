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



class CreateTopic {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to POST BG1")
	def SetValidBG1() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG1")
	def SetValidURLBG1() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.001'))
	}

	@And("Admin Input HTTP Body BG1")
	def InputValidDataBG1() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG1")
	def clickButtonBG1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 201 Created BG1")
	def verifystatusCodeBG1() {
		println ("Show the verify result 201 Created")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode201)
	}

	//CreateTopic.BG2
	//Create topic using invalid name and valid description
	
	@Given("Admin Set method to POST BG2")
	def SetValidBG2() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG2")
	def SetValidURLBG2() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.002'))
	}

	@And("Admin Input HTTP Body BG2")
	def InputValidDataBG2() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG2")
	def clickButtonBG2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 409 Conflict BG2")
	def verifystatusCodeBG2() {
		println ("Show the verify result 409 Conflict")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode409)
	}

	
	//CreateTopic.BG3
	//Create topic using valid name and invalid description
	
	@Given("Admin Set method to POST BG3")
	def SetValidBG3() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG3")
	def SetValidURLBG3() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.003'))
	}

	@And("Admin Input HTTP Body BG3")
	def InputValidDataBG3() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG3")
	def clickButtonBG3() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 201 Created BG3")
	def verifystatusCodeBG3() {
		println ("Show the verify result 201 Created")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode201)
	}
	
	//CreateTopic.BG4
	//Create topic using blank name and valid description
	
	@Given("Admin Set method to POST BG4")
	def SetValidBG4() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG4")
	def SetValidURLBG4() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.004'))
	}

	@And("Admin Input HTTP Body BG4")
	def InputValidDataBG4() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG4")
	def clickButtonBG4() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BG4")
	def verifystatusCodeBG4() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//CreateTopic.BG5
	//Create topic using valid name and balnk description
	
	@Given("Admin Set method to POST BG5")
	def SetValidBG5() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG5")
	def SetValidURLBG5() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.005'))
	}

	@And("Admin Input HTTP Body BG5")
	def InputValidDataBG5() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG5")
	def clickButtonBG5() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BG5")
	def verifystatusCodeBG5() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//CreateTopic.BG6
	//Create topic using invalid method request
	
	@Given("Admin Set method to PUT BG6")
	def SetValidBG6() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG6")
	def SetValidURLBG6() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.006'))
	}

	@And("Admin Input HTTP Body BG6")
	def InputValidDataBG6() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG6")
	def clickButtonBG6() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed BG6")
	def verifystatusCodeBG6() {
		println ("Show the verify result 405 Method Not Allowed ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
	
	//CreateTopic.BG7
	//Create topic using input blank name and description
	
	@Given("Admin Set method to POST BG7")
	def SetValidBG7() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG7")
	def SetValidURLBG7() {
		println ("http://35.78.120.202/api/v1/topics/create/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Create/TC.007'))
	}

	@And("Admin Input HTTP Body BG7")
	def InputValidDataBG7() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BG7")
	def clickButtonBG7() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BG7")
	def verifystatusCodeBG7() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
}
