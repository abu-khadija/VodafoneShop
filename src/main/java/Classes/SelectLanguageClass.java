package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectLanguageClass extends BaseClass{
    public SelectLanguageClass(WebDriver driver) {super(driver);}

    private final By LanguageButton = By.className("lang");
    public final By assertion = By.xpath("//a[@id='profile-tab']//span");


    //Select language as “English”
    public void changLanguage(){
        driver.findElement(LanguageButton).click();
        new WebDriverWait(driver,Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(LanguageButton));
    }
}
