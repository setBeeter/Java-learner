package Test03;

public class Test {
    public static void main(String[] args) {
//        paly p = new paly();
//        p.PlayGame();
        //匿名内部类实现接口
        methon(
                new IPlay(){
            @Override
            public void PlayGame() {
                System.out.println("正在打游戏");
            }
        }

        );



    }

    public static void methon(IPlay i) {
        i.PlayGame();

    }

}
