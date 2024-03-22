package ch06;

public class EqualTest {
    public static void main(String[] args) {
        Person person1 = new Person("파이리",30);
        Person person2 = new Person("파이리",30);

        System.out.println(person1);
        System.out.println(person2);


        System.out.println("==========================================");

        // 테스트1
        int a = 3;
        int b = 3;

        if (a == b) {
            System.out.println("1. a와 b는 같다.");
        } else {
            System.out.println("1. a와 b는 같지 않다.");
        }

        // 테스트2
        String str1 = "홍길동";
        String str2 = "홍길동";

        if (str1 == str2) { // String 비교는 하도 자주 쓰니 ==로 비교하는 것도 허용
            System.out.println("2. str1과 str2는 같다.");
        } else {
            System.out.println("2. str1과 str2는 같지 않다.");
        }

        // 테스트3
        String str3 = new String("홍길동");
        String str4 = new String("홍길동");

        if (str3 == str4) {
            System.out.println("3. str3과 str4는 같다.");
        } else {
            System.out.println("3. str3과 str4는 같지 않다.");
        }

        // 테스트4
        String str5 = new String("홍길동");
        String str6 = new String("홍길동");

        if (str5.equals(str6)) {
            System.out.println("4. str5와 str6은 같다.");
        } else {
            System.out.println("4. str5와 str6은 같지 않다.");
        }

        // 테스트5
        if (person2.equals(person1.name)) {
            System.out.println("5. 같다.");
        } else {
            System.out.println("5. 같지 않다.");
        }

        // 테스트6
        if (person2.equals(person1)) {
            System.out.println("6. 같다.");
        } else {
            System.out.println("6. 같지 않다.");
        }


        // 결론 : 다 등호로 비교하되, 객체로 만든 건 equals로 비교하자
    }
}
