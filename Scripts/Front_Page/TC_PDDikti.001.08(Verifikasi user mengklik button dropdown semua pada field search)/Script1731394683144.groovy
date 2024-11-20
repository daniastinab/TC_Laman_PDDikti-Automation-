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

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/img'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/img'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/img'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/li_Perguruan Tinggi'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/img'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/li_Program Studi'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/div_Program Studi_grid place-items-center a_0bbc38'))

WebUI.doubleClick(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/li_Dosen'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/div_Program Studi_grid place-items-center a_0bbc38'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/li_Mahasiswa'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/div_Mahasiswa'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/button_Mahasiswa'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/button_Mahasiswa'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.08/Page_PDDikti/div_Mahasiswa'))

WebUI.takeFullPageScreenshot([])

WebUI.closeBrowser()

