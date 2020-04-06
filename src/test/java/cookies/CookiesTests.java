package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utils.CookieManager;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CookiesTests extends BaseTests {

    @Test
    public void testDeleteCookie(){
        CookieManager cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }

    @Test
    public void testAddedCookie(){
        CookieManager cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("ashu", "14591");
        cookieManager.addCookie(cookie);
        assertTrue(cookieManager.isCookiePresent(cookie), "Cookie was not found");
    }
}
