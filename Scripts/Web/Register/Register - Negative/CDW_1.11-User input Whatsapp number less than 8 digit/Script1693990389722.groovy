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

WebUI.click(findTestObject('Page_Be a Profressional Talent with Coding.ID/Btn-Buat_Akun'))

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Field-Nama'), 'test123')

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Field-Tanggal lahir'), '29-Mar-1997')

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Field_E-Mail'), 'contoh@mail.com')

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Field-Whatsapp'), '123')

WebUI.setEncryptedText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Field-Kata Sandi'), 'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.setEncryptedText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Field-Konfirmasi kata sandi'), 'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.click(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/Checkbox-Daftar'))

WebUI.click(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar'))

WebUI.verifyElementText(findTestObject('Page_Coding.ID - Dashboard/Validation-The whatsapp must be between 10 and 12'), 
    'The whatsapp must be between 10 and 12 digits.')

WebUI.closeBrowser()

