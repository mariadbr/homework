package hw_2.ex12;

class AlarmSystem implements Devise {
    @Override
    public void turnOn() {
        System.out.println("Turn the alarm system on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn the alarm system off");
    }
}
