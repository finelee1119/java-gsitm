package generic;

// 경우에 따라 문자열을 담기도 하고 숫자도 담는 클래스 생성

class Basket {
    Object data;
}

public class GenericEx01 {
    public static void main(String[] args) {
        Basket b1 = new Basket();
        b1.data = 1;
        System.out.println(b1.data);

        Basket b2 = new Basket();
        b2.data = "문자열";
        System.out.println(b2.data);

    }
}
