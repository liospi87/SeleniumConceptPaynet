package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium Training\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver is a parent driver for all drivers
		WebDriver driver=new EdgeDriver();
		
		//add synchronization process to conditional wait to click. -- Implicit Wait
		//wait only for find element wait for 30 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

		driver.findElement(By.xpath("//img[@alt='Go']")).click();

		String alertText= driver.switchTo().alert().getText();

		System.out.println(alertText);
		

	    driver.switchTo().alert().accept();


		// TODO Auto-generated method stub

	}

}
