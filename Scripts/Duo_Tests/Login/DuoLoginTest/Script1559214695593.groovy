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

WebUI.navigateToUrl('http://qa.duo2.equant.com:8080/duogui/login')

WebUI.setText(findTestObject('Object Repository/DUO_Objects/Page_DUO - authentication/input_login_username'), 'ennaji_sarra')

WebUI.setEncryptedText(findTestObject('Object Repository/DUO_Objects/Page_DUO - authentication/input_password_password'), 
    '7mnmRefT4ZxmosrRm8+tig==')

WebUI.click(findTestObject('Object Repository/DUO_Objects/Page_DUO - authentication/button_sign in'))

WebUI.getUrl()

println(WebUI.getUrl())

WebUI.closeBrowser()

