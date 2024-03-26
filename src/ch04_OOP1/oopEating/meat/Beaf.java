package ch04_OOP1.oopEating.meat;

public class Beaf extends Meat {
    //멤버변수
    private String brand = "한우";
    private String name = "소고기";

    //메서드
    @Override
    public void eat() {
        System.out.println(brand + " " + name + "를 먹어요.");
    }
}
