package java.miniProject.vendingMachine.vendingMachine1;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] products = {"콜라", "사이다", "커피"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("※ 자판기 입니다. 상품 번호를 선택하세요.\n1: 콜라 2: 사이다 3: 커피 4: 종료");

        int input;

        while (true) {
            input = scanner.nextInt();

            if (1 <= input && input <= products.length) {
                System.out.println(products[input -1] + "를 선택했습니다.");
                System.out.println();
                System.out.println("※ 자판기 입니다. 상품 번호를 선택하세요.\n1: 콜라 2: 사이다 3: 커피 4: 종료");
            } else if (input == products.length + 1) {
                System.out.println("종료를 선택했습니다.");
                break;
            } else {
                System.out.println("잘못 선택하셨습니다. 다시 선택하세요.");
            }
        }

    }
}
