package practice.changeMoney.changeMoney2;

public class ChangeMoneyMain {
    static int currentMoney = 135200;
    public static void main(String[] args) {

        ChangeMoney changeMoney = new ChangeMoney();

        changeMoney.checkCurrentMoney();
        changeMoney.changeMoney();
        changeMoney.printCurrentMoney();

    }
}


