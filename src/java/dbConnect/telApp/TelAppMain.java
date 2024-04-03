package java.dbConnect.telApp;

import java.dbConnect.telApp.db.DBConn;
import java.dbConnect.telApp.view.UserView;
import java.util.Scanner;

public class TelAppMain {
    public static void main(String[] args) throws Exception {
        UserView userView = new UserView();
        Scanner scanner = new Scanner(System.in);

        int ch = 0;
        while (true) {
            do {
                System.out.println("1.입력 2.수정 3.삭제 4.전체출력 5.아이디검색 6.종료");
                System.out.println("======================================================");
                ch = scanner.nextInt();
            } while (ch < 0 || ch > 6);

            switch (ch) {
                case 1:
                    try {
                        userView.insert();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    userView.update();
                    break;
                case 3:
                    userView.delete();
                    break;
                case 4:
                    userView.searchAll();
                    break;
                case 5:
                    userView.searchOne();
                    break;
                case 6:
                    DBConn.close(); // 문 닫기
                    System.exit(0); // 프로그램 종료
            }
        }

    }


}
