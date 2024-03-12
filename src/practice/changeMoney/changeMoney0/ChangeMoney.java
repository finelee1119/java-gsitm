package practice.changeMoney.changeMoney0;

import java.util.Scanner;

public class ChangeMoney {

    static void exchangeMoney(int[] money, int currentMoney){

        for (int i = 0; i < money.length; i++) {
            System.out.println(money[i] + "원 : " + currentMoney / money[i] + "장");
            currentMoney %= money[i];
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentMoney;
        int[] money = {50000, 10000, 1000, 500, 100};
        String yesOrNo;

        do {
            System.out.print("변환할 금액을 입력하세요 : ");
            currentMoney = scanner.nextInt(); // 135200
            scanner.nextLine();
            exchangeMoney(money, currentMoney);

            System.out.print("계속하시겠습니까?(Y/N) : ");
            yesOrNo = scanner.nextLine().toUpperCase();

        } while (yesOrNo.equals("Y"));
    }
}
