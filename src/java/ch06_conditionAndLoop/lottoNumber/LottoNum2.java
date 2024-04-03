package java.ch06_conditionAndLoop.lottoNumber;

import java.util.Random;

public class LottoNum2 {
    public static void main(String[] args) {
        Random random = new Random();

        // 로또번호 배열 생성
        int[] lottoNum = new int[6];

        // 랜덤번호 생성 후 로또번호 배열에 값 저장
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = random.nextInt(45) + 1;

            // 중복 여부 검사
            for(int j = 0; j < i; j++) {
                if(lottoNum[i] == lottoNum[j]) { // 새 번호와 이전 번호들 비교해서 같으면
                    i--;   // 생성 안한 걸로 치고
                    break; // 가까운 반복문 탈출 (-> 다시 바깥for문 수행)
                }
            }

        }

        // 출력
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.println(lottoNum[i]);
        }
    }
}
