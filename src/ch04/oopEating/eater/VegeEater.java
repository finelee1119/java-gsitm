package ch04.oopEating.eater;

import ch04.oopEating.fruit.Fruit;

public class VegeEater {

    //멤버변수
    private Fruit fruit;
    private String name = "채식주의자";

    //메서드
    public void vegetableEat(Fruit fruit) {
        this.fruit = fruit;
        System.out.print(name + "가 ");
        fruit.eat();
    }

}
