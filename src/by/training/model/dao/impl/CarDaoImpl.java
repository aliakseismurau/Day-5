package by.training.model.dao.impl;

import by.training.exception.DaoException;
import by.training.model.dao.CarDao;
import by.training.model.dao.storage.CarWarehouse;
import by.training.model.entity.Car;
import by.training.model.service.impl.CarServiceImpl;

import java.util.Optional;

public class CarDaoImpl implements CarDao {

    private static final CarWarehouse instance = CarWarehouse.getInstance();

    CarServiceImpl carService = new CarServiceImpl();

    @Override
    public void addCar(Car car) throws DaoException {
       instance.add(car);
    }

    @Override
    public void deleteCar(Car car) throws DaoException {
        instance.delete(car);
    }

    @Override
    public void setCar(int index, Car car) throws DaoException {
        if(index < 0 || index > instance.size()){
            throw new DaoException(car + " is not found");
        }
        instance.set(index, car);
    }

    @Override
    public void updateCarPrice(int id, long carPrice) throws DaoException {
        Optional<Car> previousCar = carService.findById(id);
        if(previousCar.isEmpty()){
            throw new DaoException("No train matches id: " + id);
        }
        Car newCar = previousCar.get();
        newCar.setPrice(carPrice);
        instance.update(previousCar.get(), newCar);
    }

    @Override
    public void updateCarMake(int id, String carMake) throws DaoException {
        Optional<Car> previousCar = carService.findById(id);
        if(previousCar.isEmpty()){
            throw new DaoException("No train matches id: " + id);
        }
        Car newCar = previousCar.get();
        newCar.setCarMake(carMake);
        instance.update(previousCar.get(), newCar);
    }

    @Override
    public void updateCarModel(int id, String carModel) throws DaoException {
        Optional<Car> previousCar = carService.findById(id);
        if(previousCar.isEmpty()){
            throw new DaoException("No train matches id: " + id);
        }
        Car newCar = previousCar.get();
        newCar.setCarModel(carModel);
        instance.update(previousCar.get(), newCar);
    }

    @Override
    public void updateCarColor(int id, String carColor) throws DaoException {
        Optional<Car> previousCar = carService.findById(id);
        if(previousCar.isEmpty()){
            throw new DaoException("No train matches id: " + id);
        }
        Car newCar = previousCar.get();
        newCar.setColor(carColor);
        instance.update(previousCar.get(), newCar);
    }

    @Override
    public int size() {
        return instance.size();
    }
}
