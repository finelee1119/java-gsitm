package java.ch04_OOP1.interfaceQuiz.figure;

public class Triangle extends Figure implements FigureInterface {
    private int width;
    private int height;

    @Override
    public double area() {
        return width * height * 0.5;
    }

    @Override
    public void setValues(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printResult() {
        System.out.println("삼각형의 넓이는 " + area() + " 입니다.");
    }

}
