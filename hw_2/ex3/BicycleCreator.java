package hw_2.ex3;

class BicycleCreator extends VehicleCreator{
    @Override
    Vehicle createVehicle() {
        return new Bicycle();
    }
}
