package miniProject.vendingMachineV3.dto;

public record ProductDto(int productId, String productName, int price, int stock) {

    public static ProductDto allOf(int productId, String productName, int price, int stock) {
        return new ProductDto(productId,productName,price,stock);
    }

    public static ProductDto of(String productName, int price, int stock) {
        return new ProductDto(0, productName,price,stock);
    }

    //제품명, 판매수량, 판매금액, 맨 아래에 총 판매금액 출력
    public static ProductDto productSalesOf(String productName, int price) {
        return new ProductDto(0, productName, price, 0);
    }


    public static ProductDto stockOf(int stock) {
        return new ProductDto(0, null,0,stock);
    }

    @Override
    public String toString() {
        return " " + productId + " \t\t " + productName + " \t " + price + " \t " + stock;
    }

}
