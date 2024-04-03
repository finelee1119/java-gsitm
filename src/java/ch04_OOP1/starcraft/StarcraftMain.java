package java.ch04_OOP1.starcraft;

public class StarcraftMain {
    public static void main(String[] args) {
        ProtosUnit z1 = new Zealot();
        ProtosUnit d1 = new Dragoon();
        DarkTemplar dt1 = new DarkTemplar();
        Reaver r1 = new Reaver();

        z1.basicAttack(d1);
        d1.basicAttack(z1);
        z1.basicAttack(dt1);
        r1.basicAttack(z1);
    }
}
