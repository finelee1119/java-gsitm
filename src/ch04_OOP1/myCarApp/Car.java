package ch04_OOP1.myCarApp;

public class Car {
    //멤버변수
    private String brand;
    private String carName;
    private String color;
    private int nowSpeed = 0;

    //생성자
    public Car(String brand, String carName) {
        this.brand = brand;
        this.carName = carName;
    }

    //메서드
    public String getBrand() {
        return brand;
    }

    public String getCarName() {
        return carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("내 차의 브랜드: " + this.brand);
        System.out.println("내 차의 이름: " + this.carName);
        System.out.println("내 차의 색상: " + this.color);
    }

    public int getNowSpeed() {
        return nowSpeed;
    }

    void speedUp(int speed) {
        this.nowSpeed = this.nowSpeed + speed;

        if (this.nowSpeed >= 100) {
            currentSpeed();
            System.out.println("과속입니다.");
        } else {
            currentSpeed();
        }

    }

    void stop() {
        this.nowSpeed = this.nowSpeed - 10;

        if (this.nowSpeed <= 0) {
            this.nowSpeed = 0;
            currentSpeed();
            System.out.println("멈췄습니다.");
        } else {
            currentSpeed();
        }

    }

    void currentSpeed() {
        System.out.println("현재 속도는 " + this.nowSpeed + " km 입니다.");
    }

}
