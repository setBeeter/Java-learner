package test04;

public class test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setBread("波斯猫");
        c.setColor("花色");
        c.eat();
        c.catchMouse();

        Dog d = new Dog();
        d.setBreed("藏獒");
        d.setColor("黑色");
        d.ead();
        d.lookHome();
    }
}
