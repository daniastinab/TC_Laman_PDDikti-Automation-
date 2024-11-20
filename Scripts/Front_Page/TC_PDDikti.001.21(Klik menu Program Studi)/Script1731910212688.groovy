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

WebUI.navigateToUrl('https://pddikti.kemdikbud.go.id/')

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.21/Page_PDDikti/div_Semua_flex justify-center items-center mb-2'))

WebUI.verifyElementVisible(findTestObject('TC_PDDikti.001.21/Page_PDDikti/div_AgamaTotal Lulusan Mahasiswa 959.458Persentase Lulusan 46,20Lihat Program StudiEkonomiTotal Lulusan Mahasiswa 8.679.120Persentase Lulusan 52,52Lihat Program StudiHumanioraTotal Lulusan Mahasiswa 946.932Persentase Lul'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

