package com.AutomationJamal.demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB92927\\Desktop\\New folder\\2024\\Selenium Data\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://labprocess-uat.luxgroup.net/lpa-web/login.do");
		System.out.println("Test1 Tittle is --->> "+driver.getTitle());
		
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://labprocess-uat.luxgroup.net/lpa-web/login.do");
		System.out.println("Test2 Tittle is --->> "+driver.getTitle());
		
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://labprocess-uat.luxgroup.net/lpa-web/login.do");
		System.out.println("Test3 Tittle is --->> "+driver.getTitle());
		
	}

	@AfterMethod
	public void quit() {
		driver.quit();
		System.out.println("Browser closed successfully");
		System.out.println("Browser123 closed successfully");
	}
}
