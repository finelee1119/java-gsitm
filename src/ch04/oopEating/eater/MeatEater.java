package ch04.oopEating.eater;

import ch04.oopEating.meat.Meat;

public class MeatEater {

    //멤버변수
    private Meat meat;
    private String name = "육식주의자";

    //생성자
    public MeatEater(Meat meat) {
        this.meat = meat;
    }

    //메서드
    public void meatEat() {
        System.out.print(name + "가 ");
        meat.eat();
    }

}
