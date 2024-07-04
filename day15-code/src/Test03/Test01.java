package Test03;

public class Test01 {
    public static void main(String[] args) {
        //匿名内部类的实现方法
//        method(new Fun(){
//            @Override
//            public void fun() {
//                System.out.println("抽象类中的fun方法");
//            }
//        });


        //继承子类的实现方法
        Fun1 fun1 = new Fun1();
        method(fun1);
    }

    public static void method(Fun f){
        f.fun();
    }
}
