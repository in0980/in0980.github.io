import java.util.*;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleTests {

    WebDriver driver;

    @Before
    public void setup() {
        // declaration and instantiation of objects/variables
        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/leopoldomt/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        driver.close();
    }
    
    @Test
    public void testTitleMercuryTours() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";        
        // launch browser
        driver.get(baseUrl);
        Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
    }

    @Test
    public void testNavigateAmazon() {
        String baseUrl = "https://www.amazon.com.br";
        // launch browser
        driver.get(baseUrl);
        // look up today's deals
        WebElement element = driver.findElement(By.linkText("Ofertas do Dia"));
        element.click();
        // search for some item
        element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("kindle");
        element = driver.findElement(By.id("nav-search-submit-button"));
        element.click();
        // The oracle is that this test should not crash. There is no **explicit** assertion.
    }
    
    @Test
    public void anotherTestAmazon() {
        String baseUrl = "https://www.amazon.com.br";
        // launch browser
        driver.get(baseUrl);
        // search for some item
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle" + Keys.ENTER);
        // The oracle is that this test should not crash. There is no **explicit** assertion.
    }

}
