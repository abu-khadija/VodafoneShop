package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeliveryInformationClass extends BaseClass{
    //Constructor
    public DeliveryInformationClass(WebDriver driver) {super(driver);}


    //Element's locators
    private final WebElement selectCity = driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-12 checkout-dropdownCity checkoutDeleiveryOptionsPhase2EditWidth']//select"));
    private final WebElement selectDistrict = driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-12 checkoutDeleiveryOptionsPhase2EditWidth']//select"));
    private final By deliverToAddress = By.xpath("//div[@class='checkout-DelivaryOptionsInfo checkout-DelivaryToAddress open firstOpen']");
    private final By streetName = By.xpath("//input[@formcontrolname='address1']");
    private final By buildingNumber = By.xpath("//input[@formcontrolname='buildingNumber']");
    private final By floorNumber = By.xpath("//input[@formcontrolname='floorNumber']");
    private final By apartmentNumber = By.xpath("//input[@formcontrolname='appartmentNumber']");
    private final By landLine = By.xpath("//input[@formcontrolname='landLine']");
    private final By addressName = By.xpath("//input[@formcontrolname='addressName']");
    private final By continueButton = By.xpath("//button[@class='btn checkout-btn btn-red delievry--btn--checkout']");
    private final By ContinueButton = By.id("shippingAddressContinue");
    public final By alertAssert = By.xpath("//div[@class='help-block alertComp']");

    //Filling all the delivery Details
    public void DeliveryMethod(String street, String Build, String floor, String apartment,String landmark, String Address) throws InterruptedException {
        //Select The City
        new Select(selectCity).selectByValue("0");
        //Select The District
        Select District = new Select(selectDistrict);
        District.selectByIndex(3);
        //Click at the Delivery Button to confirm the address
        driver.findElement(deliverToAddress).click();
        Thread.sleep(500);
        //Fill the Building information
        driver.findElement(streetName).sendKeys(street);
        Thread.sleep(500);
        driver.findElement(buildingNumber).sendKeys(Build);
        Thread.sleep(500);
        driver.findElement(floorNumber).sendKeys(floor);
        Thread.sleep(500);
        driver.findElement(apartmentNumber).sendKeys(apartment);
        Thread.sleep(500);
        driver.findElement(landLine).sendKeys(landmark);
        Thread.sleep(500);
        driver.findElement(addressName).sendKeys(Address);
        Thread.sleep(500);
        //Click continue button to confirm building information
        driver.findElement(continueButton).click();
        //Click continue button to Check if the personal Information Could be Empty
        driver.findElement(ContinueButton).click();
        //Scroll Up to show the Alert messages
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)");
    }
}
