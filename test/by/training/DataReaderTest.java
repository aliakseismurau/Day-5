package by.training;

import by.training.model.entity.Car;
import by.training.model.reader.CarDataReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataReaderTest {

    List<Car> carTest;
    CarDataReader carDataReader = new CarDataReader();

    final String FILENAME = "data\\carInfo.txt";

    @BeforeMethod
    public void fillArray(){
        List<Car> carTest = new ArrayList<>();
        carTest.add(new Car("Nissan", "Sunny", "Pink", 2500));
        carTest.add(new Car("Ford", "Focus", "White", 3));
    }

    @Test

    public void testCreateCars(){
        Optional<Car> actual = carDataReader.readCarData(FILENAME);
        List<Car> expected = carTest;
        Assert.assertEquals(actual, expected);
    }
}
