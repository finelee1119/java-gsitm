package miniProject.vendingMachineV1.try3.ref.user;

import java.util.Scanner;

import miniProject.vendingMachineV1.try3.ref.admin.*;
import static miniProject.vendingMachineV1.try3.ref.admin.Product.*;

public class UserService {
    public static void userService() {
        // 필요한 세팅값
        Scanner scanner = new Scanner(System.in);
        AdminService adminService = new AdminService();

        int currentMoney = 0;
        boolean firstView = true;
        boolean firstInput = true;

        while (true) {
            int plusMoney = 0;

            // 초기 화면
            if(firstView) {

                System.out.println("=================================================================");
                System.out.println("자판기 입니다.(번호: 상품(가격)-재고)");
                for (int i = 0; i < MAX_PRODUCT; i++) {
                    if(product[i] != null) {
                        System.out.print(i+1 + ": " + product[i] + "(" + price[i] + "W)-" + stock[i] + "개 ");
                    }
                }
                System.out.println();
                System.out.println("=================================================================");

                // 1. (첫 구매 시) 금액 입력
                if(firstInput) {
                    System.out.print("돈을 넣어주세요: ");
                    currentMoney = scanner.nextInt();
                    firstInput = false;

                    // 관리자 메뉴
                    if(currentMoney == 1004) {
                        adminService.adminService();

                        // 초기 상태로 재설정 후 초기화면으로 이동하기
                        currentMoney = 0;
                        firstView = true;
                        firstInput = true;
                        continue;

                    }
                }

                // 2. 제품번호 입력
                System.out.print("메뉴 입력: ");
                int menuNumber = scanner.nextInt();
                int menuIndex = menuNumber - 1;

                // 2. 메뉴 받기 -> 금액, 재고 차감
                // 3. 잔액 부족 -> 메시지 출력, 금액 충전
                if (currentMoney >= price[menuIndex] && stock[menuIndex] > 0) {
                    System.out.println(product[menuIndex] + " 나왔습니다.");
                    currentMoney -= price[menuIndex];
                    stock[menuIndex]--;
                    System.out.println("잔액: " + currentMoney + "원");
                }
                else if(currentMoney < price[menuIndex]) {
                    System.out.print("잔액이 부족합니다! \n잔액: " + currentMoney + "원");
                    System.out.println();
                }

                firstView = false;

            }

            // 다음 액션 선택 받기
            System.out.println("1: 계속 구매 2: 금액 추가 3: 잔액 반환");
            System.out.print("번호를 입력하세요: ");
            int actionNumber = scanner.nextInt();

            if(actionNumber == 1) {
                // 어떻게 firstView로 돌아가지?
                firstView = true;
            }
            else if (actionNumber == 2) {
                System.out.print("얼마를 추가하시겠습니까: ");
                plusMoney = scanner.nextInt();
                currentMoney += plusMoney;
                System.out.println("금액이 추가되었습니다! 잔액: " + currentMoney + "원");
            }
            // 4. 잔액 반환 -> 초기화면 보여주기
            else if (actionNumber == 3) {
                System.out.println("잔액 " + currentMoney + "원을 반환 합니다.");
                System.out.println("감사합니다. 다음에 또 이용해주세요!");

                // 어떻게 프로세스를 마치고 firstView로 돌아가지?
                // 초기 상태로 재설정
                currentMoney = 0;
                firstView = true;
                firstInput = true;
            }

        }


    }

}
