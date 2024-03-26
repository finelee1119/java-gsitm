package dbConnect.telApp;

import dbConnect.telApp.db.DBConn;
import dbConnect.telApp.dto.TelDTO;
import dbConnect.telApp.service.TelBookService;
import dbConnect.telApp.view.UserView;

import java.util.Scanner;

public class TelAppMain {
    public static void main(String[] args) throws Exception {
        //Connection conn = DBConn.getConnection();

        Scanner scanner = new Scanner(System.in);
        TelBookService service = new TelBookService();
        UserView userView = new UserView();


        int ch = 0;
        while (true) {
            do {
                System.out.println("1.입력 2.수정 3.삭제 4.전체출력 5.아이디검색 6.종료");
                System.out.println("================================================");
                ch = scanner.nextInt();
            } while (ch < 0 || ch > 6);

            switch (ch) {
                case 1:
//                    int result;
//                    System.out.println("1.입력");
//                    TelDTO dto = new TelDTO();
//                    dto.setName("파이리");
//                    dto.setAge(30);
//                    dto.setAddress("일산");
//                    dto.setTelNum("010-0000-1111");
//                    result = service.inserData(dto);

                    userView.insert();
                    break;
                case 2:
                    System.out.println("2.수정");
                    break;
                case 3:
                    System.out.println("3.삭제");
                    break;
                case 4:
                    System.out.println("4.전체출력");
                    break;
                case 5:
                    System.out.println("5.아이디검색");
                    break;
                case 6:
                    System.out.println("6.종료");
                    DBConn.close(); // 문 닫기
                    System.exit(0); // 프로그램 종료
            }
        }

    }


}
