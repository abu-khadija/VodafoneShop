package Tests;

import Classes.SelectBrandClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectBrandTest extends testBase{
    @Test
    public void SelectItem() throws InterruptedException {
        SelectBrandClass brand;
        brand = new SelectBrandClass(driver);

        brand.SelectBrand();

        //Assertion
        String expectedResult = "now choose your favorite item";
        String actualResult = driver.findElement(brand.assertion).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
