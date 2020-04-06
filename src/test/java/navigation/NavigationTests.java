package navigation;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigationTests extends BaseTests{

    @Test
    public void testnavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickmultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

}
