package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class addToBasketClass extends BaseClass{
    //Constructor
    public addToBasketClass(WebDriver driver) {super(driver);}

    //Element's locators
    private final By addToBasketButton = By.xpath("//div[@class='addToBasket-btn']//button");
    public final By Assertion = By.xpath("//div[@class='shopingCartContainer-basket']//p");




    //Click Add To Basket
    public void basketMethod() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5500);
        driver.findElement(addToBasketButton).click();
    }
}
