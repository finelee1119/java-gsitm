package ch04_OOP1.starcraft;

public class Zealot extends ProtosUnit {
    //멤버변수
    String name = "질럿";

    //메서드
    @Override
    void basicAttack(ProtosUnit e1) { // 공격대상이 누구든 폭넓게 처리 가능
        System.out.println("질럿 메서드");
        System.out.println(this.name + "이 " + e1.checkName() + "을 공격합니다."); // 메서드를 통해 멤버변수 접근
    }

    @Override
    String checkName() {
        return this.name;
    }
}
