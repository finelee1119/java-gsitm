package practice.LegacyVendingMachineV2.service;

import practice.LegacyVendingMachineV2.myInterface.ManagerInterface;
import practice.LegacyVendingMachineV2.myInterface.UserInterface;

public class UserServiceImpl implements UserInterface {
    @Override
    public void insertCoin() {
        System.out.println("사용자 메뉴 - 동전 투입");
    }

    @Override
    public void returnCoin() {
        System.out.println("사용자 메뉴 - 잔돈 반환");
    }

    @Override
    public void choiceMenu() {
        System.out.println("사용자 메뉴 - 메뉴 선택");
    }
}

