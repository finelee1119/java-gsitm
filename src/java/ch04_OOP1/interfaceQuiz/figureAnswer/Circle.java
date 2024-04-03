package java.ch04_OOP1.interfaceQuiz.figureAnswer;

public class Circle extends Figure implements FigureInterface {
    //멤버변수
    private String name = "원";
    private int radius;

    //생성자
    public Circle(int radius) {
        this.radius = radius;
    }

    //메서드
    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void setWidth(int width) {
    }

    @Override
    public void setHeight(int height) {
    }

    @Override
    public String getName() {
        return name;
    }


}
