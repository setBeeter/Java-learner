package Test02;

public class Test  {
    public static void main(String[] args) {
        Phone p = new Phone();
        OldPhone op = new OldPhone();
        NewPhone np = new NewPhone();
//        usePhone(op);
       usePhone(np);


    }
    //使用手机的方法
    public static void usePhone(Phone p){
        if (p instanceof NewPhone np){
           np.call();
           np.sendMessage();
           np.PlayGame();
        }
        else if (p instanceof OldPhone op){
            op.call();
            op.sendMessage();
        }




    }
}
