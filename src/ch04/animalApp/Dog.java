package ch04.animalApp;

public class Dog {
    private String name;
    private String color;
    static String type;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
}

