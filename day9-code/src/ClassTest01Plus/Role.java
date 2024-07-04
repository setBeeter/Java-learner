package ClassTest01Plus;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String look;

    //look的描述
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setLook(gender);
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

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return look
     */
    public String getLook() {
        return look;
    }

    public void setLook(char gender) {
        Random  r =new Random();
        if (gender=='男'){
            int index = r.nextInt(boyfaces.length);
            this.look = boyfaces[index];
        }
        //女
        else if (gender=='女'){
            int index = r.nextInt(girlfaces.length);
            this.look = girlfaces[index];

        }
        else {
            System.out.println("输入的性别有误");
        }



    }


    //展示角色姓名 血量 性别  长相

    public void show(){
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getBlood());
        System.out.println("性别为:"+getGender());
        System.out.println("长相为:"+getLook());
    }

    public void fight(Role role){
        //攻击描述
        Random r = new Random();
        int attackIndex = r.nextInt(attacks_desc.length);
        System.out.printf(attacks_desc[attackIndex],this.getName(),role.getName());
        System.out.println();
        //挨完揍,计算伤害
        //计算造成伤害
        int hurt = r.nextInt(20)+1;
        //计算剩余血量
        int remain =role.blood-hurt;
        if (remain>0){
            remain=role.blood-hurt;
        }
        else {
            remain=0;
        }

        //根据剩余的血量,来选择受伤描述
        //血量大于等于90        0描述
        //血量大于等于80小于90  1
        //血量大于等于70小于80  2
        //血量大于等于60 小于70 3
        //血量大于等于50小于60  4
        //血量大与等于[40,50)   5
        //血量       [30,40)    6
        //           [20,30)    7
        int injuredIndex=0;
        if(remain>=90){
            injuredIndex=0;
        }
        else if (remain>=80&&remain<90){
            injuredIndex=1;
        }
        else if (remain>=70&&remain<80){
            injuredIndex=2;
        }else if (remain>=60&&remain<70){
            injuredIndex=3;
        }else if (remain>=50&&remain<60){
            injuredIndex=4;
        }else if (remain>=40&&remain<50){
            injuredIndex=5;
        }else if (remain>=30&&remain<40){
            injuredIndex=6;
        }else if (remain<30){
            injuredIndex=7;
        }
        System.out.printf(injureds_desc[injuredIndex],role.getName());
        System.out.println();
        System.out.println(role.getName()+"剩余血量为"+remain);
        //更新被攻击者的血量
        role.setBlood(remain);

    }


}
