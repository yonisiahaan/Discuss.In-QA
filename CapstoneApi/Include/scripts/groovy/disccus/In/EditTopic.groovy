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



class EditTopic {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Admin Set method to PUT BI1")
	def SetValidBI1() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI1")
	def SetValidURLBI1() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.001'))
	}

	@And("Admin Input HTTP Body BI1")
	def InputValidDataBI1() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI1")
	def clickButtonBI1() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 201 Editd BI1")
	def verifystatusCodeBI1() {
		println ("Show the verify result 201 Editd")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode201)
	}
	
	//EditTopic.BI2
	// Edit topic using blank description and invalid ID
	
	@Given("Admin Set method to PUT BI2")
	def SetValidBI2() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI2")
	def SetValidURLBI2() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.002'))
	}

	@And("Admin Input HTTP Body BI2")
	def InputValidDataBI2() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI2")
	def clickButtonBI2() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BI2")
	def verifystatusCodeBI2() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//EditTopic.BI3
	//Edit topic with Input invalid description and valid id
	
	@Given("Admin Set method to PUT BI3")
	def SetValidBI3() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI3")
	def SetValidURLBI3() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.003'))
	}

	@And("Admin Input HTTP Body BI3")
	def InputValidDataBI3() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI3")
	def clickButtonBI3() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BI3")
	def verifystatusCodeBI3() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode404)
	}
	
	//EditTopic.BI4
	//Edit topic with valid description and empty ID
	
	@Given("Admin Set method to PUT BI4")
	def SetValidBI4() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI4")
	def SetValidURLBI4() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.004'))
	}

	@And("Admin Input HTTP Body BI4")
	def InputValidDataBI4() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI4")
	def clickButtonBI4() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BI4")
	def verifystatusCodeBI4() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//EditTopic.BI5
	//Edit topic with input blank description and ID
	
	@Given("Admin Set method to PUT BI5")
	def SetValidBI5() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI5")
	def SetValidURLBI5() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.005'))
	}

	@And("Admin Input HTTP Body BI5")
	def InputValidDataBI5() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI5")
	def clickButtonBI5() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BI5")
	def verifystatusCodeBI5() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//EditTopic.BI6
	//Edit topic with valid description and invalid ID
	
	@Given("Admin Set method to PUT BI6")
	def SetValidBI6() {
		println ("Set method PUT")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI6")
	def SetValidURLBI6() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.006'))
	}

	@And("Admin Input HTTP Body BI6")
	def InputValidDataBI6() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI6")
	def clickButtonBI6() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 400 Bad Request BI6")
	def verifystatusCodeBI6() {
		println ("Show the verify result 400 bad request ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode400)
	}
	
	//EditTopic.BI7
	//Edit topic using invalid method request
	
	@Given("Admin Set method to POST BI7")
	def SetValidBI7() {
		println ("Set method POST")
	}

	@When("Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI7")
	def SetValidURLBI7() {
		println ("http://35.78.120.202/api/v1/topics/edit_description/1/ ")
		response = WS.sendRequest(findTestObject('Managen Tread/Topics/Edit/TC.007'))
	}

	@And("Admin Input HTTP Body BI7")
	def InputValidDataBI7() {
		println ("Input name and description")
	}

	@And("Admin click button Test Request BI7")
	def clickButtonBI7() {
		println ("Admin click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed BI7")
	def verifystatusCodeBI7() {
		println ("Show the verify result 405 Method Not Allowed ")
		WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode405)
	}
}

