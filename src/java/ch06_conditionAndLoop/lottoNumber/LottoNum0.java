package java.ch06_conditionAndLoop.lottoNumber;

import java.util.Random;

public class LottoNum0 {
    public static void main(String[] args) {
        Random random = new Random();
        int lottoNum[] = new int[6];
        int currNum;
        int index = 0;
        boolean flag = false;

        do {
            currNum = random.nextInt(45)+1;
            for (int i = 0; i < lottoNum.length; i++) {
                if (currNum == lottoNum[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                lottoNum[index] = currNum;
                index++;
            }
        } while (flag);
    }
}
