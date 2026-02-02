package practice_6.task_8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showInfo() {
        this.exhibit.history();
        this.exhibit.storageConditions();
    }
}
