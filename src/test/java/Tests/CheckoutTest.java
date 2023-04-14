package Tests;

import Classes.CheckoutClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends testBase{
     @Test
    public void Checkout(){
         CheckoutClass check;
         check = new CheckoutClass(driver);

         check.checkoutMethod();

         //Assertion
         String expectedResult = "Checkout";
         String actualResult = driver.findElement(check.assertion).getText();
         Assert.assertEquals(actualResult, expectedResult);
     }
}
