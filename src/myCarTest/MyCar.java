package myCarTest;

public class MyCar {
    public static void main(String[] args) {
      // Car를 생성합니다.
        Car car = new Car();
        System.out.println("차량을 구입했습니다.");
        System.out.println("브랜드명은 " + car.brand + " 입니다.");
        System.out.println("차종은 " + car.carName + " 입니다.");

      // 색상 설정
        car.SetColor("White");

      // 속도 설정 및 가속 (10가속)
        System.out.println("------------------------");
        car.setCurrentSpeed(50);;
        car.speedUp(10);

      // 속도 설정 및 감속 (멈춰보기)
        System.out.println("------------------------");
        car.setCurrentSpeed(40);;
        car.stop(10);
        car.stop(10);
        car.stop(10);
        car.stop(10);

      // 속도 설정 및 가속 (과속)
        System.out.println("------------------------");
        car.setCurrentSpeed(0);;
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
