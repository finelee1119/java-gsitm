package ch06_array.dice;

import java.util.Random;

public class diceProblem1 {
    public static void main(String[] args) {
        // 주사위 1개를 30,000번 던졌을 때 각 번호가 나올 확률값
        // 소수 이하 6자리까지 구하기 : String.format("%.6f", 나온 수 / 30000)

        Random random = new Random();
        final int COUNT = 30000;
        int randomNum;
        int[] diceNumCount = {0,0,0,0,0,0};

        // 주사위 던지기
        for (int i = 0; i < COUNT; i++) {
            randomNum = random.nextInt(6) + 1;

            diceNumCount[randomNum - 1]++;
        }

        // 출력
        System.out.println("주사위를 던진 횟수: " + (diceNumCount[0] + diceNumCount[1] + diceNumCount[2] + diceNumCount[3] + diceNumCount[4] + diceNumCount[5]));

        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%.6f", (double)(diceNumCount[i]) / COUNT));
        }


    }
}
