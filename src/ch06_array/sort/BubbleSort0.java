package ch06_array.sort;

public class BubbleSort0 {
    public static void main(String[] args) {
        int[] sortData = {7,4,5,1,3};

        for (int i = 0; i < sortData.length - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < sortData.length -1 -i; j++) {
                if (sortData[j] > sortData[j+1]) {
                    int tmp = sortData[j];
                    sortData[j] = sortData[j+1];
                    sortData[j+1] = tmp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }

            System.out.print(i+1 + " 번째 회전: ");
            for (int data : sortData) {
                System.out.print(data + " ");
            }
            System.out.println();

        }

    }
}
