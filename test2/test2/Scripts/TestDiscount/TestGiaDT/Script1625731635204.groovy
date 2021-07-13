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
import org.testng.Assert as Assert
import org.testng.Assert as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://live.demoguru99.com/')

WebUI.click(findTestObject('Object Repository/Page_Home page/a_Mobile'))

WebUI.click(findTestObject('Object Repository/Page_Mobile/img_Show_product-collection-image-1'))

String GiaChuaGiam = WebUI.getText(findTestObject('Guru99/100k'))

println(GiaChuaGiam)

WebUI.click(findTestObject('Object Repository/Page_Sony Xperia - Mobile/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/input_Discount Codes_coupon_code'))

WebUI.setText(findTestObject('Object Repository/Page_Shopping Cart/input_Discount Codes_coupon_code'), 'Guru50')

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Apply'))

String discount = WebUI.getText(findTestObject('Guru99/Disscount'))

StringBuilder discountAcc = new StringBuilder(discount)

discountAcc.delete(0, 2)

discountAcc.delete(1, 4)

println(discountAcc)

int discountExpect = (500 * 1) / 100

println(discountExpect)

Assert.assertEquals(String.valueOf(discountExpect), String.valueOf(discountAcc))

