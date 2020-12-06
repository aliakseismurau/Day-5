package by.training.model.entity.comparator;

import by.training.model.entity.Car;

import java.util.Comparator;

public class CarCompareCarModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getCarModel().compareTo(o2.getCarModel());
    }
}
