package hw_2.ex10;

class MilesToKilometersAdapter {
    private MileSpeed mileSpeed;

    public MilesToKilometersAdapter(MileSpeed mileSpeed) {
        this.mileSpeed = mileSpeed;
    }

    public double getFromMilesToKm() {
        double speedInMiles = mileSpeed.getSpeedInMiles();
        double speedInKm = speedInMiles * 1.609;
        return speedInKm;
    }
}
