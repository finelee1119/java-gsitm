package java.miniProject.vendingMachineV1.try0;

import java.util.Scanner;

public class Main0 {
    // 초기값 세팅
    static Scanner scanner = new Scanner(System.in);
    static final int MAX = 5; // 최대로 취급 가능한 제품 수
    static String[] product = new String[MAX]; // 제품 배열
    static int[] price = new int[MAX]; // 가격 배열
    static int[] stock = new int[MAX]; // 재고 배열
    static int currentMoney = 0; // 사용자가 넣은 돈
    static int profit = 0; // 관리자의 총 수익계산용

    // 메서드
    public static void initialize() {
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 4;

        product[2] = "커피";
        price[2] = 1500;
        stock[2] = 5;
    }

    public static void user() {
        boolean inputMoney = true;

        while (true) { // 계속 돌아가게 하기
            System.out.println("=============================================================================");
            System.out.println("자판기 입니다. [번호: 상품(가격)-재고]");

            // 판매중인 상품 정보를 보여줍니다.
            for (int i = 0; i < product.length; i++) {
                if (product[i] != null) {
                    System.out.print((i+1) + ": " + product[i] + "(" + price[i] + "W)-" + stock[i] + "개 ");
                }
            }
            System.out.println();
            System.out.println("=============================================================================");

            // 처음에만 금액을 입력 받기
            if (inputMoney == true) {
                System.out.print("돈을 넣어주세요: ");
                currentMoney = scanner.nextInt();
                System.out.println("현재 잔액은 " + currentMoney + "원 입니다.");
                inputMoney = false;
            }

            // 처음이 아닌 경우 제품번호 입력 받기
            System.out.print("제품번호를 입력하세요: ");
            int menuPickNum = scanner.nextInt();

            if (currentMoney >= price[menuPickNum-1] && stock[menuPickNum-1] > 0) {
                System.out.println(product[menuPickNum-1] + " 나왔습니다.");
                
                // 잔액 및 재고 감소시키기
                currentMoney -= price[menuPickNum-1];
                stock[menuPickNum-1] --;

                // 잔액 및 재고 보여주기
                System.out.println("잔액: " + currentMoney);
                System.out.println("재고: " + stock[menuPickNum-1]);

            } else if (currentMoney < price[menuPickNum - 1]) {
                System.out.println("잔액이 부족합니다.");
                System.out.println("잔액: " + currentMoney);

            } else if (stock[menuPickNum-1] <= 0) {
                System.out.println("재고가 부족합니다.");
            }

            // 메뉴 보여주고 입력 받기
            System.out.println();
            System.out.println("1:계속 구매하기 2:금액 추가하기 3: 잔돈반환하기");
            System.out.print("번호를 입력하세요: ");
            int actionNum = scanner.nextInt();

            // 메뉴번호에 따라 처리하기
            if (actionNum == 1) {
                System.out.println("계속 구매하기를 선택하셨습니다.");
            } else if (actionNum == 2) { // 변수 추가
                System.out.print("추가 금액: ");
                int plusMoney = scanner.nextInt();
                int totalMoney = currentMoney + plusMoney;
                System.out.println("현재 잔액은 " + totalMoney + "원 입니다.");
            } else if (actionNum == 3) {
                System.out.println("남은 돈 " + currentMoney + "원이 반환됩니다. \n감사합니다. 다음에 또 이용해주세요.");
                inputMoney = true;
            }
        }
    }

    public static void main(String[] args) {
        initialize();
        user();
        return;

    }
}
