package Tests;

import Classes.SelectLanguageClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectLanguageTest extends testBase{
    @Test
    public void homePage(){
        SelectLanguageClass home;
        home = new SelectLanguageClass(driver);

        home.changLanguage();


        //Assertion
        String expectedResult = "عربي";
        String actualResult = driver.findElement(home.assertion).getText();
        Assert.assertEquals(actualResult, expectedResult);

    }
}
