package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SelectBrandClass extends BaseClass{
    //Constructor
    public SelectBrandClass(WebDriver driver) {super(driver);}

    //Element's locators
    private final By ChooseBrand = By.xpath("//a[@href='/shop/shopByBrand/Apple']//div");
    public final By assertion = By.xpath("//div[@class='container productDetails-paymentOptions-container-content']//h3");



    //Go to “Shop By Brand” section and select “Iphone”.
    public void SelectBrand() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");

        Thread.sleep(2000);

        driver.findElement(ChooseBrand).click();
    }
}
