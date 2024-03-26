package ch05_OOP2.calcArea;

public class CalcMain {
    public static void main(String[] args) {

        // 삼각형의 너비와 높이를 줘 생성한 후
        // 넓이를 출력하기
        Figure figure1 = new Figure(3,5);
        Triangle triangle = new Triangle(figure1);
        triangle.printResult();


        // 사각형의 너비와 높이를 줘 생성한 후
        // 넓이를 출력하기
        Figure figure2 = new Figure(3,5);
        Rectangle rectangle = new Rectangle(figure2);
        rectangle.printResult();
    }
}
