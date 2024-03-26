package ch04_OOP1.animalApp;

public class Cat {
    //멤버변수
    String name;
    String color;

    //생성자
    public Cat() {
        // 기본 생성자(Default Constructor)
    }

    public Cat(String cName, String cColor) {
        // 매개변수 있는 생성자 // 오버로딩
        System.out.println("고양이가 탄생했습니다.");
        name = cName;
        color = cColor;
    }

    //메서드
}
