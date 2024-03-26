package ch06_array.socialNumber;

// 주민번호 검증 알고리즘
public class SocialNumberTest {
    public static void main(String[] args) {
        // 주민번호 입력
        int[] socialNumber = {9,3,1,1,1,9,2,1,8,3,3,1,4};

        // 1단계 : 주민번호 각 자리와 2~9 숫자 곱하고 총합 구하기
        int result = 0;

        for (int i = 0; i < socialNumber.length - 1; i++) { // 첫번째 숫자부터 12번째 숫자까지만
            if (i <= 7) {
                result += (socialNumber[i] * (i + 2)); // 2~9 곱하기
            } else {
                result += (socialNumber[i] * (i - 6)); // 2~5 곱하기
            }
        }

        // 2단계 : 1단계 값을 11로 나눈 나머지를 취하기
        // 3단계 : 2단계 값을 11에서 빼기
        // 4단계 : 3단계 값을 10으로 나눈 나머지를 취하기
        result = (11- (result % 11)) % 10;

        // 5단계 : 4단계 값과 주민번호 13번째 값을 비교
        if (result == socialNumber[socialNumber.length - 1]) {
            System.out.println("올바른 주민등록번호 입니다.");
        } else {
            System.out.println("잘못된 주민등록번호 입니다.");
        }

    }
}
