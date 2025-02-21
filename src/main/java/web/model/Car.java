package web.model;

public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;

    public Car(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", web.model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
