package hw_2.ex12;

class Light implements Devise {
    @Override
    public void turnOff() {
        System.out.println("Turn the light off");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn the light on");
    }
}
