package miniProject.vendingMachineV3.view;

import dbConnect.telApp_1.view.PrintTitle;
import miniProject.vendingMachineV3.dto.ProductDto;
import miniProject.vendingMachineV3.dto.UserDto;
import miniProject.vendingMachineV3.service.ManagerService;
import miniProject.vendingMachineV3.service.UserService;

import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    UserService userService = new UserService();
    ManagerView managerView = new ManagerView();
    ManagerService managerService = new ManagerService();

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

        // 로그인에 필요한 정보 받기
        System.out.println("로그인을 위한 정보를 입력하세요.");
        System.out.println("아이디: ");
        id = scanner.next();
        System.out.println("패스워드: ");
        pw = scanner.next();

        // 관리자
        if (id.equals("root") && pw.equals("1111")) {
            System.out.println("관리자 모드 입니다.");
            managerView.selectManagerMenu();

        }

        // 일반 사용자
        else {
            // 로그인 메서드 호출 => 로그인 결과 반환
            boolean signedInUser = userService.signInService(id, pw);

            // 로그인 결과 출력
            if (signedInUser) {
                System.out.println("로그인에 성공했습니다.");
                System.out.println(id + " 님의 현재 잔액은 " + userService.getBalance(id) + "원 입니다.");
                signedInNextActionView(id);
            } else {
                System.out.println("로그인에 실패했습니다.");
            }
        }
    }

    public void signedInNextActionView(String id) {
        System.out.println("1.금액 충전 2.제품 구매 3.잔액 반환 4.종료");
        int nextAction = scanner.nextInt();

        switch (nextAction) {
            case 1:
                chargeView(id);
                break;
            case 2:
                buyView(id);
                break;
            case 3:
                returnAllBalanceView(id);
                break;
            case 4:
                //종료
                break;
        }
    }


    public void chargeView(String id) {
        //금액 충전
        System.out.println("충전하실 금액을 입력해주세요(카드만 가능): ");
        int amount = scanner.nextInt();

        // 금액 조건 체크
        if (amount > 0 && amount % 1000 == 0) {
            // 사용자의 잔액을 업데이트
            int updatedBalance = userService.updateBalance(id, amount);
            // 업데이트 결과 출력
            System.out.println("충전이 완료되었습니다. 현재 잔액: " + updatedBalance);
        } else {
            System.out.println("충전 금액은 1천원 단위이고, 양수여야 합니다.");
        }
    }

    public void buyView(String id) {
        // 메뉴 보여주기
        managerView.showAllVendingMachineDataView();

        // 원하는 제품명 입력 받기
        System.out.println("구매할 제품번호를 입력하세요.(1회당 1개 구매 가능)");
        int productId = scanner.nextInt();

        ProductDto productDto = managerService.showOneVendingMachineData(productId);
        // 입력 받은 제품이 있다면 => 정보 가져오기
        if (productDto != null) {
            int balance = userService.getBalance(id);
            if (balance >= productDto.price() && productDto.stock() > 0) {
                // 제품 제공 => 잔액과 재고 감소
                userService.updateBalance(id, -productDto.price());
                managerService.updateVendingMachineData(
                        new ProductDto(
                                productId,
                                productDto.productName(),
                                productDto.price(),
                                productDto.stock() - 1
                        ));
                System.out.println(productDto.productName() + " 나왔습니다. 잔액: " + userService.getBalance(id));

            } else {
                System.out.println("해당 제품을 구입할 수 없습니다.");
            }
        } else {
            System.out.println("해당 제품이 존재하지 않습니다.");
        }

    }

    public void returnAllBalanceView(String id) {
        int updateBalance = userService.returnAllBalance(id);
        System.out.println("전액 환불되었습니다. 현재 잔액: " + updateBalance);
    }

}
