package ch04.interfaceTest;

public class Cow extends MildAnimalImpl{
    
    @Override
    public void gather() {
        System.out.println("풀 채집");    
    }

    @Override
    public String hide() {
        return "외양간에 숨기";
    }
}
