package hw_2.ex10;

public class Main {
    public static void main(String[] args) {
        NewSpeedSystem system = new NewSpeedSystem();

        MilesToKilometersAdapter milesToKilometersAdapter = new MilesToKilometersAdapter(new MileSpeed());

        system.showSpeed(milesToKilometersAdapter.getFromMilesToKm());

    }
}
