package com.login.mss
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


class LoginValidSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to mss login page")
	def I_navigate_to_mss_loginpage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://qualif.authentification-entreprise.orange-business.com/authentification?TYPE=33554433&REALMOID=06-0003a11b-6947-1023-a1e9-7a6a0a63d064&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=gHvljL28RTfy5PzVgt3KAzaypkl7mUXvKZ7X9lWsdk5CylNYAMZUemCDdkXGmAYn&TARGET=-SM-https%3a%2f%2fmy--service--space--uat%2eorange--business%2ecom%2fwacsmss%2fgroup%2fmssportal%2fhome&codeContexte=MSS')
	}

	@When("I inter mss username (.*) and password (.*)")
	def I_inter_mss_password_login(String userName, String password) {
		WebUI.setText(findTestObject('Object Repository/mss_LoginPageObjects/Page_Authentication B2B/input_Login_user'), userName)
		WebUI.setEncryptedText(findTestObject('Object Repository/mss_LoginPageObjects/Page_Authentication B2B/input_Password_pwd'), password)
	}

	@When("I click on login button")
	def I_Click_on_the_Login_Button() {
		WebUI.click(findTestObject('Object Repository/mss_LoginPageObjects/Page_Authentication B2B/button_Sign in'))
	}

	@Then("am on the home page")
	def am_on_homePage() {
		WebUI.waitForElementVisible(findTestObject('Page_MyServiceSpace/img_mumu_asset-small-image'), 5)
		WebUI.closeBrowser()
	}
}