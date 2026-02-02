package practice_6.task_3;

public class Main {
    /**
     * 1 сущности
     * Dish: hotDish drink, Restaurant
     *
     * 2 действия
     *addDish() showDescription()
     *
     * 3 связи
     *интерфейс
     *
     * 4 классы и свойства(поля) и действия(методы)
     *Dish -
     *
     *HotDish temperature
     * showDescription()
     *Drink volume
     * showDescription()
     *Restaurant dish
     * addDish() printDishFromMenu()
     *
     */
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();

        Dish myDrink = new Drink(300);
        Dish myHotDish = new HotDish(20);

        myRestaurant.addDish(myDrink);
        myRestaurant.printDishFromMenu();

        myRestaurant.addDish(myHotDish);
        myRestaurant.printDishFromMenu();



    }

}
