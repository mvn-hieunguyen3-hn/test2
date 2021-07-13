import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.lang.model.element.Element as Element
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.VerifyElementAttributeValueKeyword as VerifyElementAttributeValueKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.jna.platform.win32.DBT.DEV_BROADCAST_DEVICEINTERFACE as DEV_BROADCAST_DEVICEINTERFACE
import groovy.beans.ListenerList as ListenerList
import internal.GlobalVariable as GlobalVariable
import junit.framework.Assert as Assert
import org.eclipse.jdt.internal.compiler.ast.ForeachStatement as ForeachStatement
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebElement as Keys

WebUI.callTestCase(findTestCase('Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

ArrayList<Element> listelement = new ArrayList<Element>()

String adminElement = WebUI.getText(findTestObject('Page_OrangeHRM/b_Admin'))

String LeaveElement = WebUI.getText(findTestObject('Page_OrangeHRM/b_Leave'))

String pimElement = WebUI.getText(findTestObject('Page_OrangeHRM/b_PIM'))

listelement.add(adminElement)

listelement.add(LeaveElement)

listelement.add(pimElement)

println(listelement)

//Assert.assertEquals('Admin', adminElement)

ArrayList<Element> listKyTu = new ArrayList<Element>()

listKyTu.add('Admin')

listKyTu.add('Leave')

listKyTu.add('PIM')

//Assert.assertEquals(listKyTu, listelement)
org.testng.Assert.assertEquals(listKyTu, listelement)

