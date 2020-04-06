package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Scrolls until paragraph with index specified in the view
     * @param index 1-based
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        while(getNumberOfParagraphPresents() < index){
            jsExecutor.executeScript(script);
        }
    }

    public int getNumberOfParagraphPresents(){
        return driver.findElements(textBlocks).size();
    }

}
