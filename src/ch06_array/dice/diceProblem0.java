package ch06_array.dice;

import java.util.Random;

public class diceProblem0 {
    public static void main(String[] args) {
        // 주사위 1개를 30,000번 던졌을 때 각 번호가 나올 확률값
        // 소수 이하 6자리까지 구하기 : String.format("%.6f", 나온 수 / 30000)

        Random random = new Random();

        final int COUNT = 30000;
        int[] diceNumCount = new int[6];

        for (int i = 0; i < COUNT; i++) {
            int randomNum = random.nextInt(6) + 1;
            diceNumCount[randomNum - 1]++ ;
        }

        for (int i = 0; i < diceNumCount.length; i++) {
            System.out.println(i+1+"번 눈의 출현 확률: " +
                    String.format("%.6f", (double)(diceNumCount[i]) / COUNT));
        }
    }
}
