package ch05_OOP2.calcArea;

public class Figure {
    //멤버변수
    private int width; // 도형의 너비
    private int height; // 도형의 높이

    //생성자
    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //메서드
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
