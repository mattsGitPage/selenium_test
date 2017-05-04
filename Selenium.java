package finalProject;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Selenium{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
    baseUrl = "http://sod73.asu.edu/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAssignment5464seltests() throws Exception {
    driver.get(baseUrl + "/~jbalasoo/cse464/hw5/modified/math1.php");
    driver.findElement(By.name("num1")).clear();
    driver.findElement(By.name("num1")).sendKeys("4");
    driver.findElement(By.name("num2")).clear();
    driver.findElement(By.name("num2")).sendKeys("2");
    driver.findElement(By.name("operation")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.name("num1")).clear();
    driver.findElement(By.name("num1")).sendKeys("4");
    driver.findElement(By.name("num2")).clear();
    driver.findElement(By.name("num2")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@name='operation'])[2]")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.name("num1")).clear();
    driver.findElement(By.name("num1")).sendKeys("4");
    driver.findElement(By.name("num2")).clear();
    driver.findElement(By.name("num2")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@name='operation'])[3]")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.name("num1")).clear();
    driver.findElement(By.name("num1")).sendKeys("4");
    driver.findElement(By.name("num2")).clear();
    driver.findElement(By.name("num2")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@name='operation'])[4]")).click();
    driver.findElement(By.name("submit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
