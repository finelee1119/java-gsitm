package practice.myCarTest.myCarTest1;

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

        for (int i = 0; i < 4; i++) {
            car.stop(10);
        }

      // 속도 설정 및 가속 (과속)
        System.out.println("------------------------");
        car.currentSpeed(0);;

        for (int i = 0; i < 11; i++) {
            car.speedUp(10);
        }
    }
}
