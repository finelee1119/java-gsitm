package java.ch06_conditionAndLoop.lottoNumber;

import java.util.Random;

public class LottoNum1 {
    public static void main(String[] args) {
        Random random = new Random();

        // 로또번호를 저장할 배열 생성
        int[] lottoNum = new int[6];

        // 난수를 만든다
        // 이전의 난수와 같은지 비교한다.
        // 만약에 같으면 저장하지 않고 탈출한다.
        // 만약에 다르면 로또배열에 저장한다.
        for (int i = 0; i < lottoNum.length; i++) {
            int randomNumber;
            boolean isSameNum;

            // 중복된 숫자가 나올 때까지 난수 생성
            // do-while : while 조건이 만족하는 동안 do 실행
            do {
                randomNumber = random.nextInt(45) + 1;
                isSameNum = false; // 배열 저장하러 가볼까

                // 생성된 난수가 배열에 이미 존재하는지 확인
                for (int j = 0; j < i; j++) {
                    if (lottoNum[j] == randomNumber) { // 같으면
                        isSameNum = true; // true로 바꿔주고
                        break; // 가장 가까운 반복문 탈출 (-> for문 이후의 코드 실행됨)
                    }
                }
            } while (isSameNum);
            // true면 난수 계속해서 만들고 비교해봄
            // false면 난수 그만 만들고 배열 저장으로 넘어감
            

            // 중복이 없는 경우에만 배열에 저장
            lottoNum[i] = randomNumber;
        }


        // 출력
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.println(lottoNum[i]);
        }
    }
}
