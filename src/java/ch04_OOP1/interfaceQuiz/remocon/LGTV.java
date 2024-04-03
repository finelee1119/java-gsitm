package java.ch04_OOP1.interfaceQuiz.remocon;

public class LGTV extends TV {

    private String name = "엘지TV";

    @Override
    public void turnOn() {
        System.out.println(name + "가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + "가 꺼졌습니다.");
    }

}
