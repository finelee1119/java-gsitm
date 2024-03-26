package ch04_OOP1.abstractTest;

public abstract class Animal {

    void hello() {
        System.out.println("나는 동물 입니다.");
    }

    abstract void speak(); // 추상 메서드: 자식 클래스에서 구현될 것이라 바디가 필요없음

}
