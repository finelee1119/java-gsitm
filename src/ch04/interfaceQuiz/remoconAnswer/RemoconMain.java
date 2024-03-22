package ch04.interfaceQuiz.remoconAnswer;

public class RemoconMain {
    public static void main(String[] args) {
        // 버전1
        SamsungTVImpl samsungTV = new SamsungTVImpl();
        LGTVImpl lgtv = new LGTVImpl();

        samsungTV.greenButton();
        samsungTV.redButton();
        lgtv.greenButton();
        lgtv.redButton();

        System.out.println("========================");

        // 버전2 : RemoconAble 타입으로 묶일 수 있어 더 효율적!
        RemoconAble ss = new SamsungTVImpl();
        RemoconAble lg = new LGTVImpl();

        ss.greenButton();
        ss.redButton();
        lg.greenButton();
        lg.redButton();
    }
}
