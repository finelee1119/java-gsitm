package java.ch04_OOP1.oopEating.eater;

import java.ch04_OOP1.oopEating.fruit.Fruit;
import java.ch04_OOP1.oopEating.meat.Meat;

public class Eater {
    //메서드
    public void whatEat(Fruit fruit) {
        VegeEater vegeEater = new VegeEater();
        vegeEater.vegetableEat(fruit);
    }

    public void whatEat(Meat meat) {
        MeatEater meatEater = new MeatEater(meat);
        meatEater.meatEat();
    }
}
