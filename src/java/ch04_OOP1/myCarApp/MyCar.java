package java.ch04_OOP1.myCarApp;

public class MyCar {
    public static void main(String[] args) {
        Car sonata = new Car("현대", "소나타");
        Car k5 = new Car("기아", "K5");

        sonata.setColor("red");
        sonata.printInfo();
        sonata.speedUp(10);
        System.out.println("현재 스피드: " + sonata.getNowSpeed() + " km");
        sonata.stop();
        sonata.stop();

        System.out.println("-----------------------");

        k5.setColor("blue");
        k5.printInfo();
        k5.speedUp(100);
    }
}
