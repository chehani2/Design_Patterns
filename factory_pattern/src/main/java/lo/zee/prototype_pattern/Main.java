package lo.zee.prototype_pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Car car = (Car) registry.getVehicle(VehicleType.CAR);
        System.out.println(car);
        car.setColor("Yellow");
        System.out.println(car);

        Car car1 = (Car) registry.getVehicle(VehicleType.CAR);
        System.out.println(car1);

    }
}