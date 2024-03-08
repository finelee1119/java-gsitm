package vendingMachine.vendingMachine0;

public class VMachine {
    String name;
    int currentMoney = 0; // 투입 금액
    int productPrice; // 상품 가격

    void insertMoney(int money) {
        currentMoney = currentMoney + money;
        currentMoneyPrint();
    }

    void serveCola() {
        if (currentMoney < productPrice) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println(name + " 1개를 드립니다.");
            currentMoney = currentMoney - productPrice;
            currentMoneyPrint();
            VendingMachineMain.totalMoney += productPrice;
        }
    }

    void currentMoneyPrint() {
        System.out.println("현재 잔액은 " + currentMoney + "원 입니다.");
    }
}
