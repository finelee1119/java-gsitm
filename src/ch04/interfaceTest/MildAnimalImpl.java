package ch04.interfaceTest;

public abstract class MildAnimalImpl implements MoveAndHideInterface {

    public abstract void gather();

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
