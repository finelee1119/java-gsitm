package practice.LegacyVendingMachine.try2;

public class Initialize {
    //멤버변수
    public static final int MAX_PRODUCT = 5;
    public static String[] product = new String[MAX_PRODUCT];
    public static int[] price = new int[MAX_PRODUCT];
    public static int[] stock = new int[MAX_PRODUCT];

    // 메서드
    public static void initializeMenu() {
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
