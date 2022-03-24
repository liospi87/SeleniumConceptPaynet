package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4FBRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium Training\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//add synchronization process to conditional wait to click. -- Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Crystal");
		driver.findElement(By.name("lastname")).sendKeys("Shivani");
		driver.findElement(By.name("reg)email__")).sendKeys("crystal@paynet.my");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();

	}

}
