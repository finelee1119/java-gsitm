package ch05_OOP2.compositionAndExtends;

public class ChickenHamburger{
    Hamburger hamburger;
    String name = "치킨 햄버거";
    public ChickenHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
}
