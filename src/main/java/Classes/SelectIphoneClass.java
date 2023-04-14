package Classes;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class SelectIphoneClass extends BaseClass{
    //Constructor
    public SelectIphoneClass(WebDriver driver) {super(driver);}


    //Element's locators
    private final By productList = By.className("productList-row");
    private final By CookiesPar = By.xpath("//i[@class='fas fa-times']");

    private final By showMoreButton = By.xpath("//button[@class='btn btn-grey productList-button']");
    private final By iPhone = By.xpath("//img[@src='https://eshop.vodafone.com.eg/eshopContent//product_images/carousel/iPhone13_pro_green_carousel.png']");
    public final By Assertion = By.xpath("//div[@class='addToBasket-btn']//button");

    //Select any of returned iPhone mobiles
    public void chooseIphone() {
        new WebDriverWait(driver,Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(productList));

        //close the cookies par that block the button
        WebElement element = driver.findElement(showMoreButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(CookiesPar).click();


        //Scroll Down And Click Show more Button
        new WebDriverWait(driver,Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(showMoreButton));
        driver.findElement(showMoreButton).click();

        //Scroll Down And Click Show more Button
        new WebDriverWait(driver,Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(showMoreButton));
        driver.findElement(showMoreButton).click();

        //Select iPhone
        new WebDriverWait(driver,Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(iPhone));
        driver.findElement(iPhone).click();
    }
}
