package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertTrue;

public class WindowTests extends BaseTests {

   @Test
    public void testWindowTabs(){
        DynamicLoadingExample2Page buttonPage = homePage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
