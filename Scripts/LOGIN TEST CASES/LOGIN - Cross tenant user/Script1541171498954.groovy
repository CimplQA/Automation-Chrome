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

WebUI.openBrowser('http://turtlewebq1.turtle.local/cimpl-maintenance/')

WebUI.click(findTestObject('Maintenanace/Page_Cimpl/span_select_Language_Drop_down', [('variable') : 'English', ('variable_0') : 'French'
            , ('variable_1') : 'Anglais', ('variable_2') : 'Français']))

WebUI.setText(findTestObject('Maintenanace/Page_Cimpl/input_English_cimpl-text-box'), 'kailash.venkatjakkala@cimpl.com')

WebUI.setMaskedText(findTestObject('Maintenanace/Page_Cimpl/input_English_cimpl-text-box -Password'), 'Ktest1234!')

WebUI.click(findTestObject('Maintenanace/Page_Cimpl/span_Sign In'))

