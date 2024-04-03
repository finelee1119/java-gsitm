package java.miniProject.vendingMachineV1.try0;

import java.util.Scanner;

public class Main2 {
    //멤버변수
    private static final int MAX_PRODUCT = 5;
    public static String[] product = new String[MAX_PRODUCT];
    public static int[] price = new int[MAX_PRODUCT];
    public static int[] stock = new int[MAX_PRODUCT];

    // 메서드
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

    public static void main(String[] args) {
        // 객체 세팅
        Scanner scanner = new Scanner(System.in);

        // 초기 세팅
        initialize();

        // 사용자 메뉴 확인
        System.out.println("=================================================================================");
        System.out.println("자판기 입니다.(번호:상품(가격)-재고)");
        for (int i = 0; i < MAX_PRODUCT; i++) {
            if (product[i] != null) { // 등록완료된 만큼만 출력
                System.out.print((i+1) + ":" + product[i] + "(" + price[i] + "W)-" + stock[i] + "개 ");
            }
        }
        System.out.println();
        System.out.println("=================================================================================");

        // 처음에만 금액을 입력 받기
        boolean firstBuy = true;
        if (firstBuy) {
            System.out.print("돈을 넣어주세요: ");
            int insertMoney = scanner.nextInt();
            firstBuy = false;
        }

        // 사용자 메뉴 선택
        System.out.print("메뉴 입력: ");



    }
}
