package miniProject.vendingMachineV3.view;

public class PrintInfo {
    public static void productTitle() {
        String str;
        str = String.format("번호 \t 제품명 \t 가격 \t 재고 \t ");
        System.out.println(str);
    }

    public static void userTitle() {
        String str;
        str = String.format("아이디 \t 비밀번호 \t 회원명 \t 전화번호 \t ");
        System.out.println(str);
    }

    public static void line() {
        System.out.println("======================================================");
    }
}
