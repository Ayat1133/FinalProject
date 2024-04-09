package Selleniun_start_projects.Selleniun_start_projects;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class TringleTesting {
    static WebDriver browser;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
    }

    @Test
    public void testTriangleClassification() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("5");
        side2.sendKeys("5");
        side3.sendKeys("5");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Equilateral", result.getText());
    }
    @Test
    public void testTriangleClassification1() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("4");
        side2.sendKeys("4");
        side3.sendKeys("5");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Isosceles", result.getText());
    }
    @Test
    public void testTriangleClassification2() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("3");
        side2.sendKeys("4");
        side3.sendKeys("3");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Isosceles", result.getText());
    }
    @Test
    public void testTriangleClassification3() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("8");
        side2.sendKeys("17");
        side3.sendKeys("15");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Scalene", result.getText());
    }
    @Test
    public void testTriangleClassification4() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("8");
        side2.sendKeys("3");
        side3.sendKeys("15");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("NotaTriangle", result.getText());
    }
    @Test
    public void testTriangleClassification5() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("0");
        side2.sendKeys("0");
        side3.sendKeys("0");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Not a Triangle", result.getText());
    }
    @Test
    public void testTriangleClassification6() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("8");
        side2.sendKeys("3");
        side3.sendKeys("3");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Not a Triangle", result.getText());
    }
    @Test
    public void testTriangleClassification7() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("1");
        side2.sendKeys("2");
        side3.sendKeys("1");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Not a Triangle", result.getText());
    }
    @Test
    public void testTriangleClassification8() {
        WebElement side1 = browser.findElement(By.id("side1"));
        WebElement side2 = browser.findElement(By.id("side2"));
        WebElement side3 = browser.findElement(By.id("side3"));

        side1.sendKeys("1");
        side2.sendKeys("1");
        side3.sendKeys("2");

        browser.findElement(By.id("identify-triangle-action")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));

        assertEquals("Not a Triangle", result.getText());
    }
    
}
