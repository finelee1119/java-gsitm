package java.dbConnect.telApp.dto;

public class TelDTO {
    private int id;
    private String name;
    private int age;
    private String address;
    private String telNum;

    public TelDTO() {}

    public TelDTO(String name, int age, String address, String telNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.telNum = telNum;
    }

    public TelDTO(int id, String name, int age, String address, String telNum) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.telNum = telNum;
    }

    public static TelDTO of(String name, int age, String address, String telNum) {
        return new TelDTO(name, age, address, telNum);
    }

    public static TelDTO allOf(int id, String name, int age, String address, String telNum) {
        return new TelDTO(id, name, age, address, telNum);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        String str;
        str = String.format("%d \t %s \t %d \t %s \t %s \t ", id, name, age, address, telNum);
        return str;
    }
}
