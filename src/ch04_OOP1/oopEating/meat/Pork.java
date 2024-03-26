package ch04_OOP1.oopEating.meat;

public class Pork extends Meat {
    //멤버변수
    private String brand = "한돈";
    private String name = "돼지고기";

    //메서드
    @Override
    public void eat() {
        System.out.println(brand + " " + name + "를 먹어요.");
    }
}
