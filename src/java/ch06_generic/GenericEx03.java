package java.ch06_generic;

abstract class Ball {
    public abstract String getName();
}

class BasketBall extends Ball {
    private String name = "농구공";

    public String getName() {
        return name;
    }
}

class SoccerBall extends Ball {
    private String name = "축구공";

    public String getName() {
        return name;
    }
}

class Bag<T> {
    T ball;

    public T getBall() {
        return ball;
    }

    public void setBall(T ball) {
        this.ball = ball;
    }
}

public class GenericEx03 {
    public static Bag<? extends Ball> whatTheBall(int time) {
        if (time == 9) {
            Bag<BasketBall> bag = new Bag<>();
            bag.setBall(new BasketBall());
            return bag;
        } else if (time == 12) {
            Bag<SoccerBall> bag = new Bag<>();
            bag.setBall(new SoccerBall());
            return bag;
        }
        return null;
    }

    public static void main(String[] args) {
        Bag<? extends Ball> bag1 = whatTheBall(9);
        System.out.println(bag1.getBall().getName());

        Bag<? extends Ball> bag2 = whatTheBall(12);
        System.out.println(bag2.getBall().getName());
    }
}
