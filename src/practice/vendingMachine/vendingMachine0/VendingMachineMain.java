package practice.vendingMachine.vendingMachine0;

public class VendingMachineMain {
    static int totalMoney = 0;
    public static void main(String[] args) {
//        ColaVendingMachine colaVendingMachine = new ColaVendingMachine();
//
//        colaVendingMachine.insertMoney(1000);
//        colaVendingMachine.insertMoney(500);
//
//        colaVendingMachine.serveCola();
//        System.out.println("현재 수익은 " + totalMoney + "원 입니다.");
//
//
//        System.out.println("----------------------------------------------");
//
//        CiderVendingMachine ciderVendingMachine = new CiderVendingMachine();
//
//        ciderVendingMachine.insertMoney(800);
//
//        ciderVendingMachine.serveCider();
//        System.out.println("현재 수익은 " + totalMoney + "원 입니다.");

        VMachine colaMachine = new VMachine();
        VMachine ciderMachine = new VMachine();

        colaMachine.name = "콜라";
        colaMachine.productPrice = 600;
        colaMachine.insertMoney(1000);
        colaMachine.serveCola();
        System.out.println("현재 수익은 " + totalMoney + "원 입니다.");

        System.out.println("-----------------------------------------");

        ciderMachine.name = "사이다";
        ciderMachine.productPrice = 900;
        ciderMachine.insertMoney(2000);
        ciderMachine.serveCola();
        System.out.println("현재 수익은 " + totalMoney + "원 입니다.");
    }
}
