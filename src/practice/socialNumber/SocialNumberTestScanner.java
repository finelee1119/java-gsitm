package practice.socialNumber;

import java.util.Scanner;

// 주민번호 검증 알고리즘
public class SocialNumberTestScanner {
    public static void main(String[] args) {
        // 주민번호 입력 받기(문자열)
        Scanner scanner = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 (숫자 13자리): ");
        String input = scanner.nextLine();

        // 주민등록번호를 숫자 배열로 변환
        int[] socialNumber = new int[13];
        for (int i = 0; i < socialNumber.length; i++) {
            socialNumber[i] = input.charAt(i) - '0';
        }

        // 주민등록번호 유효성 검사 알고리즘 수행
        int result = 0;

        for (int i = 0; i < socialNumber.length - 1; i++) {
            if (i <= 7) {
                result += (socialNumber[i] * (i + 2));
            } else {
                result += (socialNumber[i] * (i - 6));
            }
        }

        result = (11 - (result % 11)) % 10;

        // 검증 결과 출력
        if (result == socialNumber[socialNumber.length - 1]) {
            System.out.println("올바른 주민등록번호 입니다.");
        } else {
            System.out.println("잘못된 주민등록번호 입니다.");
        }




    }
}
