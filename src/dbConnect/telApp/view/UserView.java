package dbConnect.telApp.view;

import dbConnect.telApp.dto.TelDTO;
import dbConnect.telApp.exception.InputValidation;
import dbConnect.telApp.exception.MyException;
import dbConnect.telApp.service.TelBookService;

import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    InputValidation inputValidation = new InputValidation();
    TelBookService service = new TelBookService();

    public void insert() throws Exception {
        String name = null;
        int age = 0;
        String address = null;
        String telNumber = null;

        System.out.println("=========== 전화번호 등록 ===========");
        
        //이름 입력
        boolean checkName = true;
        do {
            try {
                System.out.println("이름: ");
                name = scanner.next();
                inputValidation.nameCheck(name);
                checkName = false;
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        } while (checkName);

        //나이 입력
        boolean checkAge = true;
        do {
            try {
                System.out.println("나이: ");
                age = scanner.nextInt();
                inputValidation.ageCheck(age);
                checkAge = false;
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        } while (checkAge);

        //주소 입력
        System.out.println("주소: ");
        address = scanner.next();

        //전화번호 입력
        boolean checkTelNumber = true;
        do {
            try {
                System.out.println("전화번호: ");
                telNumber = scanner.next();
                inputValidation.phoneCheck(telNumber);
                checkTelNumber = false;
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        } while (checkTelNumber);

        //받은 데이터를 데이터베이스에 저장하는 메서드를 호출
        int result = service.inserData(TelDTO.of(name,age,address,telNumber));
        if (result != 0) {
            System.out.println();
            System.out.println("######## 성공적으로 입력되었습니다. ########");
            System.out.println();
        }

    }

}
