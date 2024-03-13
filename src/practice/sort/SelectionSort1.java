package practice.sort;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] num = {9,6,7,3,5};
        int sortNum;
        int tmp;
        boolean flag;

     

            // 최솟값 구하기
            sortNum = num[0];

            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i+1]) {
                    sortNum = num[i+1];
                }
            }

            tmp = sortNum;
            sortNum = num[0];
            num[0] = tmp;


        System.out.println("정렬 대상: " + sortNum);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
