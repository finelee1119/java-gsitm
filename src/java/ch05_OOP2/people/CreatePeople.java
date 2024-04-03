package java.ch05_OOP2.people;

public class CreatePeople {
    public static void main(String[] args) {
        People p = new People();
        p.eat();

        Man m = new Man("남자"); // 자식 기준
        m.goToArmy(); // 공익

        People p2 = new Man(); // 부모 기준
        p2.goToArmy(); // but 오버라이딩이 우선 : 공익


        // 이 코드에서는 "People"이라는 [부모 클래스의 참조 변수를 사용]하여
        // "Man" 클래스의 인스턴스를 참조하고 있습니다.

        // 이 경우 컴파일러는 변수의 타입을 기반으로 메서드를 선택하지 않고,
        // [객체의 실제 타입]을 기반으로 메서드를 선택합니다.

        //따라서 "Man" 클래스에서 오버라이딩된 "goToArmy()" 메서드가 호출됩니다.
        // 부모 클래스인 "People"의 메서드가 호출되지 않습니다.

        // 이것이 다형성(polymorphism)의 개념으로,
        // 자식 클래스에서 재정의(overriding)된 메서드가 부모 클래스의 메서드를 가려버리는 특성입니다.

    }
}
