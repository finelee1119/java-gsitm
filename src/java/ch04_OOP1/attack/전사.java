package java.ch04_OOP1.attack;

public class 전사 {
    //멤버변수
    String name = "전사";

    //메서드
    void 기본공격() {
        System.out.println("검으로 공격하기");
    }

    void 기본공격(궁수 e1) {
        System.out.println("검으로 " + e1.name + " 공격하기");
    }

    void 기본공격(광전사 e1) {
        System.out.println("검으로 " + e1.name + " 공격하기");
    }

}
