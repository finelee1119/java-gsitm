package practice.LegacyVendingMachineV2;

import practice.LegacyVendingMachineV2.service.InitClazz;
import practice.LegacyVendingMachineV2.service.ManagerServiceImpl;
import practice.LegacyVendingMachineV2.service.UserServiceImpl;

import java.util.Scanner;

public class MachineAppMain {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ManagerServiceImpl managerService = new ManagerServiceImpl();

        Scanner scanner = new Scanner(System.in);

        int ch = 0;

        outerLoop:
        while (true) {
            do {
                System.out.println("1.동전 투입 2.잔돈 반환 3.메뉴 선택 4.관리자 메뉴 5.종료");
                ch = scanner.nextInt();
            } while (ch < 1 || 5 < ch);

            if (ch == 5) {
                break;
            }

            switch (ch) {
                case 1:
                    // 동전 투입
                    userService.insertCoin();
                    break;
                case 2:
                    // 잔돈 반환
                    userService.returnCoin();
                    break;
                case 3: 
                    // 메뉴 선택
                    userService.choiceMenu();
                    break;
                case 4:
                    // 관리자 메뉴
                    while (true) {
                        do {
                            System.out.println("1.메뉴 등록 2.메뉴 삭제 3.메뉴 수정 4.재고 등록 5.전체목록 보기 6.이전");
                            ch = scanner.nextInt();
                        } while (ch < 1 || 6 < ch);

                        if (ch == 6) { // 이전으로 돌아가기
                            continue outerLoop; // 외부 루프로 돌아가도록 레이블 사용
                        }

                        switch (ch) {
                            case 1:
                                // 메뉴 등록
                                managerService.enterMenu();
                                break;
                            case 2:
                                // 메뉴 삭제
                                managerService.deleteMenu();
                                break;
                            case 3:
                                // 메뉴 수정
                                managerService.updateMenu();
                                break;
                            case 4:
                                // 재고 등록
                                managerService.enterStock();
                                break;
                            case 5:
                                // 전체목록 보기
                                InitClazz.printMenu();
                                break;
                        }

                    }
            }
            
        }

    }
}
