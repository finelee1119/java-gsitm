package java.ch06_array;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 문제2. 1부터 10사이의 값을 더합니다. (단, 5는 빼고 더하기)
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i != 5) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("반복문 종료");

        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // continue : 조건으로 다시 돌아감
                // break : 반목문 탈출 + 이후 작업까지 수행
                // return : 아예 메인 메서드 탈출
                return;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("반복문 종료");
    }
}
