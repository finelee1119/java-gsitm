package myCarTest;

public class Car {
    // 멤버변수
    final String brand = "Hyundai";
    final String carName = "Sonata";
    private String color;
    private int speed = 0;

    // 메서드
    void SetColor(String color) {
        this.color = color;
        System.out.println("색상은 " + this.color + " 입니다.");
    }

    void setCurrentSpeed(int speed) {
        this.speed = speed;
        System.out.println("현재 속도는 " + this.speed + "km 입니다.");
    }

    void speedUp(int speed) {
        this.speed += speed;
        if (this.speed >= 100) {
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
            System.out.println("과속입니다.");
        } else {
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
        }
    }

    void stop(int speed) {
        this.speed -= speed;
        if (this.speed > 0) {
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
        } else {
            this.speed = 0;
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
            System.out.println("멈췄습니다.");
        }
    }
}
