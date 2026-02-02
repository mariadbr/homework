package practice_6.task_7;

public class Main {
    /**
     * 1 сущности
     *  аттракцион: горки, карусель, парк
     *
     * 2 действия
     *
     * 3 связи
     *наследование, полифморфизм
     *
     * 4 классы и свойства(поля) и действия(методы)
     *Attraction
     *info() manage()
     * Carousel
     *info() manage()
     *RollerCoaster
     *info() manage()
     * AmusementPark - attraction
     *setAttraction
     * showInfo()
     *
     */
    public static void main(String[] args) {
        AmusementPark myAmusementPark = new AmusementPark();

        Attraction myCarousel = new Carousel();
        Attraction myRollerCoaster = new RollerCoaster();

        myAmusementPark.setAttraction(myCarousel);
        myAmusementPark.showInfo();
    }
}
