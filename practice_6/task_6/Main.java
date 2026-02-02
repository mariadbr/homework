package practice_6.task_6;

public class Main {
    /**
     * 1 сущности
     *
     *
     * 2 действия
     *
     *
     * 3 связи
     *иерархия композиция полиморфмизм
     *
     * 4 классы и свойства(поля) и действия(методы)
     *Plant -
     * require()
     * Cactus
     *require()
     * Orchid
     *require()
     * BotanicGarden plant
     * addPlant()
     * plantCare()
     */
    public static void main(String[] args) {
        BotanicGarden myBotanicGarden = new BotanicGarden();

        Plant myCactus = new Cactus();
        Plant myOrchid = new Orchid();

        myBotanicGarden.addPlant(myCactus);
        myBotanicGarden.plantCare();
    }
}
