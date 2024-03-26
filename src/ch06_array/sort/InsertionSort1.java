package ch06_array.sort;

public class InsertionSort1 {
    public static void main(String[] args) {
        // 삽입 정렬
        // 기준이 되는 숫자와 그 앞의 숫자를 비교해 정렬(두번째 값 vs 첫번째 값으로 시작)
        // 오름차순

        int[] numbers = {4,3,2,8,5};
        int tmp;

        // 정렬
        for (int i = 1; i < numbers.length; i++) { // 회차별 비교횟수 1->2->3->4회
            for (int j = i; j > 0; j--) {

                if (numbers[j] < numbers[j-1]) {
                    tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                }

            }
            
            // 출력
            System.out.print(i + "회차 비교: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
