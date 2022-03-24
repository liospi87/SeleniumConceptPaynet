package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo5Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium Training\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver is a parent driver for all drivers
		WebDriver driver=new EdgeDriver();
		
		//add synchronization process to conditional wait to click. -- Implicit Wait
		//wait only for find element wait for 30 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///D:/Selenium%20Training/zdemo_html/Demo1.html");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Demo2.html']")));
		
		driver.findElement(By.linkText("Google")).click();
		
		driver.switchTo().defaultContent();


	}

}
