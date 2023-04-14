package Tests;

import Classes.DeliveryInformationClass;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class DeliveryInformationTest extends testBase{
    CSVReader reader;
    @Test
    public void Delivery() throws IOException, CsvValidationException, InterruptedException {
        //get path of csv file
        String CSV_file = System.getProperty("user.dir")+"/src/test/java/Data/Data.csv";
        reader = new CSVReader(new FileReader(CSV_file));
        String[] csvCell ;
        //while loop will be executed till the last value in CSV file.
        while ((csvCell = reader.readNext()) != null)
        {
            String street = csvCell[0];
            String Build = csvCell[1];
            String floor = csvCell[2];
            String apartment = csvCell[3];
            String landmark = csvCell[4];
            String Address = csvCell[5];
            DeliveryInformationClass delivery;
            delivery = new DeliveryInformationClass(driver);

            delivery.DeliveryMethod(street,Build, floor, apartment, landmark, Address);

            //first Assertion
            driver.findElement(delivery.alertAssert).isDisplayed();

            //second Assertion
            String expectedResult = "Please enter a valid name";
            String actualResult = driver.findElement(delivery.alertAssert).getText();
            Assert.assertEquals(actualResult, expectedResult);
        }

    }
}
