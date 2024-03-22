package ch04.interfaceQuiz.figure;

public class Circle extends Figure implements FigureInterface {
    private int radius = 5;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void setValues(int width, int height) {
        return;
    }

    public void printResult() {
        System.out.println("원의 넓이는 " + area() + " 입니다.");
    }
}
