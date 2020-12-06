package by.training.model.dao.storage;

import by.training.exception.DaoException;
import by.training.model.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarWarehouse {
    private static CarWarehouse instance = new CarWarehouse();

    private List<Car> cars = new ArrayList<>();

    private CarWarehouse(){
    }

    public static CarWarehouse getInstance(){
        return instance;
    }

    public List<Car> getCars() {
        return new ArrayList<Car>(cars);
    }

    public void setCars(List<Car> cars){
        this.cars = cars;
    }

    public void add(Car car) throws DaoException {
        if(cars.contains(car)){
            throw new DaoException(car + " is already in the storage");
        }
        cars.add(car);
    }

    public void delete(Car car) throws DaoException{
        if(!cars.contains(car)){
            throw new DaoException(car + " is not found in the storage");
        }
        cars.remove(car);
    }

    public void set(int index, Car car) throws DaoException{
        if(index < 0 || index >= size()){
            throw new DaoException("Car with this index is not found");
        }
        cars.set(index, car);
    }

    public void update(Car previousCar, Car newCar) throws DaoException{
        if(!cars.contains(previousCar)){
            throw new DaoException(previousCar + " is not found in the storage");
        }
        cars.set(cars.indexOf(previousCar), newCar);
    }

    public int size(){
        return cars.size();
    }

    public Car getCar(int index) throws DaoException{
        if(index < 0 || index >= size()){
            throw new DaoException("Car with this index is not found");
        }
        return cars.get(index);
    }
}
