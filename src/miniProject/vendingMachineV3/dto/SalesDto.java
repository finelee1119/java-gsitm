package miniProject.vendingMachineV3.dto;

public record SalesDto(int productId, String userId) {


    public static SalesDto allOf(int productId, String userId) {
        return new SalesDto(productId, userId);
    }

}
