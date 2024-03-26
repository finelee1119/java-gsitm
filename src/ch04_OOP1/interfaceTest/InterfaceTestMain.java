package ch04_OOP1.interfaceTest;

public class InterfaceTestMain {

    static void joyStick(WildAnimalImpl wildAnimal) {
        wildAnimal.down();
        wildAnimal.up();
        wildAnimal.left();
        wildAnimal.right();
        wildAnimal.attack();
    }

    static void joyStick(MildAnimalImpl mildAnimal) {
        mildAnimal.down();
        mildAnimal.up();
        mildAnimal.left();
        mildAnimal.right();
        System.out.println(mildAnimal.hide());
        mildAnimal.gather();
    }

    public static void main(String[] args) {
        //초식동물
        Cow cow = new Cow();

        cow.gather();
        System.out.println(cow.hide());

        // 구분
        System.out.println("============================");

        //육식동물
        Tiger tiger = new Tiger();
        Rhino rhino = new Rhino();

        joyStick(rhino);
        tiger.attack();
        tiger.down();

        Hyena hyena = new Hyena();
        hyena.smell();
    }
}
