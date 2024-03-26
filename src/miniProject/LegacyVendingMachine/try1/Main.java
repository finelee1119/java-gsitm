package miniProject.LegacyVendingMachine.try1;

import miniProject.LegacyVendingMachine.try1.service.AdminService;
import miniProject.LegacyVendingMachine.try1.service.UserService;
import miniProject.LegacyVendingMachine.try1.view.AdminView;
import miniProject.LegacyVendingMachine.try1.view.UserView;

public class Main {
    public static void main(String[] args) {
        // 사용자 뷰 및 서비스 인스턴스 생성
        UserView userView = new UserView();
        UserService userService = new UserService();

        // 관리자 뷰 및 서비스 인스턴스 생성
        AdminView adminView = new AdminView();
        AdminService adminService = new AdminService();

        // 사용자 뷰와 서비스 상호 작용 테스트
        userView.userView(); // 사용자 뷰 시작
        // 필요한 경우 사용자 뷰의 메서드 호출을 통해 userService의 메서드를 호출하여 사용자 요청 처리

        // 관리자 뷰와 서비스 상호 작용 테스트
        adminView.adminView(); // 관리자 뷰 시작
        // 필요한 경우 관리자 뷰의 메서드 호출을 통해 adminService의 메서드를 호출하여 관리자 요청 처리
    }
}
