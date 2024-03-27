package miniProject.vendingMachineV1.try0;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        initialize(); // 자판기 초기값 설정
        user(); // 사용자 메뉴 처리
        return;
    }

    public static void initialize(){
        String[] product = new String[5];
        product[0] = "콜라";
        product[1] = "사이다";
        product[2] = "커피";

        int[] price = new int[5];
        price[0] = 500;
        price[1] = 700;
        price[2] = 1500;

        int[] stock = new int[5];
        stock[0] = 3;
        stock[1] = 3;
        stock[2] = 3;
    }

    public static void user() {
        System.out.println("===============================================");
        System.out.println("자판기 입니다.(번호: 상품(가격)-재고)");
        System.out.println(
                "1:콜라(500W)-3개 " +
                "2:사이다(700W)-3개 " +
                "3:커피(1500W)-3개"
        );
        System.out.println("===============================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("돈을 넣어주세요: ");
        int firstInput = scanner.nextInt();

        if (firstInput == 1004) {
            admin(); // 관리자 메뉴 처리
        }
    }

    public static void admin() {

    }
}
