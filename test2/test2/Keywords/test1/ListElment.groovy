package test1

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.assertArrayEquals

import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ListElment {
	@Keyword
	def listelement() {
		//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers');
		ArrayList<String> listelement = new ArrayList<String>()

		String adminElement = WebUI.getText(findTestObject('Page_OrangeHRM/b_Admin'))

		String LeaveElement = WebUI.getText(findTestObject('Page_OrangeHRM/b_Leave'))

		String pimElement = WebUI.getText(findTestObject('Page_OrangeHRM/b_PIM'))

		listelement.add(adminElement)

		listelement.add(LeaveElement)

		listelement.add(pimElement)

		println(listelement)

		//Assert.assertEquals('Admin', adminElement)

		ArrayList<String> listKyTu = new ArrayList<String>()

		listKyTu.add('Admin')

		listKyTu.add('Leave')

		listKyTu.add('PIM')

		Assert.assertEquals(listKyTu, listelement)
	}
}
