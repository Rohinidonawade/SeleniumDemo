package com.demoAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.BaseTest;

public class PracticeForm extends BaseTest{

	public void checkPracticeFormDetails() {
		
		getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rohini");
		getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys("Donawade");
		getDriver().findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Rohini@gmail.com");
		
		if(getDriver().equals("Female"))
			getDriver().findElement(By.xpath("//input[@id='gender-radio-2']")).click();
		else if(getDriver().equals("Male"))			
			getDriver().findElement(By.xpath("//input[@id='gender-radio-1']")).click();
		
			
		getDriver().findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7353875647");
		getDriver().findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("04 Jan 2001");
		getDriver().findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[2]")).sendKeys("Eng Maths Sci");





	}
	

}
