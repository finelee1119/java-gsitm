package java.ch04_OOP1.starcraft;

public class ProtosUnit {
    //멤버변수
    String name = "프로토스유닛";

    //메서드
    void basicAttack(ProtosUnit e1) {
        System.out.println("프로토스유닛 메서드");
    }

    String checkName() {
        return this.name;
    }
}
