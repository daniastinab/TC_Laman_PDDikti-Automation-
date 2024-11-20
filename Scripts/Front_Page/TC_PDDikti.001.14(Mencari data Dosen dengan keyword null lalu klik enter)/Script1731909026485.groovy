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

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.12/Page_PDDikti/img'))

WebUI.click(findTestObject('Object Repository/TC_PDDikti.001.12/Page_PDDikti/li_Dosen'))

WebUI.comment('No reCAPTCHA detected; proceeding with regular search')

WebUI.setText(findTestObject('Object Repository/TC_PDDikti.001.12/Page_PDDikti/input_Dosen_w-full outline-none mdtext-base_67616a'), 
        '')

WebUI.sendKeys(findTestObject('Object Repository/TC_PDDikti.001.12/Page_PDDikti/input_Dosen_w-full outline-none mdtext-base_67616a'), 
        Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

