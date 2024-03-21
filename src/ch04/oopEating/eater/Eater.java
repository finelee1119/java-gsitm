package ch04.oopEating.eater;

import ch04.oopEating.fruit.Fruit;
import ch04.oopEating.meat.Meat;

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
