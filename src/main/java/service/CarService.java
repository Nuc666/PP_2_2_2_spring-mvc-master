package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carsList = new ArrayList<Car>();

    {
        carsList.add(new Car("A", "S", 1));
        carsList.add(new Car("B", "T", 2));
        carsList.add(new Car("C", "O", 3));
        carsList.add(new Car("D", "N", 4));
        carsList.add(new Car("E", "L", 5));
    }

    public List<Car> getCar(int count) {
        List<Car> cars = new ArrayList<Car>();
        if (count < carsList.size() - 1) {
            for (int i = 0; i < count; i++) {
                cars.add(carsList.get(i));
            }
            return cars;
        } else {
            return carsList;
        }
    }


    public List<Car> getAllCars() {
        return carsList;
    }
}
