package hw_2.ex4;

class GunCreator extends WeaponCreator{
    @Override
    IWeapon createWeapon() {
        return new Gun();
    }
}
