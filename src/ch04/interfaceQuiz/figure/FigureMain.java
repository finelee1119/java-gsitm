package ch04.interfaceQuiz.figure;

public class FigureMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setValues(5,10);
        triangle.printResult();

        Rectangle rectangle = new Rectangle();
        rectangle.setValues(5,10);
        rectangle.printResult();

        Circle circle = new Circle();
        circle.printResult();

    }
}
