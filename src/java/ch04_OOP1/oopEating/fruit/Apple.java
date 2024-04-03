package java.ch04_OOP1.oopEating.fruit;

public class Apple extends Fruit {
    //멤버변수
    private String name = "사과";
    private String taste = "신맛";

    //메서드
    @Override
    public void eat() {
        System.out.println(taste + "의 " + name + "를 먹어요.");
    }

    public void wow() {
        System.out.println("아이셔! 사과");
    }
}
