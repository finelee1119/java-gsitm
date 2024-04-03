package java.ch04_OOP1.starcraft;

public class Dragoon extends ProtosUnit {
    //멤버변수
    String name = "드라군";

    //메서드
    @Override
    void basicAttack(ProtosUnit e1) {
        System.out.println("드라군 메서드");
        System.out.println(this.name + "이 " + e1.checkName() + "을 공격합니다.");
    }

    @Override
    String checkName() {
        return this.name;
    }
}
