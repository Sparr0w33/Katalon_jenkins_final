import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Common/GoToUrl'), [('url') : GlobalVariable.homeUrl + '?controller=addresses'])




addButton = WebUI.callTestCase(findTestCase('Common/FindAddress'), [('alias') : alias], null)


if (!addButton) {
	

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__firstname'), firstname)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__lastname'), lastname)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input_Company_company'), company)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1'), address)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city'), city)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), state, 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__postcode'), postcode)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone_mobile'), phone_mobile)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__alias'), alias)

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/button_Save'))
}
