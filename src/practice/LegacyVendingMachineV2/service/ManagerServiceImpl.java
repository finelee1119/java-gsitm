package practice.LegacyVendingMachineV2.service;

import practice.LegacyVendingMachineV2.myInterface.ManagerInterface;

public class ManagerServiceImpl implements ManagerInterface {
    @Override
    public void enterMenu() {
        System.out.println("관리자 메뉴 - 메뉴 등록");
    }

    @Override
    public void deleteMenu() {
        System.out.println("관리자 메뉴 - 메뉴 삭제");
    }

    @Override
    public void updateMenu() {
        System.out.println("관리자 메뉴 - 메뉴 수정");
    }

    @Override
    public void enterStock() {
        System.out.println("관리자 메뉴 - 재고 등록");
    }

}
