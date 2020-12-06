package by.training.model.service.impl;

import by.training.exception.ServiceException;
import by.training.model.dao.storage.CarWarehouse;
import by.training.model.entity.Car;
import by.training.model.service.CarService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarServiceImpl implements CarService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public Optional<Car> findCarByPrice(long price) {
        List<Car> cars = findAll();
        Optional<Car> result = Optional.empty();
        for (Car car: cars){
            if(car.getPrice() == price){
                result = Optional.of(car);
            }
        }
        return result;
    }

    @Override
    public Optional<Car> findCarByCarMake(String carMake) {
        List<Car> cars = findAll();
        Optional<Car> result = Optional.empty();
        for (Car car: cars){
            if(car.getCarMake() == carMake){
                result = Optional.of(car);
            }
        }
        return result;
    }

    @Override
    public Optional<Car> findCarByCarModel(String carModel) {
        List<Car> cars = findAll();
        Optional<Car> result = Optional.empty();
        for (Car car: cars){
            if(car.getCarModel() == carModel){
                result = Optional.of(car);
            }
        }
        return result;
    }

    @Override
    public Optional<Car> findCarByColor(String color) {
        List<Car> cars = findAll();
        Optional<Car> result = Optional.empty();
        for (Car car: cars){
            if(car.getColor() == color){
                result = Optional.of(car);
            }
        }
        return result;
    }

    @Override
    public Optional<Car> findById(int id) {
        List<Car> cars = findAll();
        Optional<Car> result = Optional.empty();
        for (Car car: cars){
            if(car.getId() == id){
                result = Optional.of(car);
            }
        }
        return result;
    }

    @Override
    public List<Car> findAll() {
        return CarWarehouse.getInstance().getCars();
    }

    @Override
    public void sortById() throws ServiceException{
        List<Car> cars = findAll();
        cars.sort(Comparator.comparing(Car::getId));
        try {
            if (cars == null){
                throw new ServiceException("The list is empty");
            }
            for (int i = 0; i < cars.size(); i++){
                cars.set(i, cars.get(i));
            }
        } catch (ServiceException e){
            logger.error("The following error has occurred: ", e);
        }
    }

    @Override
    public void sortByCarMake() throws ServiceException {
        List<Car> cars = findAll();
        cars.sort(Comparator.comparing(Car::getCarMake));
        try {
            if (cars == null){
                throw new ServiceException("The list is empty");
            }
            for (int i = 0; i < cars.size(); i++){
                cars.set(i, cars.get(i));
            }
        } catch (ServiceException e){
            logger.error("The following error has occurred: ", e);
        }
    }

    @Override
    public void sortByCarModel() throws ServiceException {
        List<Car> cars = findAll();
        cars.sort(Comparator.comparing(Car::getCarModel));
        try {
            if (cars == null){
                throw new ServiceException("The list is empty");
            }
            for (int i = 0; i < cars.size(); i++){
                cars.set(i, cars.get(i));
            }
        } catch (ServiceException e){
            logger.error("The following error has occurred: ", e);
        }
    }

    @Override
    public void sortByColor() throws ServiceException {
        List<Car> cars = findAll();
        cars.sort(Comparator.comparing(Car::getColor));
        try {
            if (cars == null){
                throw new ServiceException("The list is empty");
            }
            for (int i = 0; i < cars.size(); i++){
                cars.set(i, cars.get(i));
            }
        } catch (ServiceException e){
            logger.error("The following error has occurred: ", e);
        }
    }

    @Override
    public void sortByPrice() throws ServiceException{
        List<Car> cars = findAll();
        cars.sort(Comparator.comparing(Car::getPrice));
        try {
            if (cars == null){
                throw new ServiceException("The list is empty");
            }
            for (int i = 0; i < cars.size(); i++){
                cars.set(i, cars.get(i));
            }
        } catch (ServiceException e){
            logger.error("The following error has occurred: ", e);
        }
    }
}
