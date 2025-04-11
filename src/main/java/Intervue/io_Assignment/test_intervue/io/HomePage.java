package Intervue.io_Assignment.test_intervue.io;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By loginBtn = By.xpath("//a[@class ='ivhn-contact-link loginBtn']");

    // Actions
    public void clickLoginButton() {
        driver.findElement(loginBtn).click();
    }

    public void switchToLoginWindow() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                
            }
        }
    }
    private By profileIcon = By.xpath("//div[contains(@class, 'MockProfileHeader__UsernameWrap')]");
    private By logoutBtn = By.xpath("//a[text()='Logout']");

    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileIcon)).click();
        driver.findElement(logoutBtn).click();
    }
}
