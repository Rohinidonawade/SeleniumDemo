package com.demoAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DemoPage extends BaseTest{

	public void getTextBoxDetails() {
		getDriver().findElement(By.xpath("//input[@id='userName']")).sendKeys("Kalpana Chaula");
		getDriver().findElement(By.id("userEmail")).sendKeys("Kalpana@gmail.com");
		getDriver().findElement(By.id("currentAddress")).sendKeys("A/p:Ingali, Tq:Chikkodi, Dist:Belgaum");
		getDriver().findElement(By.id("permanentAddress")).sendKeys("A/p:Ingali, Tq:Chikkodi, Dist:Belgaum");
	//	getDriver().findElement(By.xpath("//button[@id='submit']")).click();
		getDriver().findElement(By.xpath("//span[@class='text']")).click();
		getDriver().close();
		
	    }
	
	public void clickSVGIcon() {
		getDriver().findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();	
	}
	
	public void checkDesktop() {
		getDriver().findElement(By.xpath("//input[@id='tree-node-desktop']/parent::label/span[@class='rct-checkbox']")).click();
	}
		
	public void verifyCheckBox() {
		WebElement checkBox = getDriver().findElement(By.xpath("//input[@id='tree-node-desktop']/parent::label/span[@class='rct-checkbox']"));
          System.out.println(checkBox.isSelected());
          
          if(checkBox.isSelected())
        	  System.out.println("Selected");
          else
        	  System.out.println("is not selected");
	}
	
	public void checkDocuments() {
		getDriver().findElement(By.xpath("//input[@id='tree-node-documents']/parent::label/span[@class='rct-checkbox']")).click();
	}
	
	public void checkDownloads() {
		getDriver().findElement(By.xpath("//input[@id='tree-node-downloads']/parent::label/span[@class='rct-checkbox']")).click();
	}
	
	public void checkRadioButton() {
		WebElement radiElement=getDriver().findElement(By.id("yesRadio"));
		radiElement.click();
		System.out.println("selected");
	}
		
	public void webTableDetails() {
	
		WebElement e = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
		e.click();
		e.clear();
//		e.sendKeys("Rani");
	}
	
	public void checkDoubleClickButtons() {
		Actions action = new Actions(getDriver());
		
		WebElement element = getDriver().findElement(By.xpath("//button[@id='doubleClickBtn']"));
        action.doubleClick(element).perform();		
	}
	
	public void checkRightClickMeInClickButtons() {
        Actions action = new Actions(getDriver());
		
		WebElement element = getDriver().findElement(By.xpath("//button[@id='rightClickBtn']"));
        action.contextClick(element).perform();		
	}
	public void checkClickMeInClickButtons() {
        Actions action = new Actions(getDriver());
		
		WebElement element = getDriver().findElement(By.xpath("//button[@id='ffrYB']"));
        action.click().perform();		
	}	
	
/*	public void getLinks() {
		getDriver().findElement(By.xpath("//a[@id='simpleLink']")).click();
	}   */
	
	public void checkImages() {
		WebElement element = getDriver().findElement(By.tagName("img"));
		element.getSize();
		System.out.println(element.getSize());		
	}
	
	public void checkDownload() {
		getDriver().findElement(By.xpath("//a[@id='downloadButton']")).click();
	}
	
	public void checkUploadFile() {
		getDriver().findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\rohin\\OneDrive\\Desktop\\Demo.txt");
		
	}
	
	public void checkDynamicProperty() {
		getDriver().findElement(By.xpath("//button[@id='enableAfter']")).click();	
		getDriver().findElement(By.xpath("//button[@id='colorChange']")).click();
		getDriver().findElement(By.xpath("//button[@id='visibleAfter']")).click();

	}
	
	
	
	}
	
	

