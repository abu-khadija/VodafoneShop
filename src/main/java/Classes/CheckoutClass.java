package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutClass extends BaseClass{
    //Constructor
    public CheckoutClass(WebDriver driver) {super(driver);}

    //Element's locators
    private final By button = By.xpath("//button[@class=\"btn btn-block btn-lg btn-grey fontLightEnAr\"]");
    private final By proceedToCheckout = By.xpath("//button[@class='btn btn-red']");

    public final By assertion = By.xpath("//div[@class='checkout-title fontLight']//p");

    //Confirm the order
    public void checkoutMethod(){
        //wait until the element is visible and click on it
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(button));
        driver.findElement(proceedToCheckout).click();
    }
}
