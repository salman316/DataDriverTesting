package TDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.lib.Xls_Reader;



public class ParametrizTesting {
	
  public static void main(String[] args) throws InterruptedException {
	  
  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver 92 Verson\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver d = new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.hindustancopper.com/GraduateApprentice/Registration");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 		
    Xls_Reader reader = new Xls_Reader("C:\\\\Users\\\\sshai\\\\Videos\\\\VELOCITY CHINCHWAD\\\\ExcellSheet\\\\HalfEbayTestData.xlsx");
    int rowCount =reader.getRowCount("RegisTestData");
   
    //parametrization
    for(int rowNum = 2; rowNum<=rowCount;rowNum++) {
    System.out.println("==============");
    Thread.sleep(3000);
   
    String firstname = reader.getCellData("RegisTestData","firstname" , rowNum);
    System.out.println(firstname);	
    
    String LastName = reader.getCellData("RegisTestData","LastName" , rowNum);
    System.out.println(LastName);
    
    String Email = reader.getCellData("RegisTestData","Email" , rowNum);
    System.out.println(Email);
    
    String panno = reader.getCellData("RegisTestData","PanNo" , rowNum);
    System.out.println(panno);
    
    d.findElement(By.xpath("//*[@id=\"strCandidateFName\"]")).clear();
    d.findElement(By.xpath("//*[@id=\"strCandidateFName\"]")).sendKeys(firstname); 
    
    d.findElement(By.xpath("//*[@id=\"strCandidateLName\"]")).clear();
    d.findElement(By.xpath("//*[@id=\"strCandidateLName\"]")).sendKeys(LastName); 

    d.findElement(By.xpath("//*[@id=\"strEmail\"]")).clear();
    d.findElement(By.xpath("//*[@id=\"strEmail\"]")).sendKeys(Email); 

    d.findElement(By.xpath("//*[@id=\"strPANNo\"]")).clear();
    d.findElement(By.xpath("//*[@id=\"strPANNo\"]")).sendKeys(panno); 

    }
  
  
  
  
  
  }

}
