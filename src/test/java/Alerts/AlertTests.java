package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfuly clicked an alert", "Result text incorrect");
    }

    @Test
    public void TestGetTextFromAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alert_getText(), "I am a JS Confirm", "Result text incorrect");
        alertsPage.alert_clickToDismiss();
    }

    @Test
    public void testSetInputInAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Never Give Up";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + text, "Result is incorrect");

    }
}
