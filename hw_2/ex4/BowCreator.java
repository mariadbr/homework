package hw_2.ex4;

class BowCreator extends WeaponCreator{
    @Override
    IWeapon createWeapon() {
        return new Bow();
    }
}
