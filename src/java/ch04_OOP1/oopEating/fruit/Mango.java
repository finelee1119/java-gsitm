package java.ch04_OOP1.oopEating.fruit;

public class Mango extends Fruit {
    //멤버변수
    private String name = "망고";
    private String taste = "달콤한 맛";

    //메서드
    @Override
    public void eat() {
        System.out.println(taste + "의 " + name + "를 먹어요.");
    }
}
