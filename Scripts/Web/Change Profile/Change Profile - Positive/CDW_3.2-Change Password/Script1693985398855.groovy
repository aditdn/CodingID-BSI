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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk untuk dapatkan akses di Coding.ID/input_Email_email'), 'dwinugrahaaditya29@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk untuk dapatkan akses di Coding.ID/input_Kata                                 _98da12'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.click(findTestObject('Object Repository/Page_Masuk untuk dapatkan akses di Coding.ID/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/i_Kontak_fas fa-user-alt'))

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/span_Profil'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/a_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Coding.ID - Dashboard/input_Old Password_current_password'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Coding.ID - Dashboard/input_New Password_password'), 'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Coding.ID - Dashboard/input_Confirmation Password_password_confirmation'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/button_OK'))

WebUI.closeBrowser()

