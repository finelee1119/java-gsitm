package miniProject.vendingMachineV3.dto;

public record UserDto(String id, String pw, String userName, String tel) {


    public static UserDto allOf(String id, String pw, String userName, String tel) {
        return new UserDto(id,pw,userName,tel);
    }

    public String getId() {
        return id;
    }


}
