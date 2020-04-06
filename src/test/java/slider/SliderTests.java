package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        HorizontalSliderPage sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}