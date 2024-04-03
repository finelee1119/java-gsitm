package java.ch06_array.sort;

public class SelectionSort2 {
    public static void main(String[] args) {
        // 선택 정렬 (오름차순)

        // 정렬할 데이터
        int[] numbers = {9, 6, 7, 3, 5};

        // 정렬하기
        for (int i = 0; i < numbers.length - 1; i++) { // 마지막 원소는 이미 나머지 원소들과 비교되어 정렬되어 있기 때문에 -1
            int minIndex = i; // 자꾸 헷갈리는 부분

            // 현재 최솟값과 나머지 값을 비교하여 최솟값 인덱스 갱신
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }

            // 최솟값과 현재 위치의 값을 교환
            int tmp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = tmp;
        }

        // 결과 출력
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}