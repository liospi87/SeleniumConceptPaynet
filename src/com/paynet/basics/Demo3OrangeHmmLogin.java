package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3OrangeHmmLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium Training\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver is a parent driver for all drivers
		WebDriver driver=new EdgeDriver();
		
		//add synchronization process to conditional wait to click. -- Implicit Wait
		//wait only for find element wait for 30 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Crystal");
		driver.findElement(By.name("middleName")).sendKeys("Shivani");
		driver.findElement(By.name("lastName")).sendKeys("Dhanaraj");
		driver.findElement(By.name("employeeId")).sendKeys("12345");
		driver.findElement(By.name("chkLogin")).click();
		driver.findElement(By.name("user_name")).sendKeys("Crystal");
		driver.findElement(By.name("user_password")).sendKeys("P@ssw0rd");
		driver.findElement(By.name("re_password")).sendKeys("P@ssw0rd");
		
		driver.findElement(By.name("status")).click();
		driver.findElement(By.xpath("//input[@value= 'Disabled']")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		
		//print the url
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		
		//click on welcome
		driver.findElement(By.id("welcome")).click();
		
		//add synchronization process to unconditional wait to click.
		Thread.sleep(5000); 
		//-- coming from java but not recommended.
		
		
		
		
		
		//click on logout
		driver.findElement(By.linkText("Logout")).click();
		
		
		//driver.quit();
		// TODO Auto-generated method stub

	}


}
