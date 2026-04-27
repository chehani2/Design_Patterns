package io.zee.builder_pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {

        CarTelescopic1 carTelescopic1 = new CarTelescopic1("full");
        System.out.println(carTelescopic1.toString());

        CarTelescopic2 carTelescopic2 = new CarTelescopic2("full");
        System.out.println(carTelescopic2.toString());

        Car.Builder builder = new Car.Builder("full");
        System.out.println(builder);

        /*Use the Builder pattern to get rid of a “telescoping constructor”.
        Use the Builder pattern when you want your code to be able to create different representations of some
        product (for example, stone and wooden houses).
        Use the Builder to construct Composite trees or other complex objects.
        * */
        Car car = builder.dropOffLocation("LA")
                .etc(true)
                .build();
        System.out.println(car);

    }
}