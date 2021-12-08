package web.Service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count, List<Car> cars) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
