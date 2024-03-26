package ch04_OOP1.oopEating;

import ch04_OOP1.oopEating.eater.*;
import ch04_OOP1.oopEating.fruit.*;
import ch04_OOP1.oopEating.meat.*;

public class OOPEatingMain {
    public static void main(String[] args) {
        VegeEater woman1 = new VegeEater();
        Fruit apple = new Apple();
        ((Apple)apple).wow();
        woman1.vegetableEat(new Orange());


        MeatEater man1 = new MeatEater(new Chicken());
        man1.meatEat();

        System.out.println();

        //Overloading 으로 추가 구현
        Eater eater = new Eater();
        eater.whatEat(new Mango());
        eater.whatEat(new Chicken());
    }
}