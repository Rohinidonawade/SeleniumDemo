package com.demoAutomationTest;

import generic.BaseTest;

public class TestDemoPage extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		
		DemoPage objDemoPage = new DemoPage();
	//	objDemoPage.initilizeWebDriver("https://demoqa.com/text-box");
	//	objDemoPage.getTextBoxDetails();
		
	//    objDemoPage.initilizeWebDriver("https://demoqa.com/checkbox");
	//    objDemoPage.clickSVGIcon();
	//    objDemoPage.checkDesktop();
	//    objDemoPage.verifyCheckBox();
	//    objDemoPage.checkDocuments();
	//    objDemoPage.checkDownloads();
	    
	//    objDemoPage.initilizeWebDriver("https://demoqa.com/radio-button");
	//    objDemoPage.checkRadioButton();
		
	//	objDemoPage.initilizeWebDriver("https://demoqa.com/webtables");
	//	objDemoPage.webTableDetails();
		
	//	objDemoPage.initilizeWebDriver("https://demoqa.com/buttons");
	//	objDemoPage.checkDoubleClickButtons();
	//	Thread.sleep(2000);
	//	objDemoPage.checkRightClickMeInClickButtons();
	//	objDemoPage.checkClickMeInClickButtons();
		
	//	objDemoPage.initilizeWebDriver("https://demoqa.com/broken");
	//	objDemoPage.checkImages();
		
	//	objDemoPage.initilizeWebDriver("https://demoqa.com/upload-download");
	//	objDemoPage.checkDownload();
	//	objDemoPage.checkUploadFile();
		
	//	objDemoPage.initilizeWebDriver("https://demoqa.com/dynamic-properties");
	//	objDemoPage.checkDynamicProperty();
		
		
		PracticeForm objPracticeForm = new PracticeForm();
		objPracticeForm.initilizeWebDriver("https://demoqa.com/automation-practice-form");
		objPracticeForm.checkPracticeFormDetails();
	}

}
