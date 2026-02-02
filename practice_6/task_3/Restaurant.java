package practice_6.task_3;

public class Restaurant {
    private Dish dish;  //создаю 1 блюдо тк колекции еще не брали

    public void addDish(Dish dish) {
        this.dish = dish;
    }

   public void printDishFromMenu() {
       this.dish.showDescription();
    }


}
