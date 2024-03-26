package dbConnect.telApp.view;

import dbConnect.telApp.dto.TelDTO;
import dbConnect.telApp.exception.InputValidation;
import dbConnect.telApp.exception.MyException;
import dbConnect.telApp.service.TelBookService;

import javax.xml.stream.events.DTD;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    TelBookService service = new TelBookService();
    InputValidation inputValidation = new InputValidation();

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

    public void update() {
        TelDTO oldDto = null;
        String yesOrNo;
        int id;
        String name = null;
        int age = 0;
        String address = null;
        String telNumber = null;
        int result = 0;

        // 수정할 데이터 고르기
        System.out.println("수정할 ID: ");
        id = scanner.nextInt();
        oldDto = service.searchOne(id);
        if (oldDto == null) {
            System.out.println("해당하는 ID가 없습니다.");
            return;
        }

        // 이름 수정
        System.out.println("기존 이름: " + oldDto.getName());
        do {
            System.out.println("수정하겠습니까?(Y/N)");
            yesOrNo = scanner.next();
        } while (!(yesOrNo.toUpperCase().equals("Y")||
                yesOrNo.toUpperCase().equals("N")));

        if (yesOrNo.toUpperCase().equals("Y")) {
            try {
                System.out.println("수정할 이름: ");
                name = scanner.next();
                inputValidation.nameCheck(name);
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        } else {
            name = oldDto.getName();
        }

        // 나이 수정
        System.out.println("기존 나이: " + oldDto.getAge());
        do {
            System.out.println("수정하겠습니까?(Y/N)");
            yesOrNo = scanner.next();
        } while (!(yesOrNo.toUpperCase().equals("Y")||
                yesOrNo.toUpperCase().equals("N")));

        if (yesOrNo.toUpperCase().equals("Y")) {
            try {
                System.out.println("수정할 나이: ");
                age = scanner.nextInt();
                inputValidation.ageCheck(age);
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        } else {
            age = oldDto.getAge();
        }

        // 주소 수정
        System.out.println("기존 주소: " + oldDto.getAddress());
        do {
            System.out.println("수정하겠습니까?(Y/N)");
            yesOrNo = scanner.next();
        } while (!(yesOrNo.toUpperCase().equals("Y")||
                yesOrNo.toUpperCase().equals("N")));

        if (yesOrNo.toUpperCase().equals("Y")) {
            System.out.println("수정할 주소: ");
            address = scanner.next();
        } else {
            address = oldDto.getAddress();
        }

        // 전화번호 수정
        System.out.println("기존 전화번호: " + oldDto.getTelNum());
        do {
            System.out.println("수정하겠습니까?(Y/N)");
            yesOrNo = scanner.next();
        } while (!(yesOrNo.toUpperCase().equals("Y")||
                yesOrNo.toUpperCase().equals("N")));

        if (yesOrNo.toUpperCase().equals("Y")) {
            try {
                System.out.println("수정할 전화번호: ");
                telNumber = scanner.next();
                inputValidation.phoneCheck(telNumber);
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        } else {
            telNumber = oldDto.getTelNum();
        }

        result = service.updateData(TelDTO.allOf(id,name,age,address,telNumber));

        if (result != 0) {
            System.out.println("데이터를 수정하였습니다.");
        } else {
            System.out.println("데이터 수정에 실패했습니다.");
        }

    }

    public void delete() {
        int id;
        System.out.println("삭제할 전화번호부의 ID: ");
        id = scanner.nextInt();
        int result = service.deleteData(id);
        if (result != 0) {
            System.out.println("ID: " + id + "의 자료가 삭제되었습니다.");
        } else {
            System.out.println("자료 삭제에 실패하였습니다.");
        }

    }

    public void searchAll() {
        List<TelDTO> dtoList = new ArrayList<>();
        dtoList = service.getListAll();
        if (dtoList.isEmpty()) {
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        } else {
            PrintTitle.line();
            PrintTitle.title();
            PrintTitle.line();
            for (TelDTO dTO : dtoList) {
                System.out.println(dTO);
            }
            PrintTitle.line();
        }

    }

    public void searchOne() {
        TelDTO dto = null;
        System.out.println("검색할 아이디: ");
        int id = scanner.nextInt();
        dto = service.searchOne(id);

        if (dto == null) {
            System.out.println("검색한 데이터는 없습니다.");
        } else {
            PrintTitle.line();
            PrintTitle.title();
            PrintTitle.line();
            System.out.println(dto.toString());
            PrintTitle.line();

        }
    }

}
