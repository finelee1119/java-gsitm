package ch06_array.sort;

public class InsertionSortLogic {
    public static void main(String[] args) {
        // 삽입 정렬
        // 기준이 되는 숫자와 그 앞의 숫자를 비교해 정렬(두번째 값 vs 첫번째 값으로 시작)
        // 오름차순

        int[] numbers = {4,3,2,8,5};
        int tmp;

        // 1회차: numbers[1] vs numbers[0]
        if (numbers[1] < numbers[0]) {
            tmp = numbers[1];
            numbers[1] = numbers[0];
            numbers[0] = tmp;
        }

        // 2회차: numbers[2] vs numbers[1], numbers[0]
        if (numbers[2] < numbers[1]) {
            tmp = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = tmp;
        }

        if (numbers[1] < numbers[0]) {
            tmp = numbers[1];
            numbers[1] = numbers[0];
            numbers[0] = tmp;
        }

        // 3회차: numbers[3] vs numbers[2], numbers[1], numbers[0]
        if (numbers[3] < numbers[2]) {
            tmp = numbers[3];
            numbers[3] = numbers[2];
            numbers[2] = tmp;
        }

        if (numbers[2] < numbers[1]) {
            tmp = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = tmp;
        }

        if (numbers[1] < numbers[0]) {
            tmp = numbers[1];
            numbers[1] = numbers[0];
            numbers[0] = tmp;
        }

        // 4회차: numbers[4] vs numbers[3], numbers[2], numbers[1], numbers[0]
        if (numbers[4] < numbers[3]) {
            tmp = numbers[4];
            numbers[4] = numbers[3];
            numbers[3] = tmp;
        }

        if (numbers[3] < numbers[2]) {
            tmp = numbers[3];
            numbers[3] = numbers[2];
            numbers[2] = tmp;
        }

        if (numbers[2] < numbers[1]) {
            tmp = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = tmp;
        }

        if (numbers[1] < numbers[0]) {
            tmp = numbers[1];
            numbers[1] = numbers[0];
            numbers[0] = tmp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
