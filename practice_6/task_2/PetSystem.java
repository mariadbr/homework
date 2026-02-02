package practice_6.task_2;

public class PetSystem {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void handlePet() {
        this.pet.feed();
        this.pet.interact();
    }

}
