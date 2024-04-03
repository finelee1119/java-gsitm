package java.ch03_operator;

public class OperEx05 {
    public static void main(String[] args) {
        // 삼항연산자 = 조건연산자
        int n1 = 5;

        // 조건? 참일때 : 거짓일때;
        System.out.println(n1==5 ? "5가 맞습니다." : "5가 아닙니다.");
        
        // 연습문제
        int point = 59;

        System.out.println(point >= 60 ? "pass" : "fail");

        boolean passOrFail = (point >= 60 ? true : false);
        if (passOrFail) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        // 나머지 연산자 %
        System.out.println(130/100); // 몫 1
        System.out.println(130%100); // 나머지 30
    }
}
