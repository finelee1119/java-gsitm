package ch06_conditionAndLoop.quiz;

import java.util.Scanner;

public class BetweenNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesOrNo;

        do {
            // 숫자 입력 받기
            System.out.print("첫 번째 수를 입력하세요 : ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 수를 입력하세요 : ");
            int num2 = scanner.nextInt();
            scanner.nextLine(); // 개행문자 처리

            // 두 수 사이의 합 구하기
            int sum = 0;

            // 두 수를 비교해 숫자 순서 바꾸기
            if (num1 > num2) {
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
            }

            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
            System.out.println("두 수 " + num1 + "부터 " + num2 + " 까지 합은 " + sum + " 입니다.");

            // 계속할지 중단할지
            System.out.print("계속하시겠습니까?(Y/N) : ");
            yesOrNo = scanner.nextLine();

        } while (yesOrNo.equalsIgnoreCase("Y"));
    }
}
