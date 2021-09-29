package TDD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.util.lib.TestUtil;

public class DataproviderSample {
	
	WebDriver d;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver 92 Verson\\chromedriver_win32 (1)\\chromedriver.exe");	
		d = new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.hindustancopper.com/GraduateApprentice/Registration");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	}

	@DataProvider
	public Iterator<Object[]> getTestData()  {
	  ArrayList<Object[]>testData=TestUtil.getDataFromExcel();
	  return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void  hindustanpage(String firstname, String LastName, String Email, String panno) throws InterruptedException {
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"strCandidateFName\"]")).clear();
	    d.findElement(By.xpath("//*[@id=\"strCandidateFName\"]")).sendKeys(firstname); 
	    
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"strCandidateLName\"]")).clear();
	    d.findElement(By.xpath("//*[@id=\"strCandidateLName\"]")).sendKeys(LastName); 

	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"strEmail\"]")).clear();
	    d.findElement(By.xpath("//*[@id=\"strEmail\"]")).sendKeys(Email); 

	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"strPANNo\"]")).clear();
	    d.findElement(By.xpath("//*[@id=\"strPANNo\"]")).sendKeys(panno); 
	    Thread.sleep(2000);
	}
	@AfterMethod
	public void aftermethod() {
	d.close();	
	}
}
