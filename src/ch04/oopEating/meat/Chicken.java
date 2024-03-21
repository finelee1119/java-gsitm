package ch04.oopEating.meat;

public class Chicken extends Meat {
    //멤버변수
    private String brand = "하림";
    private String name = "닭고기";

    //메서드
    @Override
    public void eat() {
        System.out.println(brand + " " + name + "를 먹어요.");
    }
}
