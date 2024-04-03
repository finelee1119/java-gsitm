package java.ch06_array.sort;

public class SelectionSort0 {
    public static void main(String[] args) {
        int[] sortData = {7,4,5,1,3};

        // 선택 정렬
        for (int i = 0; i < sortData.length; i++) {
            int flag = 0;

            for (int j = i+1; j < sortData.length; j++) {
                if (sortData[i] > sortData[j]) {
                    int tmp = sortData[i];
                    sortData[i] = sortData[j];
                    sortData[j] = tmp;

                    flag = 1;
                }
            }
            if (flag == 0) break;
        }

        // 정렬된 배열 출력
        for (int i = 0; i < sortData.length; i++) {
            System.out.print(sortData[i] + " ");
        }
    }
}