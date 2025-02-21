package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImp implements CarService{

    private final Car car1 = new Car("BMW", "x5", 2010);
    private final Car car2 = new Car("Volvo", "XC90", 2015);
    private final Car car3 = new Car("Volkswagen", "Polo", 2018);
    private final Car car4 = new Car("Ford", "Mondeo", 2017);
    private final Car car5 = new Car("Lada", "Vesta", 2020);


    @Override
    public List<Car> getCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars.stream().limit(count).toList();
    }
}
