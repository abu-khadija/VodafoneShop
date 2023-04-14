package Tests;

import Classes.SelectIphoneClass;
import org.testng.annotations.Test;

public class SelectIphoneTest extends testBase{

    @Test
    public void SelectiPhone(){
        SelectIphoneClass select ;
        select = new SelectIphoneClass(driver);

        select.chooseIphone();

        //Assertion
        driver.findElement(select.Assertion).isDisplayed();
    }
}
