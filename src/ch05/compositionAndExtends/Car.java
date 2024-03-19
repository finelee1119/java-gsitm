package ch05.compositionAndExtends;

public class Car {
    Engine engine; // 이미 만들어진 엔진 쓰겠다

    public Car(Engine engine) { // 차를 생성할 때 엔진을 얹겠다
        this.engine = engine;
    }
}

