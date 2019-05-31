package com.packLogin1
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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


class TestLogin1Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to gitHub login page")
	def I_navigate_to_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://github.com/')
		WebUI.click(findTestObject('Object Repository/TestLogin1Objects/Page_The worlds leading software development platform  GitHub/a_Signin'))
	}

	@When("I inter my username (.*) and password (.*)")
	def I_inter_password_and_logn(String userName, String password) {
		//println "username is: "+userName+", password is: "+password
		WebUI.setText(findTestObject('Object Repository/TestLogin1Objects/Page_Sign in to GitHub  GitHub/input_Username or email address_login'),
				userName)
		WebUI.setText(findTestObject('Object Repository/TestLogin1Objects/Page_Sign in to GitHub  GitHub/input_Forgot password_password'),
				password)
	}

	@When("I click on the login button")
	def I_Click_on_Login_Button() {
		WebUI.click(findTestObject('Object Repository/TestLogin1Objects/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))
		WebUI.click(findTestObject('Object Repository/TestLogin1Objects/Page_Sign in to GitHub  GitHub/div_Incorrect username or password'))
	}

	@Then("an error message is displayed on the page")
	def An_Error_Msg_Displayed() {
		WebUI.verifyTextPresent('Incorrect username or password.', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.closeBrowser()
	}
}