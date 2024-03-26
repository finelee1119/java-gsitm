package miniProject.LegacyVendingMachine.try3.ref.admin;

import java.util.Scanner;

import static miniProject.LegacyVendingMachine.try3.ref.admin.Product.*;
import static miniProject.LegacyVendingMachine.try3.ref.admin.Product.stock;

public class AdminService {

    public void adminService() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("관리자 페이지 입니다.");
            System.out.println("1: 메뉴변경 2: 가격변경 3: 재고추가 4: 메뉴추가 5: 수익확인 (종료는 -1)");
            System.out.print("번호를 입력하세요: ");
            int adminMenuNumber = scanner.nextInt();

            int menuChangeNumber;
            int menuChangeIndex;

            if (adminMenuNumber == 1) {
                //메뉴변경
                System.out.print("변경하실 메뉴 번호를 입력하세요(1~3): ");
                menuChangeNumber = scanner.nextInt();
                menuChangeIndex = menuChangeNumber - 1;

                System.out.print(product[menuChangeIndex] + "를(을) 무엇으로 바꾸시겠습니까?: ");
                product[menuChangeIndex] = scanner.next();

                System.out.print(product[menuChangeIndex] + "의 가격은 얼마 입니까?: ");
                price[menuChangeIndex] = scanner.nextInt();

                System.out.print(product[menuChangeIndex] + "의 재고를 몇 개 등록하시겠습니까?: ");
                stock[menuChangeIndex] = scanner.nextInt();

                System.out.println("메뉴 변경이 완료되었습니다!");
                System.out.println();

            } else if (adminMenuNumber == 2) {
                //가격변경
                System.out.print("가격을 변경하실 메뉴 번호를 입력하세요(1~3): ");
                menuChangeNumber = scanner.nextInt();
                menuChangeIndex = menuChangeNumber - 1;

                System.out.print(product[menuChangeIndex] + "의 가격을 얼마로 바꾸시겠습니까?: ");
                price[menuChangeIndex] = scanner.nextInt();

                System.out.println("가격 변경이 완료되었습니다!");
                System.out.println();

            } else if (adminMenuNumber == 3) {
                //재고추가
                System.out.print("재고를 변경하실 메뉴 번호를 입력하세요(1~3): ");
                menuChangeNumber = scanner.nextInt();
                menuChangeIndex = menuChangeNumber - 1;

                System.out.print(product[menuChangeIndex] + "의 재고를 몇 개로 바꾸시겠습니까?: ");
                price[menuChangeIndex] = scanner.nextInt();

                System.out.println("재고 변경이 완료되었습니다!");
                System.out.println();

            } else if (adminMenuNumber == 4) {
                // 배열이 꽉 찼는지 확인
                if (product[MAX_PRODUCT - 1] != null) {
                    System.out.println("더 이상 메뉴를 추가할 수 없습니다! (최대 5개까지 저장 가능)");
                    System.out.println();
                }

                //메뉴추가 (배열에 최대 5개까지만 저장 가능)
                System.out.print("추가하실 메뉴의 이름을 입력하세요: ");
                String newProduct = scanner.next();

                System.out.print("추가하실 메뉴의 가격을 입력하세요: ");
                int newPrice = scanner.nextInt();

                System.out.print("추가하실 메뉴의 재고를 입력하세요: ");
                int newStock = scanner.nextInt();

                // 배열에 새로운 메뉴 추가
                for (int i = 0; i < MAX_PRODUCT; i++) {
                    if (product[i] == null) {
                        product[i] = newProduct;
                        price[i] = newPrice;
                        stock[i] = newStock;

                        System.out.println("메뉴 추가가 완료되었습니다!");
                        System.out.println();
                        break;
                    }
                }

            } else if (adminMenuNumber == 5) {
                //수익확인
                System.out.println("현재까지의 수익은 " + "원 입니다.");

            } else if (adminMenuNumber == -1) {
                //관리자메뉴 종료
                break;
            }

        }

    }

}
