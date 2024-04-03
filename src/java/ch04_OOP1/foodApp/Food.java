package java.ch04_OOP1.foodApp;

public class Food {
    //멤버변수
    private String name;
    private int price;

    //생성자
    public Food() {
    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //메서드
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void myprint() {
        System.out.println(this.name + " 가격은 " + this.price + "원 입니다.");
    }
}
