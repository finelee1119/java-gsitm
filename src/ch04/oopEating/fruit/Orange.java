package ch04.oopEating.fruit;

public class Orange extends Fruit {
    //멤버변수
    private String name = "오렌지";
    private String taste = "시큼한 맛";

    //메서드
    @Override
    public void eat() {
        System.out.println(taste + "의 " + name + "를 먹어요.");
    }
}
