package class01;

public class Girl {
    //属性
   private String name;
   private int age;

   //构造方法
        //  空参构造方法
    public Girl (){

    }
        // 带参构造方法
    public Girl(String name,int age){
        this.age=age;
        this.name=name;
    }



   //set方法
    public void setName(String n){
        name=n;
    }

    //get
    public String getName(){
        return name;
    }





}
