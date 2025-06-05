package udda;

import static org.testng.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {

	// static WebDriver driver = new ChromeDriver();
	 
	 
	public static void main(String[] args) throws InterruptedException {
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
	        
	     //  getTitle(driver);
	        //clickLinkFullStack(driver);
	       // headerMenu(driver);
	        openMenuNewTab(driver);
	    }

	}
	public static void getTitle(WebDriver driver) {
		 String expectedTitle = "GeeksforGeeks | Your All-in-One Learning Portal";
	        String ActualTitle= driver.getTitle();
	        //Assert.assertEquals(ActualTitle,expectedTitle);
	        
	        if(ActualTitle.equalsIgnoreCase(expectedTitle)) {
	        	System.out.println("Title is Correct");
	        }
	        else {
	        	System.out.println("Title is not Correct");
	        }
	}
	
	public static void clickLinkFullStack(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Full Stack Live Classes")).click();
	       Thread.sleep(5000);
	     //   JavascriptExecutor js = (JavascriptExecutor) driver;
	    //  js.executeScript("window.scrollBy(0, 3000)");
	       // Thread.sleep(5000);
	       
	       String currHandle=driver.getWindowHandle();
	        assertNotNull(currHandle);
	        System.out.println(currHandle);
	       driver.switchTo().window(currHandle);
	}
	
	public static void headerMenu(WebDriver driver) throws InterruptedException {
			Thread.sleep(3000);
	       WebElement ele= driver.findElement(By.xpath("//*[@id=\"topMainHeader\"]/div/ul/li[1]"));
	        Actions ac = new Actions(driver);
	       ac.moveToElement(ele).perform();
	       Thread.sleep(3000);
	       WebElement ele1=driver.findElement(By.xpath("//*[@class=\"megaDropDownListItem\"][1]"));
	       ac.moveToElement(ele1).perform();
	       Thread.sleep(3000);
	       WebElement ele2=driver.findElement(By.xpath("//*[@class=\"megaDropDownListItem\"][1]"));
	       ac.moveToElement(ele2).click().perform();
	}
	
	public static void openMenuNewTab(WebDriver driver) throws InterruptedException {
		Actions ac= new Actions(driver);
		String windowHandle = driver.getWindowHandle();
		System.out.println("Base Tab= "+windowHandle);
		List<WebElement> webEle= driver.findElements(By.xpath("//*[@id=\"secondarySubHeader\"]/ul/li"));
		for(WebElement ele: webEle) {
			ac.keyDown(Keys.LEFT_CONTROL)
	        .click(ele)
	        .keyUp(Keys.LEFT_CONTROL)
	        .build()
	        .perform();
		Thread.sleep(3000);
					
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
					
		driver.switchTo().window(tabs.get(1));	
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.close();
		System.out.println("\n");
		driver.switchTo().window(tabs.get(0));
		}
	}
}