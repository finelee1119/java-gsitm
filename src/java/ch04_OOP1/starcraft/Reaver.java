package java.ch04_OOP1.starcraft;

public class Reaver extends ProtosUnit {
    //멤버변수
    String name = "리버";

    //메서드
    @Override
    void basicAttack(ProtosUnit e1) {
        System.out.println("리버 메서드");
        System.out.println(this.name + "가 " + e1.checkName() + "을 공격합니다."); // 메서드를 통해 멤버변수 접근
    }

    @Override
    String checkName() {
        return this.name;
    }
}
