package ch04.a;

public class Cal {

    void plus() { // 동일패키지
        System.out.println("Plus");
    }

    private void minus() { // 동일클래스
        System.out.println("Minus");
    }

    public void multi() { // 모두 접근 가능
        System.out.println("Multi");
    }

    protected void divide() { // 동일패키지 + 상속 받은 클래스
        System.out.println("Divide");
    }

//    public: 다른 모든 클래스에서 해당 멤버에 접근할 수 있습니다. 즉, public 멤버는 외부에 공개됩니다.
//    protected: 동일한 패키지 내의 클래스와 해당 클래스를 상속한 하위 클래스에서만 접근할 수 있습니다. 즉, protected 멤버는 상속 관계에서 하위 클래스에게만 공개됩니다.
//    default (package-private): 접근 제어자를 명시적으로 지정하지 않았을 때의 기본값입니다. 동일한 패키지 내의 클래스에서만 해당 멤버에 접근할 수 있습니다. 다른 패키지에서는 접근할 수 없습니다.
//    private: 동일한 클래스 내에서만 해당 멤버에 접근할 수 있습니다. 다른 클래스에서는 접근할 수 없습니다. 즉, private 멤버는 클래스 내부에서만 사용됩니다.

}
