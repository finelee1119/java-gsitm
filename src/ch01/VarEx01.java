package ch01;

//int intNum02 = 30;

public class VarEx01 {

    static int n2 = 30;

    public static void main(String[] args) {
//      변수의 선언
        boolean booleanTrue = true;
        boolean booleanFalse = false;
        int intNumber = 0;
        intNumber = intNumber + 1;

        double doubleNumber = 100.1;
        char charString = '가';

        double resultNum = intNumber + doubleNumber;
        System.out.println("resultNum = " + resultNum);

        int resultNumInt = (int)(intNumber + doubleNumber);

        System.out.println("n2 = " + n2);

        System.out.println("boolean b1 = " + booleanTrue);
        System.out.println("int n1 = " + intNumber);
        System.out.println("double d1 = " + doubleNumber);

        charString = '나';

        System.out.println("char c1 = " + charString);
    }
}
