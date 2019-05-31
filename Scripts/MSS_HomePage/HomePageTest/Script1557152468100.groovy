import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qualif.authentification-entreprise.orange-business.com/authentification?TYPE=33554433&REALMOID=06-0003a11b-6947-1023-a1e9-7a6a0a63d064&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=gHvljL28RTfy5PzVgt3KAzaypkl7mUXvKZ7X9lWsdk5CylNYAMZUemCDdkXGmAYn&TARGET=-SM-https%3a%2f%2fmy--service--space--uat%2eorange--business%2ecom%2fwacsmss%2fgroup%2fmssportal%2fhome&codeContexte=MSS')

WebUI.setText(findTestObject('Object Repository/HomePageObjects/Page_Authentication B2B/input_Login_user'), 'mss_uat_tst_smile_marc')

WebUI.setEncryptedText(findTestObject('Object Repository/HomePageObjects/Page_Authentication B2B/input_Password_pwd'), 'ijdvIsWMz78SLKul36eVLbCn/PuUMCA6cHe61FHJLWM=')

WebUI.click(findTestObject('Object Repository/HomePageObjects/Page_Authentication B2B/button_Sign in'))

WebUI.waitForElementVisible(findTestObject('Page_MyServiceSpace/img_mumu_asset-small-image'), 5)

WebUI.verifyTextPresent('Notifications', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/a_Solutions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/a_Reporting'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/a_Ordering'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/h3_Notifications'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/span_Change your settings'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/a_See all notifications'), 0)

WebUI.verifyTextPresent('Welcome Marc!', false)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/span_Marc Dupont'), 0)

WebUI.verifyTextPresent('Your personal bookmarks', false)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/a_Orange Team'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/h2_Whats new on Orange Business Services'), 0)

WebUI.verifyElementVisible(findTestObject('Page_MyServiceSpace/img_evolution SP18_asset-small-image'))

WebUI.verifyElementVisible(findTestObject('Page_MyServiceSpace/img_mumu_asset-small-image'))

WebUI.verifyElementPresent(findTestObject('Page_MyServiceSpace/a_View'), 0)

WebUI.verifyElementClickable(findTestObject('Page_MyServiceSpace/a_View'))

WebUI.click(findTestObject('Page_MyServiceSpace/h6_1 Mar 2019'))

WebUI.click(findTestObject('Page_MyServiceSpace/a_Home'))

WebUI.click(findTestObject('Page_MyServiceSpace/a_See all notifications'))

WebUI.click(findTestObject('Page_MyServiceSpace/a_Home'))

WebUI.click(findTestObject('Page_MyServiceSpace/span_Change your settings'))

WebUI.back()

WebUI.click(findTestObject('Page_MyServiceSpace/span_Marc Dupont'))

WebUI.mouseOver(findTestObject('Page_MyServiceSpace/h5_My Profile'))

WebUI.mouseOver(findTestObject('Page_MyServiceSpace/h5_Change password'))

WebUI.mouseOver(findTestObject('Page_MyServiceSpace/h5_Logout'))

WebUI.verifyElementClickable(findTestObject('Page_MyServiceSpace/h5_My Profile'))

WebUI.verifyElementClickable(findTestObject('Page_MyServiceSpace/h5_Change password'))

WebUI.verifyElementClickable(findTestObject('Page_MyServiceSpace/h5_Logout'))

//WebUI.verifyTextPresent('Welcome Marc!', false)
WebUI.closeBrowser()
