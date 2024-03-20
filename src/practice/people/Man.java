package practice.people;

public class Man extends People {
    //멤버변수
    private String gender;
    private String name;

    //생성자

    public Man() {
    }

    public Man(String gender) {
        this.gender = gender;
    }

    //메서드
    public String getName() {
        //외부로 값을 넘겨줄 때
        return name;
    }

    public void setName(String name) {
        //외부에서 값을 받아올 때
        this.name = name;
    }

    @Override
    public void goToArmy() {
        System.out.println("공익으로 간다.");
    }

}
