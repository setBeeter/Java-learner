package Demo2;

public class Person {
    /*
    3.定义Person类//饲养员
		属性：
			姓名，年龄

		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法
     */
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
    //行为：
    //			keepPet(Dog dog,String something)方法
    //				功能：喂养宠物狗，something表示喂养的东西
    //年龄为30岁的老王养了一只黑颜色的2岁的狗
    public void keepPet(Animal a, String somthing){
        if (a instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(somthing);
        }
        else if (a instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
            c.eat(somthing);
        }
        else {
            System.out.println("没有此类型");
        }

    }
   /* //年龄为25岁的老李养了一只灰颜色的3岁的猫
    public void keepPet(Cat c, String somthing){

    }*/

}
