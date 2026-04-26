package io.zee.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    Map<String, Vehicle> vehicleMap = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Vehicle getVehicle(String vehicleType) {
        return (Vehicle) vehicleMap.get(vehicleType).clone();
    }

    private void initialize() {
        Car car = new Car();
        car.setColor("red");
        car.setEngineCapacity(200);
        car.setVehicleType("Petrol");

        Bus bus = new Bus();
        bus.setNumberOfSeats(6);
        car.setEngineCapacity(200);
        car.setVehicleType("Diesal");

        vehicleMap.put(VehicleType.CAR, car);
        vehicleMap.put(VehicleType.BUS, bus);

    }
}
