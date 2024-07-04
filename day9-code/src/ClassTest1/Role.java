package ClassTest1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法用于攻击别人
    //谁攻击谁
    // Role r1 =new Role();
    //Role r1 =new Role();
    //r1攻击r2
    //r1调用fight(r2)

    public void fight(Role role){
        //计算造成伤害
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        //计算剩余血量
        int remain =role.blood-hurt;
        if (remain>0){
          remain=role.blood-hurt;
        }
        else {
            remain=0;
        }
        //修改被攻击者的血量
        role.setBlood(remain);

        System.out.println(this.getName()+"举起拳头,打了"+role.getName()+"一下,造成了"+hurt+"点伤害,"
                +role.getName()+"还剩下"+role.getBlood()+"点血");

    }


}
