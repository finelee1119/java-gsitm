package ch04_OOP1.myCarTest.myCarTest0;

public class MyCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car blueSonata = new Car();

        car.color = "red";
        System.out.println("내 차의 색상: " + car.color + " 입니다.");

        car.speedUp(10);

        car.stop();
        car.stop();

        System.out.println("-----------------------");
        blueSonata.color = "blue";
        blueSonata.speedUp(100);
    }
}
