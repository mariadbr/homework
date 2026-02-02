package practice_6.task_7;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showInfo() {
        this.attraction.info();
        this.attraction.manage();
    }
}
