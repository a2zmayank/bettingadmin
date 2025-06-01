package udda;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
	        System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        
	        // Maximize the browser
	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
	        String expectedTitle = "GeeksforGeeks | Your All-in-One Learning Portal";
	        String ActualTitle= driver.getTitle();
	        //Assert.assertEquals(ActualTitle,expectedTitle);
	        
	        if(ActualTitle.equalsIgnoreCase(expectedTitle)) {
	        	System.out.println("Title is Correct");
	        }
	        else {
	        	System.out.println("Title is not Correct");
	        }
	       // driver.findElement(By.linkText("Full Stack Live Classes")).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	      //  js.executeScript("window.scrollBy(0, 3000)");
	        
	        Actions ac = new Actions(driver);
	        ac.moveToElement(driver.findElement(By.className("headerMainListItem"))).perform();
	        WebDriverWait wait= new WebDriverWait(driver, 20);
	       WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("headerMainListItem")));
	        ele.click();
	        // Quit 
	        driver.quit();
	       
	    }

	}

}
