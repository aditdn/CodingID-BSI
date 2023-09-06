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

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/button_Buat                                _86b528 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name (1)'), 'test123')

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Tanggal lahir_birth_date (1)'), 
    '29-Mar-2000')

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_E-Mail_email (1)'), 
    'contoh@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Whatsapp_whatsapp (1)'), 
    '1234567812345678')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Kata Sandi_password (1)'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Konfirmasi kata sandi_password_confirmation (1)'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.click(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Konfirmasi kata sandi_inlineCheckbox1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar (2)'))

WebUI.verifyElementText(findTestObject('Page_Coding.ID - Dashboard/Validation-The whatsapp must be between 10 and 12'), 
    'The whatsapp must be between 10 and 12 digits.')

WebUI.closeBrowser()

