package dbConnect.telApp_1.view;

import dbConnect.telApp_1.dto.TelDto;
import dbConnect.telApp_1.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);
    UserService userService = new UserService();

    public void insertView() {
        String name = null;
        int age = 0;
        String addr = null;
        String tel = null;

        System.out.println("신규 데이터를 입력합니다.");
        System.out.println("이름: ");
        name = sc.next();

        System.out.println("나이: ");
        age = sc.nextInt();

        System.out.println("주소: ");
        addr = sc.next();

        System.out.println("전화번호: ");
        tel = sc.next();

        TelDto dto = TelDto.of(name,age,addr,tel);
        int result = userService.insertData(dto);
        if (result != 0) {
            System.out.println("데이터 입력 성공");
        } else {
            System.out.println("데이터 입력 실패");
        }
    }

    public void updateView() {
        TelDto dto = null;
        int id = 0;
        String name = null;
        int age = 0;
        String addr = null;
        String tel = null;

        System.out.println("수정할 아이디를 입력하세요.");

        // 아이디 존재유무 검색
        id = sc.nextInt();
        dto = userService.selectOne(id);
        if (dto == null) {
            System.out.println("해당하는 아이디가 존재하지 않습니다.");
            return;
        } else {
            // 수정 작업
            System.out.println("변경 전 이름: " + dto.name());
            name = dto.name();
            name = sc.next();

            System.out.println("변경 전 나이: " + dto.age());
            age = dto.age();
            age = sc.nextInt();

            System.out.println("변경 전 주소: " + dto.addr());
            addr = dto.addr();
            addr = sc.next();

            System.out.println("변경 전 전화번호: " + dto.tel());
            tel = dto.tel();
            tel = sc.next();

            // 수정 데이터를 dto에 담기
            dto = TelDto.allOf(id,name,age,addr,tel);

            // 데이터를 수정하기 위해 서비스 호출
            int result = userService.updateData(dto);
            if (result != 0) {
                System.out.println("데이터 수정 성공");
            } else {
                System.out.println("데이터 수정 실패");
            }
        }

    }

    public void deleteView() {
        int id;
        int result;
        String yesOrNo;

        // 삭제할 아이디 입력 받기
        System.out.println("삭제할 아이디를 입력하세요.");
        id = sc.nextInt();
        TelDto dto = userService.selectOne(id);
        if (dto == null) {
            System.out.println("해당하는 아이디가 존재하지 않습니다.");
        } else {
            // 삭제 의사 확인하기
            do {
                System.out.println("정말로 삭제하겠습니까?(Y/N)");
                yesOrNo = sc.next();
            } while (!(yesOrNo.equalsIgnoreCase("Y")
            || yesOrNo.equalsIgnoreCase("N")));

            if (yesOrNo.equalsIgnoreCase("Y")) {
                // 삭제 처리하기
                result = userService.deleteData(id);
                if (result != 0) {
                    System.out.println("ID: " + id + "의 자료가 삭제되었습니다.");
                } else {
                    System.out.println("자료 삭제에 실패하였습니다.");
                }
            } else {
                return;
            }
        }

    }

    public void showAllView() {
        List<TelDto> dtoList = new ArrayList<>();
        dtoList = userService.selectAll();

        if (dtoList.isEmpty()) {
            System.out.println("데이터가 존재하지 않습니다.");
        } else {
            PrintTitle.line();
            PrintTitle.title();
            PrintTitle.line();
            for (TelDto dto : dtoList) {
                System.out.println(dto);
            }
            PrintTitle.line();
        }
    }

    public void showOneView() {
        int id;

        System.out.println("검색할 아이디를 입력하세요.");
        id = sc.nextInt();
        TelDto dto = userService.selectOne(id);
        if (dto == null) {
            System.out.println("해당하는 아이디가 존재하지 않습니다.");
        } else {
            System.out.println(dto);
        }
    }

}
