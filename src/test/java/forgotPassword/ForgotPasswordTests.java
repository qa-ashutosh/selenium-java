package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.RetrievePasswordPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmail("abc@example.com");
        RetrievePasswordPage retrievePasswordPage
                = forgotPassword.clickRetrievePasswordButton();
        assertTrue(retrievePasswordPage.getAlertText()
                .contains("Your e-mail's been sent!"), "Incorrect alert text");

    }

}
