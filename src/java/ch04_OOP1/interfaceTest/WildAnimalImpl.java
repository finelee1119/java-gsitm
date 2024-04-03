package java.ch04_OOP1.interfaceTest;

public abstract class WildAnimalImpl implements MoveInterface {

    public abstract void attack();

    public void smell() {
        System.out.println("코로 냄새 맡기");
    }
    
    @Override
    public void up() {
        System.out.println("위로 이동");
    }

    @Override
    public void down() {
        System.out.println("아래로 이동");
    }

    @Override
    public void left() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void right() {
        System.out.println("오른쪽으로 이동");
    }

}
