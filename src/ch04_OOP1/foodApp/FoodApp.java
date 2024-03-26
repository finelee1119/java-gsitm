package ch04_OOP1.foodApp;

public class FoodApp {
    public static void main(String[] args) {
        Food chicken = new Food("치킨", 2000);
        Food pizza = new Food("피자", 5000);

        chicken.myprint();
        pizza.myprint();
    }
}
