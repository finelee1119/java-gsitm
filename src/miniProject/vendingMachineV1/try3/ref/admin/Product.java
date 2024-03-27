package miniProject.vendingMachineV1.try3.ref.admin;

public class Product {

    // 제품 목록
    public static final int MAX_PRODUCT = 5;
    public static String[] product = new String[MAX_PRODUCT];
    public static int[] price = new int[MAX_PRODUCT];
    public static int[] stock = new int[MAX_PRODUCT];

    // 제품 초기화
    public static void initialize() {
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 3;

        product[2] = "커피";
        price[2] = 1500;
        stock[2] = 3;
    }

}
