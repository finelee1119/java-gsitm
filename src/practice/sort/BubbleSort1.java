package practice.sort;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] numbers = {7,4,5,1,3};
        boolean flag; // 정렬된 순서로 변경이 발생했는지 여부

        // 버블 정렬
        do {
            flag = false; // 초기화
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    // 두 값을 교환
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                    flag = true; // 변경 발생
                }
            }
        } while (flag); // 정렬이 완료될 때까지 반복

        // 정렬 완료된 배열 출력
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
