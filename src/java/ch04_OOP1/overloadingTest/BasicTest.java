package java.ch04_OOP1.overloadingTest;

public class BasicTest {

    // 생성자 
    // 오버로딩
    void run() {
        System.out.println("일반 달리기");
    }

    void run(int speed) {
        System.out.println("달리기: 정수");
    }

    void run(double speed) {
        System.out.println("달리기: 실수");
    }

    void run(int speed, double power) {
        System.out.println("달리기: 정수/실수");
    }


}
