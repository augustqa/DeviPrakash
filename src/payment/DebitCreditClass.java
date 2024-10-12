package payment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DebitCreditClass {
	WebDriver driver;
  @Test
  public void debitcard() {
	  driver.get("https://www.icici.com/");
	  driver.findElement(By.xpath("username")).sendKeys("DeviPrasad");
	  driver.findElement(By.xpath("password")).sendKeys("Hello@123");
	  driver.findElement(By.xpath("button")).click();
  }
  
  @Test
  public void creditcard() {
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
