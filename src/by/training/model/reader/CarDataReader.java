package by.training.model.reader;

import by.training.model.entity.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

public class CarDataReader {

    private static final Logger logger = LogManager.getLogger();

    public Optional<Car> readCarData(String filename){
        Optional<Car> result = Optional.empty();
        Scanner scanner = null;

        try {
            scanner = new Scanner(filename);
            if (filename == null){
                throw new FileNotFoundException();
            }
            String nextCar = scanner.nextLine();
            String[] carProperties = nextCar.split(", ");
            String carMake = carProperties[0];
            String carModel = carProperties[1];
            String color = carProperties[2];
            long price = Long.parseLong(carProperties[3]);
            Car car = new Car(carMake, carModel, color, price);
            result = Optional.of(car);
        } catch (FileNotFoundException e){
            logger.error("The following error has occurred: ", e);
        } finally {
            scanner.close();
        }
        return result;
    }
}
