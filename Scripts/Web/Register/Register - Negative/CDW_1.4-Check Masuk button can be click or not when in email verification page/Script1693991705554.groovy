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

WebUI.click(findTestObject('Homepage/Btn_buat akun'))

WebUI.setText(findTestObject('Buat akun page/Field_nama'), 'test123')

WebUI.setText(findTestObject('Buat akun page/Field_tanggal lahir'), '29-Mar-1997')

WebUI.setText(findTestObject('Buat akun page/Field_E-Mail'), 'contoh@mail.com')

WebUI.setText(findTestObject('Buat akun page/Field_Whatsapp'), '1234567889')

WebUI.setEncryptedText(findTestObject('Buat akun page/Field_Kata Sandi'), 'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.setEncryptedText(findTestObject('Buat akun page/Field_Konfirmasi kata sandi'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.click(findTestObject('Buat akun page/Checkbox_Daftar'))

WebUI.click(findTestObject('Buat akun page/Btn_Daftar'))

WebUI.click(findTestObject('Object Repository/Homepage/icon_Coding ID'))

WebUI.click(findTestObject('Homepage/Btn_Masuk'))

WebUI.verifyElementText(findTestObject('Page_Masuk untuk dapatkan akses di Coding.ID/text_Masuk_Masuk page'), 'Masuk')

WebUI.closeBrowser()

