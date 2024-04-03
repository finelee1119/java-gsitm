package java.miniProject.vendingMachineV3.dto;

public record UserDto(String id, String pw, String userName, String tel) {
    

    public static UserDto allOf(String id, String pw, String userName, String tel) {
        return new UserDto(id,pw,userName,tel);
    }

    //회원아이디, 회원명, 구매금액, 충전잔액
    public static UserDto userSalesOf(String id, String userName, int balance) {
        return new UserDto(id, null, userName, null);
    }



    @Override
    public String toString() {
        return id + "   \t " + pw + "    \t " + userName + " \t " + tel;
    }
}
