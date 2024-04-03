package java.ch05_OOP2.compositionAndExtends;

public class Ch05App {
    public static void main(String[] args) {
        Engine engine = new Engine(); // 엔진을 사왔다(?)
        Car sonata = new Car(engine);
        System.out.println("엔진 마력은? " + sonata.engine.getPower());
        System.out.println("====================");


        CheeseHamburger cheeseHamburger = new CheeseHamburger();
        System.out.println(cheeseHamburger.name);
        System.out.println(cheeseHamburger.firstContent);
        System.out.println(cheeseHamburger.secondContent);
        System.out.println("====================");

        Hamburger hamburger = new Hamburger();
        System.out.println(hamburger.name);

        System.out.println("====================");
        ChickenHamburger chickenHamburger = new ChickenHamburger(hamburger);
        System.out.println(chickenHamburger.name);
        System.out.println(chickenHamburger.hamburger.secondContent);
    }
}
