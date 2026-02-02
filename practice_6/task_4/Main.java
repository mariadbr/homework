package practice_6.task_4;

public class Main {
    /**
     * 1 сущности
     *
     *
     * 2 действия
     *
     *
     * 3 связи
     *иерархия композиция+ полифморфизм
     *
     * 4 классы и свойства(поля) и действия(методы)
     * SeaCreature
     *move()
     * StarFish -
     * move() звезда медленно ползает
     * Shark -
     *move() плавает быстро и агрессивно
     * Aquarium seaCreature
     * addCreature()
     * showSeaCreatureBehavior()
     */
    public static void main(String[] args) {
        Aquarium myAquarium = new Aquarium();

        SeaCreature myShark = new Shark();
        SeaCreature myStarFish = new StarFish();

        myAquarium.addSeaCreature(myShark);
        myAquarium.showSeaCreatureBehaviour();
    }
}
