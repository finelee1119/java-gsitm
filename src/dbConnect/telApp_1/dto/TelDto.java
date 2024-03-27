package dbConnect.telApp_1.dto;

public record TelDto(int id,String name,int age,String addr,String tel) {

    public TelDto(String name, int age, String addr, String tel) {
        this(0,name, age, addr, tel);
    }

    public static TelDto allOf(int id, String name, int age, String addr, String tel) {
        return new TelDto(id,name,age,addr,tel);
    }
    public static TelDto of(String name,int age,String addr,String tel) {
        return new TelDto(name,age,addr,tel);
    }

    @Override
    public String toString() {
        return " " + id + "    \t " + name  + " \t " + age + "  \t " + addr + " \t " + tel;
    }
}
