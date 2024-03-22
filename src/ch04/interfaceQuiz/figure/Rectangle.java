package ch04.interfaceQuiz.figure;

public class Rectangle extends Figure implements FigureInterface {
    private int width;
    private int height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void setValues(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printResult() {
        System.out.println("사각형의 넓이는 " + area() + " 입니다.");
    }
}
