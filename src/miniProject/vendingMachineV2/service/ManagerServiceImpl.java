package miniProject.vendingMachineV2.service;

import miniProject.vendingMachineV2.myInterface.ManagerInterface;
import miniProject.vendingMachineV2.vo.ProductVO;

import java.util.Scanner;

public class ManagerServiceImpl implements ManagerInterface {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void enterMenu() {
        System.out.println("자판기 메뉴 등록");

        System.out.println("제품 이름을 입력하세요");
        String productName = scanner.next();

        System.out.println("제품의 가격?(숫자만 입력)");
        int productPrice = scanner.nextInt();

        System.out.println("재고 등록(채울 개수)");
        int productStock = scanner.nextInt();

        InitClazz.lists.add(ProductVO.of(productName, productPrice, productStock));
    }

    @Override
    public void deleteMenu() {
        InitClazz.printMenu();

        System.out.println("삭제할 제품명 입력: ");
        String productName = scanner.next();

        for(ProductVO product : InitClazz.lists){
            if(productName.equals(product.getDrinkName())){
                InitClazz.lists.remove(product);
                System.out.println(productName + " 삭제 완료");
                return;
            }
        }
        
    }

    @Override
    public void updateMenu() {
        InitClazz.printMenu();

        System.out.println("수정할 제품명 입력: ");
        String item = scanner.next();

        if (InitClazz.lists.isEmpty()) {
            System.out.println("수정할 상품이 존재하지 않습니다.");
            return;
        } else {
            boolean flag = true;
            for (ProductVO product : InitClazz.lists) {
                if (item.equals(product.getDrinkName())) {
                    System.out.println("(수정) 메뉴 이름? ");
                    product.setDrinkName(scanner.next());

                    System.out.println("(수정) 메뉴 가격?(숫자만 입력) ");
                    product.setDrinkPrice(scanner.nextInt());

                    System.out.println("(수정) 재고?(숫자만 입력) ");
                    product.setDrinkStock(scanner.nextInt());

                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("입력한 상품이 존재하지 않습니다.");
            }

        }
    }

    @Override
    public void enterStock() {
        InitClazz.printMenu();

        System.out.println("재고를 수정할 제품명 입력");
        String item = scanner.next();

        for (ProductVO product : InitClazz.lists) {
            if (item.equals(product.getDrinkName())) {
                System.out.println("(수정) 재고?(숫자만 입력) ");
                int updateStock = scanner.nextInt();
                product.setDrinkStock(product.getDrinkStock() + updateStock);

                break;
            }
        }

    }

}
