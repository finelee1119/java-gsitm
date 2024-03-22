package ch04.interfaceQuiz.figureAnswer;

public class Rectangle extends Figure implements FigureInterface {

    //멤버변수
    private String name = "사각형";
    private int width;
    private int height;

    //생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //메서드
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

}
