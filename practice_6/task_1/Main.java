package practice_6.task_1;

public class Main {
    /**
     * 1 сущности
     * животное: слон, птица, зоопарк
     *
     * 2 действия
     * издвать звуки, передвигаться
     *
     * 3 связи
     * иерархия
     *
     * 4 классы и свойства(поля) и действия(методы)
     * животное нет свойств
     *  makeSound() move()
     * птица - нет свойств
     *   чирикает и летает
     * слон нет свойств
     *  трубит и ходит
     * зоопарк - животное
     *  addAnimal() showAnimalBehavior()
     */
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        Animal myBird = new Bird();
        Animal myElephant = new Elephant();

        myZoo.addAnimal(myBird);
        myZoo.showAnimalBehavior();

        myZoo.addAnimal(myElephant);
        myZoo.showAnimalBehavior();
    }

}
