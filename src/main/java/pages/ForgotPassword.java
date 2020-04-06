package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.cssSelector("#form_submit");

    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public RetrievePasswordPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new RetrievePasswordPage(driver);
    }
}
