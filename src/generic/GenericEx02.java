package generic;

class Tiger {
    String name = "호랑이";
}

class Lion {
    String name = "사자";
}

class BigBasket<T> {
    T data;
}

public class GenericEx02 {
    public static void main(String[] args) {
        BigBasket<Tiger> bigBasket1 = new BigBasket<>();
        bigBasket1.data = new Tiger();
        System.out.println(bigBasket1.data.name);

        BigBasket<Lion> bigBasket2 = new BigBasket<>();
        bigBasket2.data = new Lion();
        System.out.println(bigBasket2.data.name);
    }
}
