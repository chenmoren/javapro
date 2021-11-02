package com.example.bulidermodel;

/**
 * @author renfurui
 * @create -11-02-10:40
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        ManualBuilder manualBuilder =new ManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual manual = manualBuilder.getResult();
        System.out.println("Manual built:\n"+manual.print());
    }
}
