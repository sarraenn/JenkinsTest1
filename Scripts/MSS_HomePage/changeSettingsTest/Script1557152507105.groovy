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

WebUI.navigateToUrl('https://qualif.authentification-entreprise.orange-business.com/authentification?TYPE=33554433&REALMOID=06-0003a11b-6947-1023-a1e9-7a6a0a63d064&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=gHvljL28RTfy5PzVgt3KAzaypkl7mUXvKZ7X9lWsdk5CylNYAMZUemCDdkXGmAYn&TARGET=-SM-https%3a%2f%2fmy--service--space--uat%2eorange--business%2ecom%2fwacsmss%2fgroup%2fmssportal%2fhome&codeContexte=MSS')

WebUI.setText(findTestObject('Object Repository/mss_LoginPageObjects/Page_Authentication B2B/input_Login_user'), 'mss_uat_tst_smile_marc')

WebUI.setEncryptedText(findTestObject('Object Repository/mss_LoginPageObjects/Page_Authentication B2B/input_Password_pwd'),
	'ijdvIsWMz78SLKul36eVLbCn/PuUMCA6cHe61FHJLWM=')

WebUI.click(findTestObject('Object Repository/mss_LoginPageObjects/Page_Authentication B2B/button_Sign in'))


WebUI.waitForElementVisible(findTestObject('Page_MyServiceSpace/img_mumu_asset-small-image'), 5)

WebUI.click(findTestObject('Page_MyServiceSpace/span_Change your settings'))


WebUI.closeBrowser()


