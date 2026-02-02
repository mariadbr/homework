package practice_6.task_2;

public class Main {
    /**
     * 1 сущности
     *Pet: Cat Dog, PetSystem
     *
     * 2 действия
     *feed() intercat()
     *
     * 3 связи
     * иерархия
     *
     * 4 классы и свойства(поля) и действия(методы)
     * Pet -
     * feed() intercat()
     * Dog -
     * гуляет, ест сухой корм
     * Cat -
     * играет и ест влажный корм
     * PetSystem
     * handlePet()
     * setPet()
     */

    public static void main(String[] args) {
        PetSystem myPetSystem = new PetSystem();

        Pet myCat = new Cat();
        Pet myDog = new Dog();

        myPetSystem.setPet(myCat);
        myPetSystem.handlePet();
    }
}
