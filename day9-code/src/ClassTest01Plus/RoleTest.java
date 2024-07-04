package ClassTest01Plus;

public class RoleTest {
    public static void main(String[] args) {
        //创建对象
       Role r1 = new Role("乔峰",100,'男');
       Role r2 = new Role("鸠摩智",100,'男');

       r1.show();
       r2.show();
        System.out.println();



        //开始攻击
        while (true) {
            r1.fight(r2);
            System.out.println();
            if ((r2.getBlood()) == 0) {
                System.out.println(r1.getName() + "KO" + r2.getName());
                break;
            }
            r2.fight(r1);
            System.out.println();
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO" + r1.getName());
                break;
            }


        }
    }


}
