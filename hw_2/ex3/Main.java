package hw_2.ex3;

public class Main {
    public static void main(String[] args) {
        VehicleCreator vehicleCreator;
        String vehicleType = "Car";

        if (vehicleType.equals("Car")) {
            vehicleCreator = new CarCreator();
        } else if (vehicleType.equals("Bicycle")) {
            vehicleCreator = new BicycleCreator();
        } else {
            throw new IllegalArgumentException("Incorrect vehicle type.");
        }

        Vehicle vehicle = vehicleCreator.createVehicle();

        vehicle.move();
    }
}
