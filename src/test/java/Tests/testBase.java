package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class testBase {
    public static WebDriver driver;
    public String browser;

    public void setup(){
        try {
            //All the browsers
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                driver = new ChromeDriver(options);

            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            }

             else if (browser.equalsIgnoreCase("ie")) {
                driver = new InternetExplorerDriver();

            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
             //run in the background
             else if (browser.equalsIgnoreCase("chrome-headless")) {

                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                driver = new ChromeDriver(options);



            } else if (browser.equalsIgnoreCase("firefox-headless")) {
                FirefoxBinary firefoxBinary = new FirefoxBinary();
                firefoxBinary.addCommandLineOptions("--headless");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                driver = new FirefoxDriver(firefoxOptions);
            }
            //Default
             else {
                driver = new FirefoxDriver();
            }


        } catch (WebDriverException e) {
            e.printStackTrace();
            System.exit(-1);
        }

    }
    @Parameters({"browser","url"})
    @BeforeSuite
    public void OpenBrowser(String browser, String url){
        this.browser = browser;
        setup();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterSuite
    public void CloseDriver(){
        driver.quit();
    }
}
