package ch06_conditionAndLoop.changeMoney.changeMoney2;

public class ChangeMoney {

    private int currentMoney = ChangeMoneyMain.currentMoney;

    private static final int FIFTY_THOUSAND_WON = 50000;
    private static final int TEN_THOUSAND_WON = 10000;
    private static final int THOUSAND_WON = 1000;
    private static final int FIVE_HUNDRED_WON = 500;
    private static final int HUNDRED_WON = 100;



    public void checkCurrentMoney() {
        System.out.println("바꿀 금액은 " + currentMoney + "원 입니다.");
    }

    public void changeMoney() {
        changeCurrency(FIFTY_THOUSAND_WON, "5만원권", "장");
        changeCurrency(TEN_THOUSAND_WON, "1만원권", "장");
        changeCurrency(THOUSAND_WON, "1천원권", "장");
        changeCurrency(FIVE_HUNDRED_WON, "5백원", "개");
        changeCurrency(HUNDRED_WON, "백원", "개");
    }

    private void changeCurrency(int money, String unitName, String unit) {
        System.out.println(unitName + ": " + (currentMoney / money) + unit);
        currentMoney %= money;
    }


    public void printCurrentMoney() {
        System.out.println("남은 금액은 " + currentMoney + "원 입니다.");
    }
}
