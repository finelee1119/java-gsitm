package ch04_OOP1.interfaceQuiz.remocon;

public class Remocon implements RemoconAble{

    // 멤버변수
    private TV tv;

    // 생성자
    public Remocon(TV tv) {
        this.tv = tv;
    }

    // 메서드
    @Override
    public void greenButton() {
        tv.turnOn();
    }

    @Override
    public void redButton() {
        tv.turnOff();
    }

}
