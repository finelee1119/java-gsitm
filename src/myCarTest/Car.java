package myCarTest;

public class Car {
    // 멤버변수
    private String brand;
    private String carName;
    private String color;
    private int speed = 0;

    // 메서드
    void setCarInfo(String brand, String carName, String color) {
        this.brand = brand;
        this.carName = carName;
        this.color = color;
        System.out.println("브랜드명은 " + this.brand + " 입니다.");
        System.out.println("차종은 " + this.carName + " 입니다.");
        System.out.println("색상은 " + this.color + " 입니다.");
    }

    void currentSpeed(int currentSpeed) {
        this.speed = currentSpeed;
        System.out.println("현재 속도는 " + currentSpeed + "km 입니다.");
    }

    void speedUp(int increaseSpeed) {
         this.speed += increaseSpeed;
        if (this.speed >= 100) {
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
            System.out.println("과속입니다.");
        } else {
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
        }
    }

    void stop(int decreaseSpeed) {
        this.speed -= decreaseSpeed;
        if (this.speed > 0) {
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
        } else {
            this.speed = 0;
            System.out.println("현재 속도는 " + this.speed + "km 입니다.");
            System.out.println("멈췄습니다.");
        }
    }
}
