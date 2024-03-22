package ch04.interfaceTest;

public class Monkey extends MildAnimalImpl{
    
    @Override
    public void gather() {
        System.out.println("바나나 채집");
    }

    @Override
    public String hide() {
        return "나무 위로 숨기";
    }
}
