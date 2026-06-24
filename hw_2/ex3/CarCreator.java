package hw_2.ex3;

class CarCreator extends VehicleCreator{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
