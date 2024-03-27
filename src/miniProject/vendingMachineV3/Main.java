package miniProject.vendingMachineV3;

import miniProject.vendingMachineV3.db.DBConn;
import miniProject.vendingMachineV3.view.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserView userView = new UserView();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            do {
                System.out.println("1.회원가입 2.로그인 3.종료");
                choice = scanner.nextInt();
            } while (choice < 0 || choice > 3);

            switch (choice) {
                case 1:
                    userView.signUpView();
                    break;
                case 2:
                    userView.signInView();

//                    if (id != null) {
//                        userView.chargeView(id);
//                    }
                    break;
                case 3:
                    DBConn.close();
                    break;
            }
        }

    }
}
