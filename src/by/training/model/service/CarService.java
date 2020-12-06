package by.training.model.service;

import by.training.exception.ServiceException;
import by.training.model.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Optional<Car> findCarByPrice(long price);

    Optional<Car> findCarByCarMake(String carMake);

    Optional<Car> findCarByCarModel(String carModel);

    Optional<Car> findCarByColor(String color);

    Optional<Car> findById(int id);

    List<Car> findAll();

    void sortById() throws ServiceException;

    void sortByCarMake() throws ServiceException;

    void sortByCarModel() throws ServiceException;

    void sortByColor() throws ServiceException;

    void sortByPrice() throws ServiceException;
}
