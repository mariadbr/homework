package practice_6.task_5;

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
     *FarmAniamal -
     *function() need()
     * Cow -
     *function() need() даёт молоко, нуждается в выпасе
     * Chicken -
     *function() need() несёт яйца, требует зерно
     * Farm farmAnimal
     * addAnimal() manageFarmAnimal
     */
    public static void main(String[] args) {
        Farm myFarm = new Farm();

        FarmAnimal myCow = new Cow();
        FarmAnimal myChicken = new Chicken();

        myFarm.addAnimal(myCow);
        myFarm.manageFarmAnimal();}
}
