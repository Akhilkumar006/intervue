package Intervue.io_Assignment.test_intervue.io;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"neha@intervue.io", "Ps@neha@123"},   
            {"Akhil@gmail.com", "Intervue.io"}         
        };
    }

    @Test(dataProvider = "loginData")
    public void testLoginAndLogout(String email, String password)  {
    	try
    	{
        HomePage homePage = new HomePage(driver);
        Login loginPage = new Login(driver);

        homePage.clickLoginButton();
        homePage.switchToLoginWindow();

        loginPage.clickLogin();
        loginPage.enterCredentials(email, password);
        loginPage.clickLoginButton();
        WebElement accountName = driver.findElement(By.xpath("//div[contains(text(),'Neha')]")); 
    	
        if(accountName.isDisplayed())
        {
        	accountName.click();
        	driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        	System.out.println("Logged in Successfully");
        }
    	}
    	catch(Exception e)
        {
        	takeScreenshot();
        }

    } 
        
    public void takeScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File destPath = new File("C:\\Users\\akhil\\Desktop\\seleScreenShots\\loginImage.png");
		try {
			FileUtils.copyFile(src, destPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Screenshot taken: " + destPath);
    
    }
}
