package java.ch04_OOP1.interfaceQuiz.remoconAnswer;

public class SamsungTVImpl implements RemoconAble {
    @Override
    public void greenButton() {
        System.out.println("삼성TV 전원이 켜졌습니다.");
    }

    @Override
    public void redButton() {
        System.out.println("삼성TV 전원이 꺼졌습니다.");
    }
}
