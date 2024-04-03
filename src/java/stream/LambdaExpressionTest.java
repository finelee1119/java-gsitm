package java.stream;

public class LambdaExpressionTest {
    public static void main(String[] args) {
        Calc add = (x, y) -> {return x+y;};
        Calc minus = (a, b) -> a-b;
        Calc multiple = (x, y) -> {return x*y;};
        System.out.println(add.calc(3,4));
        System.out.println(minus.calc(10,5));
        System.out.println(multiple.calc(3,2));
    }
}
