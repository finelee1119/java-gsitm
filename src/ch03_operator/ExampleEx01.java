package ch03_operator;

public class ExampleEx01 {
    static double calc(double gasoline, double distance) {
        return distance / gasoline;
    }

    public static void main(String[] args) {
        System.out.println("연비: " + (int)calc(8.86, 182.736) + "km/L");
    }
}
