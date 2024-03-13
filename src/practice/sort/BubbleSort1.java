package practice.sort;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] num = {7,4,5,1,3};
        boolean flag;

        // 버블 정렬
        do {
            flag = false;
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j+1]) {
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                    flag = true;
                }
            }
        } while (flag);

        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}
