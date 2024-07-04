package Test02;

public class NewPhone extends Phone implements IPlay{


    @Override
    public void PlayGame() {
        System.out.println("正在玩游戏");
    }
}
