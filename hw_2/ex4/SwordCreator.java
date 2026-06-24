package hw_2.ex4;

class SwordCreator extends WeaponCreator{
    @Override
    IWeapon createWeapon() {
        return new Sword();
    }
}
