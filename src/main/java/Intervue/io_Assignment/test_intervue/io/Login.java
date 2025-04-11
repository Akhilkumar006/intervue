package Intervue.io_Assignment.test_intervue.io;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private By loginLink = By.xpath("//a[@href='/login']//div[contains(@class, 'AccessAccount-ColoredButton-Text')][normalize-space()='Login']");
    private By emailField = By.id("login_email");
    private By passwordField = By.id("login_password");
    private By loginBtn = By.xpath("//button[contains(@class, 'LoginDarkButton-sc-1ertvag-0')]");

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    public void enterCredentials(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginBtn).click();
    }
}
