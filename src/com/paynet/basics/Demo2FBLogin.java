package com.paynet.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium Training\\edgedriver_win64\\msedgedriver.exe");
		
		//Wedriver is parent of all the drivers use this infront standard.
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();

	}

}
