package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {

    private WebDriver driver;
    private By modalTitle = By.className("modal-title");
    private By closeModal = By.cssSelector(".modal .modal-footer p");
    private By modalWindow = By.id("modal");

    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean modalExist(){
        return driver.findElement(modalWindow).isDisplayed();
    }

    public String getModalTitle(){
        return driver.findElement(modalTitle).getText();
    }

    public void closeModal(){
        driver.findElement(closeModal).click();
    }
}
