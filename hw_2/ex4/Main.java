package hw_2.ex4;

public class Main {
    public static void main(String[] args) {
        WeaponCreator weaponCreator;
        String weaponType = "Gun";

        if (weaponType.equals("Gun")) {
            weaponCreator = new GunCreator();
        } else if (weaponType.equals("Bow")) {
            weaponCreator = new BowCreator();
        } else if (weaponType.equals("Sword")) {
            weaponCreator = new SwordCreator();
        } else {
            throw new IllegalArgumentException("Incorrect weapon type");
        }

        IWeapon weapon = weaponCreator.createWeapon();

        weapon.attack();
    }
}
