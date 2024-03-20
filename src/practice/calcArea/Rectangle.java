package practice.calcArea;

public class Rectangle {

    Figure figure;

    //생성자
    public Rectangle(Figure figure) {
        this.figure = figure;
    }

    //메서드
    public double calcRectangleArea() {
        return figure.getWidth() * figure.getHeight();
    }

    public void printResult() {
        System.out.println("너비: " + figure.getWidth() +
                ", 높이: " + figure.getHeight() +
                "인 사각형의 넓이는 " + calcRectangleArea() + " 입니다.");
    }

}
