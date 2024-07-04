package Demo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //行为吃东西
    //2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住" +
                something+"猛吃");
    }

    //行为看家
    public void lookHome(){
        System.out.println("狗正在看家");
    }
}
