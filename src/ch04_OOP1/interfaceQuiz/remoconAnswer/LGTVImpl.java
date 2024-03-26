package ch04_OOP1.interfaceQuiz.remoconAnswer;

public class LGTVImpl implements RemoconAble {
    @Override
    public void greenButton() {
        System.out.println("엘지TV 전원이 켜졌습니다.");
    }

    @Override
    public void redButton() {
        System.out.println("엘지TV 전원이 꺼졌습니다.");
    }
}
