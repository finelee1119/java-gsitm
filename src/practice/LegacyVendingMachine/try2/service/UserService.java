package practice.LegacyVendingMachine.try2.service;

import java.util.Scanner;
import practice.LegacyVendingMachine.try2.view.UserView;
import static practice.LegacyVendingMachine.try2.Initialize.*;

public class UserService {

    private Scanner scanner = new Scanner(System.in);
    private UserView userView;

    public void outProduct(int firstMoney, int menuIndex) {
        if ((firstMoney >= price[menuIndex]) && (stock[menuIndex] > 0)) {
            System.out.println(product[menuIndex] + " 나왔습니다.");
            calculateCurrentMoney(firstMoney, menuIndex);
            calculateCurrentStock(menuIndex);
            showNextAction();
            selectNextAction();
        } else if (firstMoney < price[menuIndex]) {
            System.out.println("금액이 부족합니다.");
            System.out.println("잔액: " + firstMoney + "원");
        } else if (stock[menuIndex] >= 0) {
            System.out.println("재고가 부족합니다.");
            System.out.println("재고: " + product[menuIndex] + " " + stock[menuIndex] + "개");
        }
    }

    private void calculateCurrentMoney(int firstMoney, int menuIndex) {
        firstMoney -= price[menuIndex];
        System.out.println("잔액: " + firstMoney + "원");
    }

    private void calculateCurrentStock(int menuIndex) {
        stock[menuIndex]--;
        System.out.println("재고: " + product[menuIndex] + " " + stock[menuIndex] + "개");
    }

    private void showNextAction() {
        System.out.println("1: 계속 구매하기 2: 금액 추가하기 3: 잔돈 반환하기");
    }

    private void selectNextAction() {
        System.out.print("번호 입력: ");
        int actionNumber = scanner.nextInt();

        if (actionNumber == 1) {
            userView.userView();
        } else if (actionNumber == 2) {
            // 금액 추가하기에 대한 로직 추가
        } else if (actionNumber == 3) {
            // 잔돈 반환하기에 대한 로직 추가
        }
    }

    private void outOfMoney() {
        // 금액 부족시 동작 로직 추가
    }

    private void outOfStock() {
        // 재고 부족시 동작 로직 추가
    }
}