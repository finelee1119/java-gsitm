package java.miniProject.vendingMachineV1.try2;

import java.miniProject.vendingMachineV1.try2.service.AdminService;
import java.miniProject.vendingMachineV1.try2.service.UserService;
import java.miniProject.vendingMachineV1.try2.view.AdminView;

public class Main {
    public static void main(String[] args) {

        // 초기 세팅
        Initialize.initializeMenu();

        // 사용자 뷰 및 서비스 인스턴스 생성
        //UserView userView = new UserView();
        UserService userService = new UserService();

        // 관리자 뷰 및 서비스 인스턴스 생성
        AdminView adminView = new AdminView();
        AdminService adminService = new AdminService();

        // 사용자 뷰 실행
        //userView.userView();

        // 관리자 뷰 실행
        adminView.adminView();

    }
}