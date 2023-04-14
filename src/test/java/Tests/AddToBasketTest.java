package Tests;

import Classes.addToBasketClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToBasketTest extends testBase{
    @Test
    public void CheckOut() throws InterruptedException {
        addToBasketClass check;
        check = new addToBasketClass(driver);

        check.basketMethod();
        String expectedResult = "Your basket";
        String actualResult = driver.findElement(check.Assertion).getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
