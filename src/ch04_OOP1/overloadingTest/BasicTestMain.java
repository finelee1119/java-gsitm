package ch04_OOP1.overloadingTest;

public class BasicTestMain {
    public static void main(String[] args) {
        BasicTest test = new BasicTest();
        test.run();
        test.run(5);
        test.run(5.0);
        test.run(3,5.0);

    }
}
