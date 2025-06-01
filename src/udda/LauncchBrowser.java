package udda;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LauncchBrowser {
	ChromeDriver driver;

	@BeforeGroups(groups= {"smk1","smk2"})
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uddadev.triazinesoft.com/index.php/admin/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Browser Opened");
	}

	@AfterGroups(groups= {"smk1","smk2"})
	public void closebrowser() {
		// driver.close();
		System.out.println("Browser Closed");
	}

	@AfterTest(groups= {"smk1","smk2"})
	public void logout() {
	//	driver.findElement(By.xpath("//i[@class='flaticon-logout']")).click();
		System.out.println("LogOut Sucessfull");

	}

	@Test (priority=1,groups= {"smk1","smk2"})
	public void loginWeb() throws InterruptedException {
		WebElement attr = driver.findElement(By.xpath("//form[@id='frmlogin']"));
		attr.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("admin@udda.com");
		attr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
		driver.findElement(By.id("kt_login_signin_submit")).click();
		

		System.out.println("Login Sucessfull");
		
	}
	
    @Test (priority=2,groups= {"smk1","smk2"})
	public void CurrentMatchupStatus() throws InterruptedException {
    	Thread.sleep(20000);
		WebElement TotalMatchups= driver.findElement(By.className("card-title"));
        String c =TotalMatchups.getText();
        System.out.println(c);
	}

}
