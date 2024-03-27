package miniProject.vendingMachineV3.view;

import miniProject.vendingMachineV3.dto.UserDto;
import miniProject.vendingMachineV3.service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    UserService userService = new UserService();

    public void signUpView() {
        String id = null;
        String pw = null;
        String userName = null;
        String tel = null;

        System.out.println("회원가입을 위한 정보를 입력하세요.");
        System.out.println("아이디: ");
        id = scanner.next();

        System.out.println("패스워드: ");
        pw = scanner.next();

        System.out.println("이름: ");
        userName = scanner.next();

        System.out.println("연락처: ");
        tel = scanner.next();

        UserDto userDto = UserDto.allOf(id,pw,userName,tel);
        int result = userService.signUpService(userDto);
        if (result != 0) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    public void signInView() {
        String id = null;
        String pw = null;

        System.out.println("로그인을 위한 정보를 입력하세요.");
        System.out.println("아이디: ");
        id = scanner.next();

        System.out.println("패스워드: ");
        pw = scanner.next();

        // 로그인 서비스 호출
        UserDto userDto = userService.signInService(id, pw);
    }

    public void chargeView(String id) {
        try {
            // 회원의 현재 잔액 출력
            System.out.println("회원님의 현재 잔액은 " + userService.getBalance(id) + "원 입니다.");

            // 충전 여부 확인
            System.out.println("금액을 충전하시겠습니까?(Y/N)");
            String chargeYesOrNo = scanner.next();
            
            // 충전 금액 받기
            if (chargeYesOrNo.equalsIgnoreCase("Y")) {
                System.out.println("충전하실 금액을 입력해주세요: ");
                int amount = scanner.nextInt();

                // 금액 조건 체크
                if (amount > 0 && amount % 1000 == 0) {
                    // 사용자의 잔액을 업데이트
                    //userService.updateBalance(id, amount);
                } else {
                    System.out.println("충전 금액은 1천원 단위이고, 양수여야 합니다.");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }


}
