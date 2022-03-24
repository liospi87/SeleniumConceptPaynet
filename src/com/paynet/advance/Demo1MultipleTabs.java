package com.paynet.advance;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1MultipleTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium Training\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver is a parent driver for all drivers
		WebDriver driver=new EdgeDriver();
		
		//add synchronization process to conditional wait to click. -- Implicit Wait
		//wait only for find element wait for 30 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Construct your own xpath don't copy from the page.
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		driver.findElement(By.name("session_key")).sendKeys("liospi@gmail.com");
		
		driver.findElement(By.name("session_password")).sendKeys("P@ssw0rd");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//driver.close();--closes the latest current window only.
		//driver.quit(); -- closes all windows
		
		//System.out.println(windows);
		
		
		
		
		

	}

}
