package java.ch06_array.sort;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] num = {9, 6, 7, 3, 5};

        // 선택 정렬
        for (int i = 0; i < num.length - 1; i++) {
            int minIndex = i; // 최솟값의 인덱스를 저장하는 변수

            // 최솟값 찾기
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }

            // 최솟값을 현재 위치로 이동
            int tmp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = tmp;
        }

        // 정렬된 배열 출력
        System.out.print("정렬 후: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}