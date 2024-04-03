package java.dbConnect.telApp.test;

public class RecordTestMain {
    public static void main(String[] args) {
//        Person person = new Person("파이리",30);
//        System.out.println(person);
//
//        Person person1 = new Person("파이리",30);
//        Person person2 = new Person("파이리",32);
//
//        if (person.equals(person1)) {
//            System.out.println("같다.");
//        } else {
//            System.out.println("같지 않다.");
//        }

        BookEntity book = new BookEntity(1,"Adam",10,"서울");
        System.out.println(book.toString());
        System.out.println("=================entity===================");

        BookDto dto = BookDto.of(
                book.getId(),
                book.getName(),
                book.getAge(),
                book.getAddr()
        );
        System.out.println(dto);
        System.out.println("=================dto=====================");


        BookDto dto2 = BookDto.from(book);
        System.out.println(dto2);
        System.out.println("=================dto2=====================");


        BookEntity entity = dto2.toEntity();
        System.out.println(entity);
        System.out.println("=================entity=====================");


    }
}
