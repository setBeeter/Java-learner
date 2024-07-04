package Demo2;

import java.util.concurrent.Callable;

public class Test {
    /*
    根据需求完成代码:

	4.定义测试类(完成以下打印效果):
		keepPet(Dog dog,String somethind)方法打印内容如下：
			年龄为30岁的老王养了一只黑颜色的2岁的狗
			2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
		keepPet(Cat cat,String somethind)方法打印内容如下：
			年龄为25岁的老李养了一只灰颜色的3岁的猫
			3岁的灰颜色的猫眯着眼睛侧着头吃鱼
	5.思考：
		1.Dog和Cat都是Animal的子类，以上案例中针对不同的动物，定义了不同的keepPet方法，过于繁琐，能否简化，并体会简化后的好处？
		2.Dog和Cat虽然都是Animal的子类，但是都有其特有方法，能否想办法在keepPet中调用特有方法？
     */

    public static void main(String[] args) {
        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"灰");
        Person p = new Person("老王",30);
        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼干");


    }
}
