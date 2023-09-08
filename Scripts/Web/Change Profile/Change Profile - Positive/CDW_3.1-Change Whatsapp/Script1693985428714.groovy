import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Homepage fix/Page_Be a Profressional Talent with Coding.ID/Btn_icon profile fix'))

WebUI.click(findTestObject('Homepage/Homepage fix/Page_Be a Profressional Talent with Coding.ID/Btn_My account fix'))

WebUI.click(findTestObject('Profil page/Page_Coding.ID - Dashboard/Btn_profile fix'))

WebUI.click(findTestObject('Profil page/Page_Coding.ID - Dashboard/Btn_Edit Profile fix'))

WebUI.setText(findTestObject('Profil page/Page_Coding.ID - Dashboard/Field_Phone fix'), '612345678911')

WebUI.click(findTestObject('Profil page/Page_Coding.ID - Dashboard/Btn_Save Changes fix'))

WebUI.verifyElementText(findTestObject('Edit profile page/Page_Coding.ID - Dashboard/Text_Berhasil fix'), 'Berhasil')

WebUI.closeBrowser()

