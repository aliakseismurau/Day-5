package by.training.model.dao;

import by.training.exception.DaoException;
import by.training.model.entity.Car;

public interface CarDao {
    void addCar(Car car) throws DaoException;

    void deleteCar(Car car) throws DaoException;

    void setCar(int index, Car car) throws DaoException;

    void updateCarPrice(int id, long carPrice) throws DaoException;

    void updateCarMake(int id, String carMake) throws DaoException;

    void updateCarModel(int id, String carModel) throws DaoException;

    void updateCarColor(int id, String carColor) throws DaoException;

    int size();
}
