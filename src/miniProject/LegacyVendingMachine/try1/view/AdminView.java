package miniProject.LegacyVendingMachine.try1.view;

public class AdminView {
    public static final int MAX_PRODUCTS = 5; // 자판기에서 판매할 최대 제품 수
    public String[] product = new String[MAX_PRODUCTS]; // 제품 이름 배열
    public int[] price = new int[MAX_PRODUCTS];         // 제품 가격 배열
    public int[] stock = new int[MAX_PRODUCTS];         // 제품 재고 배열

    public void initialize() {
        // 자판기의 초기 메뉴 설정(제품명, 가격, 재고)
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 4;

        product[2] = "커피";
        price[2]= 1500;
        stock[2] = 5;
    }

    public void adminView() {
        // 관리자 뷰의 메서드 내부에서 초기화 메서드 호출
        initialize();

        // 관리자 뷰의 나머지 동작 수행

    }
}
