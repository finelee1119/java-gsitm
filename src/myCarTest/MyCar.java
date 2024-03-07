package myCarTest;

public class MyCar {
    public static void main(String[] args) {
      // Car를 생성합니다.
        Car car = new Car();
        car.setCarInfo("Hyundai", "Sonata", "White");

      // 속도 설정 및 가속 (10가속)
        System.out.println("------------------------");
        car.currentSpeed(50);;
        car.speedUp(10);

      // 속도 설정 및 감속 (멈춰보기)
        System.out.println("------------------------");
        car.currentSpeed(40);;
        car.stop(10);
        car.stop(10);
        car.stop(10);
        car.stop(10);

      // 속도 설정 및 가속 (과속)
        System.out.println("------------------------");
        car.currentSpeed(0);;
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
        car.speedUp(10);
    }
}
