package hw_2.ex12;

class SmartHome {
    private AlarmSystem alarmSystem;
    private Conditioner conditioner;
    private Light light;

    public SmartHome(AlarmSystem alarmSystem, Conditioner conditioner, Light light) {
        this.alarmSystem = alarmSystem;
        this.conditioner = conditioner;
        this.light = light;
    }

    public void turnAllOn() {
        alarmSystem.turnOn();
        conditioner.turnOn();
        light.turnOn();
    }

    public void turnAllOff() {
        alarmSystem.turnOff();
        conditioner.turnOff();
        light.turnOff();
    }
}
