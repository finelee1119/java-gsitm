package ch06_array.dice;

import java.util.Random;

public class diceProblem2 {
    public static void main(String[] args) {
        // 주사위 2개를 36,000번 던졌을 때 각 번호가 나올 확률값
        // 소수 이하 6자리까지 구하기 : String.format("%.6f", 나온 수 / 30000)

        Random random = new Random();
        int randomNum1;
        int randomNum2;

        int[] dice1NumCount = {0,0,0,0,0,0};
        int[] dice2NumCount = {0,0,0,0,0,0};

        // 주사위 던지기
        for (int i = 0; i < 36000; i++) {
            randomNum1 = random.nextInt(6) + 1;
            dice1NumCount[randomNum1 - 1]++;

            randomNum2 = random.nextInt(6) + 1;
            dice2NumCount[randomNum2 - 1]++;
        }

        // 출력
        System.out.println("주사위1을 던진 횟수: " + (dice1NumCount[0] + dice1NumCount[1] + dice1NumCount[2] + dice1NumCount[3] + dice1NumCount[4] + dice1NumCount[5]));
        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%.6f", (double)(dice1NumCount[i]) / 36000));
        }

        System.out.println();
        System.out.println("주사위2를 던진 횟수: " + (dice2NumCount[0] + dice2NumCount[1] + dice2NumCount[2] + dice2NumCount[3] + dice2NumCount[4] + dice2NumCount[5]));
        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%.6f", (double)(dice2NumCount[i]) / 36000));
        }
    }
}
