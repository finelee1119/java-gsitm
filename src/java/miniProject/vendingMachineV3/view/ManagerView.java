package java.miniProject.vendingMachineV3.view;

import java.dbConnect.telApp_1.view.PrintTitle;
import java.miniProject.vendingMachineV3.dto.ProductDto;
import java.miniProject.vendingMachineV3.dto.UserDto;
import java.miniProject.vendingMachineV3.service.ManagerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerView {
    Scanner scanner = new Scanner(System.in);
    ManagerService managerService = new ManagerService();

    public void selectManagerMenu() {
        System.out.println("원하는 메뉴를 선택하세요.");
        System.out.println("1.자판기 관리 2.회원 관리 3.판매 관리");
        int menuNum = scanner.nextInt();

        switch (menuNum) {
            case 1:
                manageVendingMachineView();
                break;
            case 2:
                manageUserView();
                break;
            case 3:
                manageSalesView();
                break;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public void manageVendingMachineView() {
        System.out.println("자판기 관리 메뉴를 선택하세요.");
        System.out.println("1.제품 입력 2.제품 수정 3.제품 삭제 4.제품 전체 조회 5.제품 아이디로 조회");
        int menuNum = scanner.nextInt();

        switch (menuNum) {
            case 1:
                insertVendingMachineView();
                break;
            case 2:
                updateVendingMachineView();
                break;
            case 3:
                deleteVendingMachineView();
                break;
            case 4:
                showAllVendingMachineDataView();
                break;
            case 5:
                showOneVendingMachineDataView();
                break;
        }
    }
    public void insertVendingMachineView() {
        System.out.println("신규 데이터를 입력합니다.");
        System.out.println("제품명: ");
        String productName = scanner.next();

        System.out.println("가격: ");
        int price = scanner.nextInt();

        System.out.println("재고: ");
        int stock = scanner.nextInt();

        ProductDto dto = ProductDto.of(productName,price,stock);
        int result = managerService.insertVendingMachineData(dto);
        if (result != 0) {
            System.out.println("제품정보 입력 성공");
        } else {
            System.out.println("제품정보 입력 실패");
        }
    }
    public void updateVendingMachineView() {
        // 아이디 존재유무 검색
        System.out.println("수정할 제품의 아이디를 입력하세요.");
        int productId = scanner.nextInt();

        ProductDto productDto = managerService.showOneVendingMachineData(productId);
        if (productDto != null) {
            // 기존 제품 정보 출력 + 새로운 제품 정보 받기
            System.out.println("변경 전 제품명: " + productDto.productName());
            String productName = scanner.next(); // 새로운 제품명을 입력받음

            System.out.println("변경 전 가격: " + productDto.price());
            int price = scanner.nextInt(); // 새로운 가격을 입력받음

            System.out.println("변경 전 재고: " + productDto.stock());
            int stock = scanner.nextInt(); // 새로운 재고를 입력받음

            // 새로운 데이터를 dto에 담기
            ProductDto newProductDto = new ProductDto(productId, productName, price, stock);

            // 데이터를 수정하는 메서드 호출
            int result = managerService.updateVendingMachineData(newProductDto);
            if (result != 0) {
                System.out.println("제품정보 수정 성공");
            } else {
                System.out.println("제품정보 수정 실패");
            }
        } else {
            System.out.println("해당 아이디의 제품이 존재하지 않습니다.");
        }
    }
    public void deleteVendingMachineView() {
        int result;
        String deleteYesOrNo;

        // 삭제할 아이디 입력 받기
        System.out.println("삭제할 제품의 아이디를 입력하세요.");
        int productId = scanner.nextInt();

        ProductDto productDto = managerService.showOneVendingMachineData(productId);
        if (productDto != null) {
            // 삭제 의사 확인하기
            do {
                System.out.println("정말로 삭제하겠습니까?(Y/N)");
                deleteYesOrNo = scanner.next();
            } while (!(deleteYesOrNo.equalsIgnoreCase("Y")
                    || deleteYesOrNo.equalsIgnoreCase("N")));

            if (deleteYesOrNo.equalsIgnoreCase("Y")) {
                // 삭제 처리하기
                result = managerService.deleteVendingMachineData(productId);
                if (result != 0) {
                    System.out.println("해당 제품정보가 삭제되었습니다.");
                } else {
                    System.out.println("해당 제품정보 삭제에 실패하였습니다.");
                }
            }
        } else {
            System.out.println("해당 아이디의 제품이 존재하지 않습니다.");
        }

    }
    public void showAllVendingMachineDataView() {
        List<ProductDto> dtoList = new ArrayList<>();
        dtoList = managerService.showAllVendingMachineData();

        if (dtoList.isEmpty()) {
            System.out.println("제품 데이터가 존재하지 않습니다.");
        } else {
            PrintInfo.line();
            PrintInfo.productTitle();
            PrintInfo.line();
            for (ProductDto productDto : dtoList) {
                System.out.println(productDto);
            }
            PrintTitle.line();
        }

    }
    public void showOneVendingMachineDataView() {
        int productId;

        System.out.println("검색할 제품 아이디를 입력하세요.");
        productId = scanner.nextInt();
        ProductDto productDto = managerService.showOneVendingMachineData(productId);

        if (productDto == null) {
            System.out.println("해당하는 제품 아이디가 존재하지 않습니다.");
        } else {
            PrintInfo.line();
            PrintInfo.productTitle();
            PrintInfo.line();
            System.out.println(productDto);
            PrintTitle.line();
        }
    }

    ///////////////////////////////////////////////////////////////////
    public void manageUserView() {
        System.out.println("회원 관리 메뉴를 선택하세요.");
        System.out.println("1.회원 입력 2.회원 수정 3.회원 삭제 4.회원 전체 조회 5. 회원 아이디로 조회");
        int menuNum = scanner.nextInt();

        switch (menuNum) {
            case 1:
                insertUserView();
                break;
            case 2:
                updateUserView();
                break;
            case 3:
                deleteUserView();
                break;
            case 4:
                showAllUserDataView();
                break;
            case 5:
                showOneUserDataView();
                break;
        }
    }
    public void insertUserView() {
        System.out.println("신규 데이터를 입력합니다.");
        System.out.println("아이디: ");
        String id = scanner.next();
        
        System.out.println("비밀번호: ");
        String pw = scanner.next();

        System.out.println("이름: ");
        String userName = scanner.next();

        System.out.println("전화번호: ");
        String tel = scanner.next();

        UserDto dto = UserDto.allOf(id,pw,userName,tel);
        int result = managerService.insertUserData(dto);
        if (result != 0) {
            System.out.println("회원정보 입력 성공");
        } else {
            System.out.println("회원정보 입력 실패");
        }
    }
    public void updateUserView() {
        // 아이디 존재유무 검색
        System.out.println("정보를 수정할 회원의 아이디를 입력하세요.");
        String oldId = scanner.next();

        UserDto userDto = managerService.showOneUserData(oldId);
        if (userDto != null) {
            // 기존 회원 정보 출력 + 새로운 회원 정보 받기
            System.out.println("변경 전 아이디: " + userDto.id());
            String id = scanner.next(); // 새로운 아이디를 입력받음

            System.out.println("변경 전 비밀번호: " + userDto.pw());
            String pw = scanner.next(); // 새로운 비밀번호를 입력받음

            System.out.println("변경 전 이름: " + userDto.userName());
            String userName = scanner.next(); // 새로운 이름을 입력받음

            System.out.println("변경 전 전화번호: " + userDto.tel());
            String tel = scanner.next(); // 새로운 전화번호을 입력받음

            // 새로운 데이터를 dto에 담기
            UserDto newUserDto = new UserDto(id,pw,userName,tel);

            // 데이터를 수정하는 메서드 호출
            int result = managerService.updateUserData(newUserDto);;
            if (result != 0) {
                System.out.println("회원정보 수정 성공");
            } else {
                System.out.println("회원정보 수정 실패");
            }
        } else {
            System.out.println("해당 아이디의 회원이 존재하지 않습니다.");
        }
    }
    public void deleteUserView() {
        int result;
        String deleteYesOrNo;

        // 삭제할 아이디 입력 받기
        System.out.println("정보를 삭제할 회원의 아이디를 입력하세요.");
        String id = scanner.next();

        UserDto userDto = managerService.showOneUserData(id);
        if (userDto != null) {
            // 삭제 의사 확인하기
            do {
                System.out.println("정말로 삭제하겠습니까?(Y/N)");
                deleteYesOrNo = scanner.next();
            } while (!(deleteYesOrNo.equalsIgnoreCase("Y")
                    || deleteYesOrNo.equalsIgnoreCase("N")));

            // 제대로 답변 입력한 경우
            if (deleteYesOrNo.equalsIgnoreCase("Y")) {
                // 삭제 처리하기
                result = managerService.deleteUserData(id);
                if (result != 0) {
                    System.out.println("해당 회원정보가 삭제되었습니다.");
                } else {
                    System.out.println("해당 회원정보 삭제에 실패하였습니다.");
                }
            }
        } else {
            System.out.println("해당 아이디의 회원이 존재하지 않습니다.");
        }
    }
    public void showAllUserDataView() {
        List<UserDto> dtoList = new ArrayList<>();
        dtoList = managerService.showAllUserData();

        if (dtoList.isEmpty()) {
            System.out.println("회원 데이터가 존재하지 않습니다.");
        } else {
            PrintInfo.line();
            PrintInfo.userTitle();
            PrintInfo.line();
            for (UserDto userDto : dtoList) {
                System.out.println(userDto);
            }
            PrintTitle.line();
        }
    }
    public void showOneUserDataView() {
        String id;

        System.out.println("검색할 회원 아이디를 입력하세요.");
        id = scanner.next();
        UserDto userDto = managerService.showOneUserData(id);

        if (userDto == null) {
            System.out.println("해당하는 회원 아이디가 존재하지 않습니다.");
        } else {
            PrintInfo.line();
            PrintInfo.userTitle();
            PrintInfo.line();
            System.out.println(userDto);
            PrintTitle.line();
        }
    }

    ///////////////////////////////////////////////////////////////////
    public void manageSalesView() {
        System.out.println("판매 관리 메뉴를 선택하세요.");
        System.out.println("1.제품별 판매현황 조회 2.회원별 판매현황 조회");
        int menuNum = scanner.nextInt();

        switch (menuNum) {
            case 1:
                managerService.showProductSalesData();
                break;
            case 2:
                managerService.showUserSalesData();
                break;
        }
    }

}