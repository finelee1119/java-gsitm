package ch04_OOP1.attack;

public class 궁수 {
    //멤버변수
    String name = "궁수";

    //메서드
    void 기본공격() {
        System.out.println("활로 공격하기");
    }

    void 기본공격(광전사 e1) {
        System.out.println("활로 " + e1.name + " 공격하기");
    }

    void 기본공격(전사 e1) {
        System.out.println("검으로 " + e1.name + " 공격하기");
    }
}
