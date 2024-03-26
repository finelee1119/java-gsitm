package ch05_OOP2.calcArea;

public class Triangle {

    Figure figure;

    //생성자
    public Triangle(Figure figure) {
        this.figure = figure;
    }

    //메서드
    public double calcTriangleArea() {
        return figure.getWidth() * figure.getHeight() * 0.5;
    }

    public void printResult() {
        System.out.println("너비: " + figure.getWidth() +
                ", 높이: " + figure.getHeight() +
                "인 삼각형의 넓이는 " + calcTriangleArea() + " 입니다.");
    }

}
