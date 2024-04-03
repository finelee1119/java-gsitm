package java.ch04_OOP1.interfaceQuiz.remocon;

public class RemoconMain {
    public static void main(String[] args) {

        TV samsungTV = new SamsungTV();
        TV lgtv = new LGTV();
        Remocon remocon1 = new Remocon(samsungTV);
        Remocon remocon2 = new Remocon(lgtv);

        remocon1.greenButton(); // 전원 켜짐
        remocon1.redButton(); // 전원 꺼짐
        remocon2.greenButton(); // 전원 켜짐
        remocon2.redButton(); // 전원 꺼짐

    }
}
