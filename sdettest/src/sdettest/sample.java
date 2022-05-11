package sdettest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) 
	{
		// to launch  the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JK arts\\Downloads\\chromedriver.exe");
	
	     WebDriver driver=new ChromeDriver();
         //Implicitly wait()

   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
          //open application
           driver.get("https://www.saucedemo.com/");
           
           driver.manage().window().maximize();
           
           //user name textbox
     		driver.findElement(By.id("user-name")).sendKeys("standard_user");
     		
     		//Password
     		driver.findElement(By.name("password")).sendKeys("secret_sauce");
     		
     		//Login button
     		driver.findElement(By.id("login-button")).click();
	
	
	}

}
