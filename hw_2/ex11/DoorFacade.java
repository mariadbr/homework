package hw_2.ex11;

class DoorFacade {
    private DoorBlocker doorBlocker;
    private DoorCloser doorCloser;
    private DoorOpener doorOpener;

    public DoorFacade(DoorBlocker doorBlocker, DoorCloser doorCloser, DoorOpener doorOpener) {
        this.doorBlocker = doorBlocker;
        this.doorCloser = doorCloser;
        this.doorOpener = doorOpener;
    }

    public void manageDoor() {
        doorOpener.openDoor();
        doorCloser.closeDoor();
        doorBlocker.blockDoor();
    }
}
