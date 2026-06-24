package hw_2.ex11;

public class Main {
    public static void main(String[] args) {
        DoorFacade doorFacade = new DoorFacade(new DoorBlocker(), new DoorCloser(), new DoorOpener());

        doorFacade.manageDoor();
    }
}
