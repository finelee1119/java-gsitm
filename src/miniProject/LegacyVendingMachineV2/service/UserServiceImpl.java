package miniProject.LegacyVendingMachineV2.service;

import miniProject.LegacyVendingMachineV2.myInterface.UserInterface;
import miniProject.LegacyVendingMachineV2.vo.ProductVO;

import java.util.Scanner;

public class UserServiceImpl implements UserInterface {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void insertCoin() {
        int ch = 0;

        do {
            System.out.println("돈을 넣어주세요");
            System.out.println("1: 5,000원, 2: 1,000원, 3: 500원, 4: 100원");
            ch = scanner.nextInt();
        } while (ch < 1 || ch > 4);

        switch (ch) {
            case 1:
                System.out.println("투입금액: 5,000원");
                InitClazz.remainMoney += 5000;
                break;
            case 2:
                System.out.println("투입금액: 1,000원");
                InitClazz.remainMoney += 1000;
                break;
            case 3:
                System.out.println("투입금액: 500원");
                InitClazz.remainMoney += 500;
                break;
            case 4:
                System.out.println("투입금액: 100원");
                InitClazz.remainMoney += 100;
                break;
        }

        System.out.println("사용 가능 금액: " + InitClazz.remainMoney + "원");

    }

    @Override
    public void returnCoin() {

        if (InitClazz.remainMoney == 0) {
            System.out.println("반환할 금액이 없습니다.");
        } else {
            System.out.println(InitClazz.remainMoney + "원 반환 완료");
            InitClazz.remainMoney = 0;
            System.out.println("사용 가능 금액: " + InitClazz.remainMoney + "원");
        }
    }

    @Override
    public void choiceMenu() {
        // 메뉴를 보여주고 원하는 제품명 입력 받기
        InitClazz.printMenu();
        
        System.out.println("원하는 제품명을 입력하세요");
        String item = scanner.next();

        // 선택한 제품을 찾아서 출력하고 잔액과 재고를 감소시킴
        for (ProductVO product : InitClazz.lists) {  // 리스트의 제품을 차례로 꺼내서
            if (item.equals(product.getDrinkName())) { // 위에서 입력 받은 제품명과 비교
                System.out.println(
                        product.getDrinkName() + " 출력 완료"
                        + ", 남은 돈: " + (InitClazz.remainMoney - product.getDrinkPrice())
                        + ", 재고: " + (product.getDrinkStock() - 1));

                InitClazz.remainMoney -= product.getDrinkPrice();
                product.setDrinkStock(product.getDrinkStock() - 1);

                return; // 메서드 종료
            }
        }

        // 아무 제품도 등록되어 있지 않을 경우 메시지 출력
        if (InitClazz.lists.isEmpty()) {
            System.out.println("현재 자판기에 상품이 없습니다.");
            return; // 메서드 종료
        }

    }
}

