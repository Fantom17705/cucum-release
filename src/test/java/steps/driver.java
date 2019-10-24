package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class driver {

    public static WebDriver driver;

    @Given("Open home page")
    public void Open_home_page() {
        //подключаем драйвер
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.debenhams.com/");

    }
    @When("Choose a country USA")
public void Choose_a_country_USA() {
        WebDriverWait wait = new WebDriverWait (driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='pw-button pw--icon-only c--tertiary c--tertiary--with-icon']")));
       // WebElement close = driver.findElement(By.xpath("//button[@class='pw-button pw--icon-only c--tertiary c--tertiary--with-icon']"));
       // close.click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='field-1']"));
        dropdown.click();
        WebElement us = driver.findElement(By.xpath("//option[contains(text(),'United States')]"));
        us.click();
        dropdown.click();
        WebElement go = driver.findElement(By.xpath("//div[contains(text(),'Go')]"));
        go.click();

}
}