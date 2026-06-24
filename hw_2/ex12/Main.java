package hw_2.ex12;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome(new AlarmSystem(), new Conditioner(), new Light());

        smartHome.turnAllOn();
        smartHome.turnAllOff();
    }
}
