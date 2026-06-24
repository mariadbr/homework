package hw_2.ex12;

class Conditioner implements Devise {
    @Override
    public void turnOn() {
        System.out.println("Turn the conditioner on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn the conditioner off");
    }
}
