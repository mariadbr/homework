package hw_2.ex8;

public class Main {
    public static void main(String[] args) {
        Character character = new Character(100, 80, 70, 20);

        Character flexibleCharacter = new Character.Builder().setHealth(95).setArmor(75).setMagic(25).build();

        System.out.println(character);
        System.out.println(flexibleCharacter);
    }
}
