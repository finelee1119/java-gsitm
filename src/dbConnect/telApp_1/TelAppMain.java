package dbConnect.telApp_1;


import dbConnect.telApp_1.db.DBConn;
import dbConnect.telApp_1.view.UserView;

import java.util.Scanner;

public class TelAppMain {
    public static void main(String[] args) {
        UserView userView = new UserView();
        Scanner sc = new Scanner(System.in);

        int choice;

        while (true) {
            do {
                System.out.println("1.입력 2.수정 3.삭제 4.전체 읽기 5.1개 읽기 6.종료");
                choice = sc.nextInt();
            } while (choice < 0 || choice > 6);

            switch (choice) {
                case 1:
                    // 완료
                    userView.insertView();
                    break;
                case 2:
                    // 완료
                    userView.updateView();
                    break;
                case 3:
                    // 완료
                    userView.deleteView();
                    break;
                case 4:
                    // 완료
                    userView.showAllView();
                    break;
                case 5:
                    // 완료
                    userView.showOneView();
                    break;
                case 6:
                    // 완료
                    DBConn.close();
                    return;
            }
        }


    }
}
