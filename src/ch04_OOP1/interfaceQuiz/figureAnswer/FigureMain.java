package ch04_OOP1.interfaceQuiz.figureAnswer;

public class FigureMain {
    public static void main(String[] args) {

        Figure triangle = new Triangle(5,10);
        System.out.println(triangle.getName() + "의 면적은 " + triangle.area());

        Figure rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getName() + "의 면적은 " + rectangle.area());

        Figure circle = new Circle(5);
        System.out.println(circle.getName() + "의 면적은 " + circle.area());

    }
}
