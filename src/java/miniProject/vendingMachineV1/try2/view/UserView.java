package java.miniProject.vendingMachineV1.try2.view;

import java.util.Scanner;
import java.miniProject.vendingMachineV1.try2.service.UserService;

public class UserView {
    private Scanner scanner = new Scanner(System.in);
    private UserService userService;

    private String[] product;
    private int[] price;
    private int[] stock;
    private int firstMoney = 0;
    private int menuIndex = 0;

    public UserView(UserService userService) {
        this.userService = userService;
    }

    public void setUserMenu(String[] product, int[] price, int[] stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    public void userView() {
        showMenu();
        firstBuy();
        selectMenu();
        userService.outProduct(firstMoney, menuIndex);
    }

    private void showMenu() {
        printLine();
        System.out.println("자판기 입니다.(번호:상품(가격)-재고)");
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                System.out.print((i + 1) + ":" + product[i] + "(" + price[i] + "W)-" + stock[i] + "개 ");
            }
        }
        System.out.println();
        printLine();
    }

    private void firstBuy() {
        if (firstMoney == 0) {
            System.out.print("돈을 넣어주세요: ");
            firstMoney = scanner.nextInt();
        }
    }

    private void selectMenu() {
        System.out.print("메뉴번호 입력: ");
        int menuNumber = scanner.nextInt();
        menuIndex = menuNumber - 1;
    }

    private void printLine() {
        System.out.println("=================================================================================");
    }
}