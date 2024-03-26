package ch06_conditionAndLoop.changeMoney.changeMoney1;

public class ChangeMoney {

    private int cMoney = ChangeMoneyMain.currentMoney;


    public void checkCurrentMoney() {
        System.out.println("바꿀 금액은 " + cMoney + "원 입니다.");
    }

    public void changeMoney() {
        System.out.println("5만원권 : " + (cMoney / 50000) + "장");
        cMoney %= 50000;

        System.out.println("1만원권 : " + (cMoney / 10000) + "장");
        cMoney %= 10000;

        System.out.println("1천원권 : " + (cMoney / 1000) + "장");
        cMoney %= 1000;

        System.out.println("500원 : " + (cMoney / 500) + "개");
        cMoney %= 500;

        System.out.println("100원 : " + (cMoney / 100) + "개");
        cMoney %= 100;
    }

    public void printCurrentMoney() {
        System.out.println("남은 금액은 " + cMoney + "원 입니다.");
    }
}
