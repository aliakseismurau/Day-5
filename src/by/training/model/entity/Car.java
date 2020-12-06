package by.training.model.entity;

import by.training.util.IdGenerator;

public class Car {
    private long id = IdGenerator.getId();
    private String carMake;
    private String carModel;
    private String color;
    private long price;
    private long registrationNumber = IdGenerator.getRegistrationNumber();

    public Car() {
    }

    public Car(String carMake, String carModel, String color, long price) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.color = color;
        this.price = price;
    }

    public long getId() {
        return id;
    }


    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (price != car.price) return false;
        if (registrationNumber != car.registrationNumber) return false;
        if (carMake != null ? !carMake.equals(car.carMake) : car.carMake != null) return false;
        if (carModel != null ? !carModel.equals(car.carModel) : car.carModel != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (carMake != null ? carMake.hashCode() : 0);
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (int) (price ^ (price >>> 32));
        result = 31 * result + (int) (registrationNumber ^ (registrationNumber >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", carMake='").append(carMake).append('\'');
        sb.append(", carModel='").append(carModel).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append('}');
        return sb.toString();
    }
}
